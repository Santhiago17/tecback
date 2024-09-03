package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FilmeService {
    private final FilmeRepository repository;

    public List<Filme> listar(){
        return repository.findAll();
    }

    public Filme buscarPorId(Long id){
        var filme = repository.findById(id);
        if(filme.isEmpty()){
            throw new RuntimeException("Filme not found");
        }
        return filme.get();
    }

    public Filme criarFilme(Filme filme){
        return repository.save(filme);
    }
    public void deletarFilme(Long id){
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Filme not found");
        }
    }
}
