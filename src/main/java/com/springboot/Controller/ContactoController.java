package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Entidades.Contacto;
import com.springboot.Repository.ContactoRepository;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> getAllContactos() {
        return contactoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contacto getContactoById(@PathVariable Long id) {
        return contactoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Contacto createContacto(@RequestBody Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @DeleteMapping("/{id}")
    public void deleteContacto(@PathVariable Long id) {
        contactoRepository.deleteById(id);
    }
}