package com.usa.enfermeria.repositorios;

import ch.qos.logback.core.net.server.Client;
import com.usa.enfermeria.modelos.ClientModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoy extends JpaRepository<ClientModelo, Integer> {

}
