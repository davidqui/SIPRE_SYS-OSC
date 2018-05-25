/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getList;

import com.getList.listModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author oscardiaz
 */
@Path("test")
public class getListService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<listModel> getDataInJSON() throws ClassNotFoundException, SQLException {
        ArrayList<listModel> tnm = new ArrayList<>();
        Connection con = null;
        String user = "ADMIN_DIPSE1";
        String pass = "oracle";
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", user, pass);
//        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.3:1521:orcl", user, pass);
        System.out.print("Conexion realizada");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM LISCAT");
        while (rs.next()) {
            Integer num = rs.getInt("ID_LISCAT");
            PreparedStatement stm2 = con.prepareStatement("SELECT * FROM LISTITEM WHERE ID_LISTCAT = ?");
            stm2.setInt(1, num);
            ResultSet rs2 = stm2.executeQuery();

            while (rs2.next()) {
                //System.out.println(rs2.getString("NAME_ITEM"));
            }
        }
        return null;
    }

}
