package com.entrevista.tienda.servicio;


import com.entrevista.tienda.repositorio.EmpleadoRepositorio;
import com.entrevista.tienda.modelo.Empleado;

import java.util.*;


public interface EmpleadoServicio{

    public Optional<Empleado> getEmpleado(Integer id);
    public List<Empleado> getEmpleados();
}