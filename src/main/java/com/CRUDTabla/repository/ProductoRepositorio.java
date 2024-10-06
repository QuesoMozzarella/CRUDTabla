package com.CRUDTabla.repository;

import com.CRUDTabla.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    
    @Query("SELECT p FROM Producto p WHERE " +
           "CONCAT(p.id, ' ', p.nombre, ' ', p.marca, ' ', p.hechoEn, ' ', p.precio) " +
           "LIKE %:palabraClave%")
    public List<Producto> findAllByKeyword(@Param("palabraClave") String palabraClave);
}