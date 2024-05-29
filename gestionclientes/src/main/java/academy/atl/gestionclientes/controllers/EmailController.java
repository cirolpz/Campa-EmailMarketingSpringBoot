package academy.atl.gestionclientes.controllers;

import academy.atl.gestionclientes.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @GetMapping("api/email")
    public void sendEmail()
    {
    String asunto= "";

    }

}
