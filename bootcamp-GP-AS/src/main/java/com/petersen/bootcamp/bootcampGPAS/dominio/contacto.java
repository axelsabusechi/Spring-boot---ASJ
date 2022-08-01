package com.petersen.bootcamp.bootcampGPAS.dominio;

public class contacto {

    private String email;
    private String nombre;
    private String apellido;
    private String edad;

    public contacto() {
}
    public contacto(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}