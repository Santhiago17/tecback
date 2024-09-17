package br.com.fujideia.iesp.tecback.controller;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private final FilmeService filmeService;

    @GetMapping
    public List<Filme> listarTodos() {

        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Filme criarFilme(@RequestBody Filme filme) {
        return service.criarFilme(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizarFilme(@PathVariable Long id, @RequestBody Filme filmeDetalhes) {
        return ResponseEntity.ok(service.atualizarFilme(id,filmeDetalhes));
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFilme(@PathVariable Long id) {
        service.deletarFilme(id);
            return ResponseEntity.notFound().build();


    }
}
