package com.CRUDTabla.service;

import com.CRUDTabla.entity.Producto;
import com.CRUDTabla.repository.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    @Autowired
    public ProductoServicio(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    public List<Producto> listAll(String palabraClave) {
        if (palabraClave != null && !palabraClave.isEmpty()) {
            return productoRepositorio.findAllByKeyword(palabraClave);
        }
        return productoRepositorio.findAll();
    }

    public void save(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Producto no puede ser null");
        }
        productoRepositorio.save(producto);
    }

    public Optional<Producto> get(Long id) {
        return productoRepositorio.findById(id);
    }

    public void delete(Long id) {
        productoRepositorio.deleteById(id);
    }
}