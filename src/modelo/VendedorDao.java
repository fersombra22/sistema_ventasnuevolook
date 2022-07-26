/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fer10
 */
public class VendedorDao implements CRUD {

    Connection con;

    PreparedStatement ps;
    ResultSet rs;

    EntidadVendedor ven = new EntidadVendedor();

    conexion cn = new conexion();

    Connection acceso;

    public EntidadVendedor ValidarVendedor(String dni, String user) {
        String sql = "select *from vendedor where dni=? and user=?";
        try {
            acceso = cn.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                ven.setId(rs.getInt(1));
                ven.setDni(rs.getString(2));
                ven.setNombre(rs.getString(3));
                ven.setTelefono(rs.getString(4));
                ven.setUser(rs.getString(5));
                ven.setEstado(rs.getString(6));

            }

        } catch (Exception e) {

        }

        return ven;

    }

    @Override
    public List listar() {
        List<EntidadVendedor> lista = new ArrayList<>();
        String sql = "select * from vendedor;";

        try {
            con = cn.conectar();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                EntidadVendedor c = new EntidadVendedor();

                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setUser(rs.getString(5));
                c.setEstado(rs.getString(6));
                lista.add(c);

            }

        } catch (Exception e) {

        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into vendedor(Dni, Nombre, Telefono, User, Estado)values(?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update vendedor set Dni=?, Nombre=?, Telefono=?, User=?, Estado=? where Idvendedor=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;

    }

    @Override
    public void eliminar(int id) {

        String sql = "delete from vendedor where Idvendedor=?";

        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

}
