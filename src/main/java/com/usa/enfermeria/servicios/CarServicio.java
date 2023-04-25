package com.usa.enfermeria.servicios;

import com.usa.enfermeria.modelos.CarModelo;
import com.usa.enfermeria.repositorios.CarInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServicio {
    @Autowired
    CarInterfaz carInterfaz;

    public Optional<CarModelo> obtenerCarPorId(int id) {
        return carInterfaz.findById(id);

    }

    public List<CarModelo> obtenerTodosCar() {
        return carInterfaz.findAll();

    }

    public void crearCar(CarModelo carModelo) {
        if (!carInterfaz.existsById(carModelo.getId())) {
            carInterfaz.save(carModelo);
        }

    }

    public void eliminarCarPorId(int id) {
        carInterfaz.deleteById(id);


    }

    public void actualizarCar(CarModelo carModelo) {
        if (carInterfaz.existsById(carModelo.getId())) {
            carInterfaz.save(carModelo);
        }

    }
}
