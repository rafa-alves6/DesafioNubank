package spring.boot.desafio.Nubank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.desafio.Nubank.DTO.ClienteDTO;
import spring.boot.desafio.Nubank.DTO.ClienteResponseDTO;
import spring.boot.desafio.Nubank.Model.Cliente;
import spring.boot.desafio.Nubank.Model.Contato;
import spring.boot.desafio.Nubank.Repository.ClienteRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        if(dto.getContatos() != null && dto.getContatos().size() > 0) {
            List<Contato> contatos = dto.getContatos().stream().map(c -> {
                Contato contato = new Contato();
                contato.setTelefone(c.getTelefone());
                contato.setEmail(c.getEmail());
                contato.setCliente(cliente);
                return contato;
            }).collect(Collectors.toList());
            cliente.setContatos(contatos);
        }
        return clienteRepository.save(cliente);
    }

    public List<ClienteResponseDTO> listarTodos() {
        return clienteRepository.findAll().stream().map();
    }

    private ClienteResponseDTO toDTO(Cliente cliente) {
        ClienteResponseDTO dto = new ClienteResponseDTO();
        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());

    }
}
