package com.edwingoaly.api.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.edwingoaly.api.Entities.Luchador;
import com.edwingoaly.api.Services.LuchadorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/luchadores")
public class LuchadorController {

    @Autowired
    private LuchadorService luchadorService;

    @GetMapping("")
    public List<Luchador> obtenerLuchadoresC() {
        return luchadorService.obtenerLuchadores();
    }

    @GetMapping("/{id}")
    public Luchador obtenerLuchadorPorIdC(@RequestParam Long id) {
        return luchadorService.obtenerLuchadorPorId(id);
    }

    @PostMapping("")
    public Luchador agregarLuchadorC(@RequestBody Luchador luchador) {
        return luchadorService.agregarLuchador(luchador);
    }
    

    @DeleteMapping("/{id}")
    public String eliminarPeleadorC(@PathVariable Long id) {
        return luchadorService.eliminarLuchador(id);
    }

    @PutMapping("/{id}")
    public Luchador actualizarPeleadorC(@PathVariable Long id, @RequestBody Luchador newLuchador) {
        return luchadorService.actualizLuchador(id, newLuchador);
    }
    
    
}
