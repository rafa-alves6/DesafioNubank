package spring.boot.desafio.Nubank.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ContatoDTO {
    private String telefone;
    private String email;
    private Long clienteId;
}
