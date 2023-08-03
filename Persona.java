/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umgboca1;

/**
 *
 * @author salaz
 */
abstract class Persona {
    private String nombres, apellidos, direccion, telefono, fecha_de_Nacimiento;
    public Persona(){}
    public Persona(String nombres, String apellidos, String direccion, String telefono, String fecha_de_Nacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_de_Nacimiento = fecha_de_Nacimiento;
    }
    

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha_de_Nacimiento() {
        return fecha_de_Nacimiento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha_de_Nacimiento(String fecha_de_Nacimiento) {
        this.fecha_de_Nacimiento = fecha_de_Nacimiento;
    }
    
    protected String[] crearArrayYllenarlo(){return null;}
    protected String [] Remove(){return null;}
    protected String [] Modificar(){return null;}
    protected String [] Leer(){return null;}
    protected void actulizar(){}
}
