package com.petersen.bootcamp.bootcampGPAS.repo;

import com.petersen.bootcamp.bootcampGPAS.dominio.contacto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ContactoRepoMemory {
    private List<contacto> contactos = new ArrayList<>(
            Arrays.asList(
                    new contacto(),
                    new contacto(),
                    new contacto(),
                    new contacto()
            )
    );

    @Override
    public List<contacto> getAll() {
        System.out.println("Entro al repository");
        return this.contactos;
    }

    @Override
    public contacto getByedad(String edad) {
        return this.contactos.stream()
                .filter(per -> per.getEdad().equals(edad))
                .findFirst()
                .orElse(new contacto());
    }
}
