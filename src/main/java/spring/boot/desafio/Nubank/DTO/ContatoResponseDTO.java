package spring.boot.desafio.Nubank.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ContatoResponseDTO {
    private Long id;
    private String telefone;
    private String email;
    private Long clienteId;
}
