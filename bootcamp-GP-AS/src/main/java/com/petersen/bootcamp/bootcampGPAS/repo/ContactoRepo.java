package com.petersen.bootcamp.bootcampGPAS.repo;

import com.petersen.bootcamp.bootcampGPAS.dominio.contacto;

import java.util.List;

public interface ContactoRepo {

    //acciones que expone el contrato
    List<contacto> getAll();
    contacto getByEdad(String edad);
}
