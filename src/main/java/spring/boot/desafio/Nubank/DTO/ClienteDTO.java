package spring.boot.desafio.Nubank.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ClienteDTO {
    private String nome;
    private List<ContatoDTO> contatos;
}
