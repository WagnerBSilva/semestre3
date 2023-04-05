package school.sptech.locadora.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.locadora.entity.Filme;
import school.sptech.locadora.repository.FilmeRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {


    @Autowired
    private FilmeRepository filmeRepository;

    @PostMapping
    public ResponseEntity<Filme> cadastrar(@RequestBody Filme novoFilme){
        var filmeBank = filmeRepository.save(novoFilme);
        if(filmeBank != null){
        return ResponseEntity.status(201).body(novoFilme);
        }
        return ResponseEntity.status(400).build();
    }

    @GetMapping
    public ResponseEntity<List<Filme>> list() {
        List<Filme> filmes = this.filmeRepository.findAll();

        if (filmes.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> getById (@PathVariable Long id){
        return ResponseEntity.of(this.filmeRepository.findById(id));
    }

    @GetMapping("/titulo")
    public ResponseEntity<Filme> getByTitulo (@RequestParam String nome){

        return ResponseEntity.of(this.filmeRepository.findByTitulo(nome));
    }
//        List<Filme> filmes = filmeRepository.findAll();
//
//        for (Filme filmeDaVez: filmes){
//            if ((filmeDaVez.getTitulo().equals(nome))){
//                return ResponseEntity.status(200).body(filmeDaVez);
//            }
//        }
//        return ResponseEntity.status(400).build();
//    }

    @GetMapping("/diretor")
    public ResponseEntity<List<Filme>> getByDiretor (@RequestParam String nome){

        List<Filme> filmesFiltrados = this.filmeRepository.findByDiretorIgnoreCase(nome);

        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(filmesFiltrados);

        //        List<Filme> filmes = filmeRepository.findAll();
//        for (Filme filmeDaVez: filmes){
//            if ((filmeDaVez.getDiretor().equals(nome))){
//                return ResponseEntity.status(200).body(filmeDaVez);
//            }
//        }
//        return ResponseEntity.status(400).build();
    }


    @GetMapping("/periodo")
    public ResponseEntity<List<Filme>> buscarPorData(@RequestParam LocalDate dataInformada){
        List<Filme> filmesFiltrados = this.filmeRepository.findByDataLancamentoLessThanEqual(dataInformada);


        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmesFiltrados);
    }

    @GetMapping("/indicados")
    public ResponseEntity<List<Filme>> findByOscar(){
        List<Filme> filmesFiltrados = this.filmeRepository.findByIndicacaoOscarTrue();

        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmesFiltrados);
    }

    @GetMapping("/indicados/nao-indicados")
    public ResponseEntity<Integer> findByNowOscar(){
        int contador = this.filmeRepository.countByIndicacaoOscarFalse();

        return ResponseEntity.status(200).body(contador);
    }

    @GetMapping("/custo-producao")
    public ResponseEntity<List<Filme>> findByCustor(@RequestParam Double custo){
        List<Filme> filmesFiltrados = this.filmeRepository.findByCustoProducaoGreaterThanEqual(custo);

        if(filmesFiltrados.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(filmesFiltrados);
    }

}