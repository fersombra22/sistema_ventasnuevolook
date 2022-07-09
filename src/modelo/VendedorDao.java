/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author fer10
 */
public class VendedorDao {

    PreparedStatement ps;
    ResultSet rs;

    EntidadVendedor ven = new EntidadVendedor();

    conexion con = new conexion();

    Connection acceso;

    public EntidadVendedor ValidarVendedor(String dni, String user) {
        String sql = "select *from vendedor where dni=? and user=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while (rs.next()){
                ven.setId(rs.getInt(1));
                ven.setDni(rs.getString(2));
                ven.setNombre(rs.getString(3));
                ven.setTelefono(rs.getString(4));
                ven.setEstado(rs.getString(5));
                ven.setUser(rs.getString(6))
                        ;
            }

        } catch (Exception e) {

        }

        return ven;

    }

}
