package academy.atl.gestionclientes.services;

import academy.atl.gestionclientes.dto.ClienteSearchCriteria;
import academy.atl.gestionclientes.models.Cliente;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface IClienteService {
    public Cliente getById(Integer id);

    public void removeById(Integer id);

    public void save(Cliente cliente);
    public List<Cliente> buscar(ClienteSearchCriteria searchCriteria);

}


