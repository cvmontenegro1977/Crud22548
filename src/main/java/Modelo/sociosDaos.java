/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class sociosDaos 
{
    Connection conexion;
    
    public sociosDaos() 
    {
        conexion con=new conexion();
        conexion=con.getConnection();
        
    }
    
    public List<socios> listarSocios()
    {
        PreparedStatement ps;
        ResultSet rs;
        List<socios> lista=new ArrayList<>();
            
        try
        {
            ps=conexion.prepareStatement("select * from socios");
            rs=ps.executeQuery();
                
                
            while(rs.next())
            {
                int id=rs.getInt("idSocio");
                String nombre=rs.getString("nombre");
                String Apellido=rs.getString("Apellido");
                String direccion=rs.getString("direccion");
                String localidad=rs.getString("localidad");
                LocalDate FNac=rs.getDate("FNac").toLocalDate();
                String email=rs.getString("email");
                String Telefono=rs.getString("Telefono");
                boolean Activo=rs.getBoolean("Activo");
                socios s1=new socios(id,nombre,Apellido,direccion,localidad,FNac,email,Telefono,Activo);
                lista.add(s1);
            } 
            return lista;
                            
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return null;
        }
        
            
    }
        
        
    public socios mostrarSocio(int _id)
    {
        PreparedStatement ps;
        ResultSet rs;
        socios s1=null;
            
        try
        {
            ps=conexion.prepareStatement("SELECT * from socios where idSocio=?");
            ps.setInt(1,_id);                
            rs=ps.executeQuery();
                
            while(rs.next())
            {
                int id=rs.getInt("idSocio");
                String nombre=rs.getString("nombre");
                String Apellido=rs.getString("Apellido");
                String direccion=rs.getString("direccion");
                String localidad=rs.getString("localidad");
                LocalDate FNac=rs.getDate("FNac").toLocalDate();
                String email=rs.getString("email");
                String Telefono=rs.getString("Telefono");
                boolean Activo=rs.getBoolean("Activo");
                
                s1=new socios(id,nombre,Apellido,direccion,localidad,FNac,email,Telefono,Activo);                   
            }
            return s1;
                                     
        }
        catch(SQLException e)
            {
                System.out.println(e);
                return null;
            }
        }
    public boolean insertarSocio(socios s1)
    {
        PreparedStatement ps;
        try
        {
            ps=conexion.prepareStatement("insert into socios(nombre,Apellido,direccion,localidad,FNac,email,Telefono,Activo) values(?,?,?,?,?,?,?,true)"); 
            ps.setString(1,s1.getNombre());
            ps.setString(2,s1.getApellido());
            ps.setString(3,s1.getDireccion());
            ps.setString(4,s1.getLocalidad());
            ps.setObject(5,s1.getFNac());
            ps.setString(6,s1.getEmail());
            ps.setString(7,s1.getTelefono());
            ps.setBoolean(8,s1.getActivo());
            ps.execute();
            return true;
        }
        catch(SQLException e)
            {
                System.out.println(e);
                return false;
            }
        
    }
          
    public boolean actualizarSocio(socios s1)
    {
        PreparedStatement ps;
        try
        {
            ps=conexion.prepareStatement("update socios set nombre=?,apellido=?,direccion=?,localidad=?,FNac=?,email=?,telefono=?,activo=? where idSocio=?"); 
            ps.setString(1,s1.getNombre());
            ps.setString(2,s1.getApellido());
            ps.setString(3,s1.getDireccion());
            ps.setString(4,s1.getLocalidad());
            ps.setObject(5,s1.getFNac());
            ps.setString(6,s1.getEmail());
            ps.setString(7,s1.getTelefono());
            ps.setBoolean(8,s1.getActivo());
            ps.setInt(9,s1.getIdSocio());
            ps.execute();
            return true;
        }
        catch(SQLException e)
            {
                System.out.println(e);
                return false;
            }
        
    }    
    
    
    public boolean eliminarSocio(int _id)
    {
        PreparedStatement ps;
        try
        {
            ps=conexion.prepareStatement("delete from socios where id=?"); 
            ps.setInt(1,_id);
                      
            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }
        
    }
        
}


 







