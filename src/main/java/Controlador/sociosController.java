/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.socios;
import Modelo.sociosDaos;
import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Usuario
 */
//@webServlet(name ="sociosController", urlPatterns = {"/sociosController"})

public class sociosController extends HttpServlet
{
   public sociosController()
   {
       super();
   }
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException
   {
       sociosDaos sociosDaos=null;
       sociosDaos=new sociosDaos();
       
       String accion;
       RequestDispatcher dispatcher=null;
       
       accion=request.getParameter("accion");
       
       if(accion==null || accion.isEmpty())
       {
           dispatcher=request.getRequestDispatcher("Vistas/Socios.jsp");           
       }
       else if(accion.equals("Modificar"))
       {
            dispatcher=request.getRequestDispatcher("Vistas/Modificar.jsp");
       }
       else if(accion.equals("actualizar"))
       {
            int id=Integer.parseInt(request.getParameter("idSocio"));
            String nombre=request.getParameter("Nombre");
            String apellido=request.getParameter("Apellido");
            String direccion=request.getParameter("direccion");
            String localidad=request.getParameter("localidad");            
            LocalDate FNac =LocalDate.parse(request.getParameter("FNac"));                 
            String email=request.getParameter("Email");
            String telefono=request.getParameter("Telefono");
            
            socios s1=new socios(id,nombre,apellido,direccion,localidad,FNac,email,telefono,true);
            sociosDaos.actualizarSocio(s1);
            
            dispatcher=request.getRequestDispatcher("Vistas/Socios.jsp");       
            
            }
            else if(accion.equals("Eliminar"))
            {
		int id=Integer.parseInt(request.getParameter("id"));
                sociosDaos.eliminarSocio(id);			
		dispatcher=request.getRequestDispatcher("Vistas/Socios.jsp");
            }
            else if(accion.equals("Nuevo"))
            {
		dispatcher=request.getRequestDispatcher("Vistas/Nuevo.jsp");
            }
            else if(accion.equals("insertar"))
            {
		String nombre=request.getParameter("nombre");
                String apellido=request.getParameter("apellido");
                String direccion=request.getParameter("direccion");
                String localidad=request.getParameter("localidad");            
                LocalDate fecha =LocalDate.parse(request.getParameter("fnac"));                 
                String email=request.getParameter("mail");
                String telefono=request.getParameter("telefono");                                     
                socios s1=new socios(0,nombre,apellido,direccion,localidad,fecha,email,telefono,true);
		sociosDaos.insertarSocio(s1);		
		dispatcher=request.getRequestDispatcher("Vistas/Socios.jsp");
            }        
            dispatcher.forward(request, response); 
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        doGet(request,response);
    }

   
    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}






