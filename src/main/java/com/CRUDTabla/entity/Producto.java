package com.CRUDTabla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false, length = 60)
    private String nombre;
    
    @Column(nullable = false, length = 60)
    private String marca;
    
    @Column(nullable = false, length = 60)
    private String hechoEn;
    
    @Column(nullable = false, length = 60)
    private float precio;

    
}