package br.com.edukacode.api;

import java.util.List;
import static java.util.stream.Collectors.toList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edukacode.api.DadosListagemLead.DadosListarLead;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lead")
public class LeadController {
@Autowired
private LeadRepository repository;
    
    @PostMapping
    public String criarLead(@RequestBody @Valid DadosCadastroLead dados) {
        // Implementação do método para criar um lead
        System.out.println("Lead criado com os dados: " + dados);
        //repository.save(new Lead(null, dados.nome(),dados.email(),dados.telefone(),dados.cpf));
        repository.save(new Lead(dados));
        return "Lead criado com sucesso!";
        
    }
    @GetMapping
    public List<DadosListarLead> listarLeads() {
        return repository.findAll()
                         .stream()
                         .map(DadosListarLead::new) // mapeia cada Lead para DadosListarLead
                         .toList();
    }
    
    @PutMapping
    public void atualizarLead() {
        // Implementação do método para atualizar um lead existente                
    }
    @DeleteMapping
    public void excluirLead() {
        // Implementação do método para excluir um lead
    }

}
