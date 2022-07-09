/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fer10
 */
public class conexion {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/ventas_nuevolook?useSSL=false";
    String user = "root";
    String pass = "root";
    
    

    public Connection conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {

        }

        return con;
    }

}
