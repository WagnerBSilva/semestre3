package schoolsptech.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("frases")
public class FraseController {
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @GetMapping("bom-dia")
    public String matinal(){
        return "Bom dia";
    }

    //PathVariable

    @GetMapping("bom-dia/{nome}")
    public String personalizada(@PathVariable String nome){
        return "Buenos dias muchacho " + nome + "; Você está lindo(a) como sempre!!!";
    }

    @GetMapping("bom-dia/{nome}/{sobrenome}")
    public String personalizada2(@PathVariable String nome, @PathVariable String sobrenome){
        return "Good Morning " + nome + " " + sobrenome + "; Você está lindo(a) como sempre!!!";
    }

}
