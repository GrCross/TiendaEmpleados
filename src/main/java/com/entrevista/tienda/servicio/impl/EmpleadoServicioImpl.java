package com.entrevista.tienda.servicio.impl;



import java.util.*;

import com.entrevista.tienda.modelo.Empleado;
import com.entrevista.tienda.repositorio.EmpleadoRepositorio;
import com.entrevista.tienda.servicio.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entrevista.tienda.servicio.EmpleadoServicio;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

    @Autowired
    EmpleadoRepositorio empleadoRepositorio;

    @Override
    public Optional<Empleado> getEmpleado(Integer id){

        return empleadoRepositorio.findById(id);
    }
    @Override
    public List<Empleado> getEmpleados(){

        return empleadoRepositorio.findAll();
    }
}