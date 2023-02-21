package schoolsptech.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private List<String> pokemon = new ArrayList<>();

    @GetMapping
    public Integer contarPokemon(){
        return pokemon.size();
    }

    @GetMapping("/cadastrar/{pokemonName}")
    public String adicionarPokemon(@PathVariable String pokemonName){
        pokemon.add(pokemonName);
        return pokemonName;
    }

    @GetMapping("/recuperar/{indice}")
    public String buscarPorIndice(@PathVariable Integer indice){
        for (int i = 0; i < pokemon.size() ; i++) {
            if(i == indice){
                return pokemon.get(i);
            }
        }
        return "não encontrado";
    }

    @GetMapping("/excluir/{indice}")
    public String excluirPorIndice(@PathVariable Integer indice){
        String fraseOne = "Pokemon excluido";
        String fraseTwo = "Pokemon não encontrado";
        for (int i = 0; i < pokemon.size(); i++) {
            if(i == indice) {
                pokemon.remove(i);
                return fraseOne;
            }
        }
        return fraseTwo;
    }



}
