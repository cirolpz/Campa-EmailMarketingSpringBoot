package academy.atl.gestionclientes.services;

import academy.atl.gestionclientes.dto.ClienteSearchCriteria;
import academy.atl.gestionclientes.models.Cliente;
import academy.atl.gestionclientes.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository repository;
@Override
    public Cliente getById(Integer id){
    return repository.findById(id).get();
}

    @Override
    public void removeById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
    }
    @Override
    public List<Cliente> buscar(@RequestBody ClienteSearchCriteria searchCriteria)
    {
        String nombre= searchCriteria.getNombreCompleto();
        String email= searchCriteria.getEmail();
        String telefono= searchCriteria.getTelefono();
       return repository.buscarCliente( nombre,  email,  telefono);
    }





}
