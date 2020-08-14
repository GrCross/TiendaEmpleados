package com.entrevista.tienda.controller;

import com.entrevista.tienda.modelo.Empleado;
import com.entrevista.tienda.servicio.EmpleadoServicio;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrevista")
public class EmpleadoController{


    @Autowired
    EmpleadoServicio empleadoServicio;

    @RequestMapping(value = "/empleado", method = RequestMethod.GET)
    public ResponseEntity<List<Empleado>> recursoConsultarUsuarios() throws Exception {
        try {
            List<Empleado> Empleados = empleadoServicio.getEmpleados();
            return new ResponseEntity<>(Empleados, HttpStatus.OK);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }



}