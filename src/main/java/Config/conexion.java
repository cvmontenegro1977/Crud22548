/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.*;


public class conexion //clase
{
    public String driver="com.mysql.jdbc.Driver"; //atributo
    
    public Connection getConnection() //método
    {
        Connection conexion=null;
        try
        {
            Class.forName(driver);
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud22548","root","");
            
        }
        catch(ClassNotFoundException| SQLException e)
        {
            System.out.println(e);               
        }        
        return conexion;
    }
    
    
    public static void main(String[] args) throws SQLException
    {
        Connection conexion=null;
        conexion con=new conexion();
        conexion=con.getConnection();
        
        
        PreparedStatement ps;  //consulta sql prebildeada//
        ResultSet rs;          // es similar a Array bidimensional// se guarda el resultado completo de la consulta que se hace.  
        ps=conexion.prepareStatement("select * from socios");
        
        rs=ps.executeQuery();
        
        while(rs.next())
        {
            int id=rs.getInt("idSocio");
            boolean estado=rs.getBoolean("Activo");
            //String apellido=rs.getString("apellido");
            System.out.println("ID: "+id+" Estado: " +estado);            
        }
    }    
}








