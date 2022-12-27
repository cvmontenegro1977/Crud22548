/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;




/**
 *
 * @author MOntenegro_Carla_Valeria
 */
public class socios
{
  private int idSocio;
  private String nombre;
  private String Apellido;
  private String direccion;
  private String localidad;
  private LocalDate FNac;
  private String email;
  private String Telefono;
  private Boolean Activo;

    public socios(int idSocio, String nombre, String Apellido, String direccion, String localidad, LocalDate FNac, String email, String Telefono, Boolean Activo) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.direccion = direccion;
        this.localidad = localidad;
        this.FNac = FNac;
        this.email = email;
        this.Telefono = Telefono;
        this.Activo = Activo;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFNac() {
        return FNac;
    }

    public void setFNac(LocalDate FNac) {
        this.FNac = FNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }
    
}


