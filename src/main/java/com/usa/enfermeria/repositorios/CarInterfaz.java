package com.usa.enfermeria.repositorios;


import com.usa.enfermeria.modelos.CarModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarInterfaz extends JpaRepository<CarModelo,Integer> {
}
