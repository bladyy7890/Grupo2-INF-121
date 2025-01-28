package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProelectricoDAO {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List listar() {
        List<Proelectrico> datos = new ArrayList();
        String sql = "select * from producto";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proelectrico p = new Proelectrico();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setMarca(rs.getString(4));
                p.setSisoperativo(rs.getString(5));
                p.setMaterial(rs.getString(6));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    public int agregar(Proelectrico p) {
        String sql = "INSERT INTO producto (nombre, precio, marca, sisoperativo, material) VALUES (?, ?, ?, ?, ?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setString(3, p.getMarca());
            ps.setString(4, p.getSisoperativo());
            ps.setString(5, p.getMaterial());
            ps.executeUpdate();
            return 1; // Retorna 1 si la operación fue exitosa
        } catch (Exception e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
            
        }
        return 1; 
    }
    
    public int Actualizar(Proelectrico p){
        String sql="UPDATE `producto` SET `nombre`=?,`precio`=?,`marca`=?,`sisoperativo`=?,`material`=? WHERE `id`=?";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setString(3, p.getMarca());
            ps.setString(4, p.getSisoperativo());
            ps.setString(5, p.getMaterial());
            ps.setInt(1, p.getId());
            ps.executeUpdate();
        }catch(Exception e){
        }
        return 1;
    }

}
