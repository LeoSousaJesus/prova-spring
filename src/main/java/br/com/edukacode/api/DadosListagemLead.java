package br.com.edukacode.api;

import jakarta.validation.constraints.NotBlank;

public record DadosListagemLead(
    String nome,
    String email,
    String telefone,
    String cpf)
{
    public record DadosListarLead(Long id, String nome, String email, String telefone) {
        public DadosListarLead(Lead lead) {
            this(
                lead.getId(), 
                lead.getNome(), 
                lead.getEmail(), 
                lead.getTelefone());
        }
    }
}





