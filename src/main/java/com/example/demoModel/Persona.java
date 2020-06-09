package com.example.demoModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // indica que la clase hace referencia de la tabla en la BD
public class Persona {

    @Id // para indicar que esta variable es la pk de la tabla
    @GeneratedValue(strategy = GenerationType.AUTO) // para claves primarias que son autoincrementales
    private Long id;
    @Column // se usa para indicar campo de la tabla cuando se llaman exactamente igual
    private String nombre;
    @Column(name = "firstname") // se usa para indicar campo de la tabla, cuando no se llaman igual, se agrega con el tag name, el nombre del campo de la tabla
    private String apellidoP;
    @Column(name =  "lastname")
    private String apellidoM;
    @Column
    private String direccion;
    @Column
    private String telefono;

    public Persona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidoP='" + apellidoP + '\'' +
                ", apellidoM='" + apellidoM + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
