package com.usa.enfermeria.modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClientModelo {
    @Id
    private int id;
    private String name;
    private String email;
    private int age;

}
