/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER-LENOVO
 */
public class Autor extends Persona{
    private String biografia;
    private String nacionalidad;

    public Autor() {
        super(null, null);
    }

    public Autor(String biografia, String nacionalidad, String nombre, String apellido) {
        super(nombre, apellido);
        this.biografia = biografia;
        this.nacionalidad = nacionalidad;
    }
    
    
    public Autor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

  @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }
   
    
    
}
