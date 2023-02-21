package schoolsptech.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    private List<Heroi> herois = new ArrayList<>();

    @GetMapping
    public List<Heroi> getHerois() {
        return herois;
    };

    @GetMapping("/{indice}")
    public Heroi buscar(@PathVariable int indice){

        if (indice < herois.size()){
            return herois.get(indice);
        }
        return null;
    }

    @GetMapping("/cadastrar/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public List<Heroi> cadastrar(@PathVariable String nome, @PathVariable String habilidade,
                              @PathVariable int idade, @PathVariable int forca, @PathVariable boolean vivo){

        herois.add(new Heroi(nome, idade,habilidade,forca,vivo));

        return herois;
    }

    @GetMapping("/atualizar/{indice}/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public Heroi atualizar(@PathVariable int indice, @PathVariable String nome, @PathVariable String habilidade,
                                 @PathVariable int idade, @PathVariable int forca, @PathVariable boolean vivo){

        if (indice < herois.size()){
            herois.get(indice).setNome(nome);
            herois.get(indice).setForca(forca);
            herois.get(indice).setHabilidade(habilidade);
            herois.get(indice).setIdade(idade);
            herois.get(indice).setVivo(vivo);
        }

        return null;
    }

    @GetMapping("/excluir/{indice}")
    public String excluirPorIndice(@PathVariable Integer indice){
        String fraseOne = "Heroi excluido";
        String fraseTwo = "Heroi não encontrado";
        for (int i = 0; i < herois.size(); i++) {
            if(i == indice) {
                herois.remove(i);
                return fraseOne;
            }
        }
        return fraseTwo;
    }
}
