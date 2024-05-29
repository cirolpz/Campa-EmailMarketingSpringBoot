package academy.atl.gestionclientes.controllers;

import academy.atl.gestionclientes.models.Cliente;
import academy.atl.gestionclientes.services.IEmailService;
import jakarta.websocket.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmailController {
    @Autowired
    private IEmailService service;
    @GetMapping("api/email")
    public void sendEmail()
    {

    String asunto= "Gracias por registrarte";
    List<String> to= new ArrayList<>();
    to.add("lucasmoy@atl.academy");
    String body= "Hola, gracias por registrate...";
  //  String cco= "";
        service.sendEmail(asunto,to,body);

    }

}
