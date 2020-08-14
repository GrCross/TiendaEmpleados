package com.entrevista.tienda.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entrevista.tienda.modelo.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{

}