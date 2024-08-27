package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/filme")
public class FilmeController {
    private final FilmeRepository repository;

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        return repository.save(filme);
    }

    @GetMapping
    public List<Filme>listar(){
        return repository.findAll();
    }
}
