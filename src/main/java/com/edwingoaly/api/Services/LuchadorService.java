package com.edwingoaly.api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwingoaly.api.Entities.Luchador;
import com.edwingoaly.api.Repositories.LuchadorRepository;

@Service
public class LuchadorService {

    @Autowired
    LuchadorRepository luchadorRepository;

    public List<Luchador> obtenerLuchadores() {
        return luchadorRepository.findAll();
    }

    public Luchador agregarLuchador(Luchador luchador) {
        return luchadorRepository.save(luchador);
    }

    public Luchador obtenerLuchadorPorId(Long id) {
        return luchadorRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el peleador"));
    }

    public Luchador actualizLuchador(Long id, Luchador luchador) {
        Luchador luchadorDB = luchadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el peleador"));
        luchadorDB.setName(luchador.getName());
        luchadorDB.setAge(luchador.getAge());
        return luchadorRepository.save(luchadorDB);
    }
    
    public String eliminarLuchador(Long id) {
        Luchador luchadorDB = luchadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el peleador"));        
        luchadorRepository.delete(luchadorDB);
        return "Luchador eliminado con el id" + id;
    }

}
