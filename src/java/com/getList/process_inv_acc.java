/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getList;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author oscardiaz
 */
@Path("insert")
public class process_inv_acc {

    @GET
    @Path("/get")
    public Response getbyquery(@QueryParam("cat") int cat, @QueryParam("name") String name, @QueryParam("userid") int userid) throws ClassNotFoundException, SQLException, IOException {

        String jsonString = "";
        Connection con = null;
        String user = "sesat";
        String pass = "sesat2018";
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", user, pass);
//        con = DriverManager.getConnection("jdbc:oracle:thin:@app.sinte.co:2033:DESARROLLO", user, pass);
        System.out.print("Conexion realizada \n");
        PreparedStatement p = con.prepareStatement("INSERT INTO SESAT.LISTITEM (ID, ID_LISTCAT, NAMEITEM, USUARIO_CREADOR, FECHA_CREACION, USUARIO_MODIFICADOR, FECHA_MODIFICACION) VALUES (2,?,?,?, CURRENT_TIMESTAMP, ?, CURRENT_TIMESTAMP)");
        p.setInt(1, cat);
        p.setString(2, name);
        p.setInt(3, userid);
        p.setInt(4, userid);
        p.executeUpdate();

        return Response.ok("ok").header("Access-Control-Allow-Origin", "*").build();
    }
}
