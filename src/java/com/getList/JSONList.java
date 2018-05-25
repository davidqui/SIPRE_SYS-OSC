/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getList;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author oscardiaz
 */
@Path("listas")
public class JSONList {

    @GET
    @Path("/get")
    public Response JSONData() throws ClassNotFoundException, SQLException, IOException {

        JsonObjectBuilder dataIdentifier = Json.createObjectBuilder();
        JsonObjectBuilder dataIdContent = Json.createObjectBuilder();
        JsonObjectBuilder dataNameContent = Json.createObjectBuilder();
        JsonArrayBuilder dataId = Json.createArrayBuilder();
        JsonArrayBuilder dataName = Json.createArrayBuilder();
        JsonArrayBuilder JSONcontent = Json.createArrayBuilder();
        
        String jsonString = "";
        Connection con = null;
        String user = "sesat";
        String pass = "sesat2018";
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", user, pass);
//        con = DriverManager.getConnection("jdbc:oracle:thin:@app.sinte.co:2033:DESARROLLO", user, pass);
        System.out.print("Conexion realizada \n");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM LISTCAT");
        while (rs.next()) {
            
            Integer num = rs.getInt("ID_LISTCAT");
            PreparedStatement stm2 = con.prepareStatement("SELECT * FROM LISTITEM WHERE ID_LISTCAT = ?");
            stm2.setInt(1, num);
            ResultSet rs2 = stm2.executeQuery();
            
            while (rs2.next()) {
                if(rs2.getInt("ID_LISTEM")>0){
                dataId.add(rs2.getInt("ID_LISTEM"));
                } else {
                dataId.add(0);
                }
                if(rs2.getString("NAMEITEM") != null){
                dataName.add(rs2.getString("NAMEITEM"));
                } else {
                dataId.add("No definido");
                }
            }
            
            
            JSONcontent.add(dataId);
            JSONcontent.add(dataName);
            
            dataIdentifier.add(rs.getString("IDENTIFIER"),JSONcontent);
        }
        
        JsonObject jsonObject = dataIdentifier.build();
        try (Writer writer = new StringWriter()) {
            Json.createWriter(writer).write(jsonObject);
            jsonString = writer.toString();
        }
        return Response.ok(jsonString).header("Access-Control-Allow-Origin", "*").build();
    }

}
