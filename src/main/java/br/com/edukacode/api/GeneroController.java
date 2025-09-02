package br.com.edukacode.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroRepository repository; 
    @PostMapping
    public String criarGenero(@RequestBody @Valid DadosCadastroGenero dados) {
        System.out.println("Genero criado com os dados: " + dados);
        repository.save(new Genero(dados));
        return "Genero criado com sucesso!";
        
    }
}
