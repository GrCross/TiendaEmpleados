package com.entrevista.tienda.modelo;
import javax.persistence.*;

@Entity
@Table(name="Empleado")
public class Empleado{

    @Id
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="genero")
    private String genero;
    @Column(name="cargo")
    private Integer cargo;
    @Column(name="tienda")
    private Integer tienda;


    
}