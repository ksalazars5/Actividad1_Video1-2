/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umgboca1;

import javax.swing.JOptionPane;

/**
 *
 * @author salaz
 */
public class Cliente extends Persona{
    
    private String nit;
    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_Nacimiento) {
        super(nombres, apellidos, direccion, telefono, "fecha_nacimiento");
        this.nit = nit;
    }
    

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    protected String[]crearArrayYllenarlo(){
        String datos[] = new String[6];
        datos[0] = getNit();
        datos[1] = getNombres();
        datos[2] = getApellidos();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = getFecha_de_Nacimiento();
        return datos;
    }
    
    @Override
    protected String[]Remove(){
        String datos[] = new String[6];
        datos[0] = getNit();
        datos[1] = getNombres();
        datos[2] = getApellidos();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = getFecha_de_Nacimiento();
        return datos;
    }
    protected String[]Leer(){
        String datos[] = new String[6];
        datos[0] = getNit();
        datos[1] = getNombres();
        datos[2] = getApellidos();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = getFecha_de_Nacimiento();
        return datos;
    }
}
