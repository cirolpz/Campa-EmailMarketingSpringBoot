package academy.atl.gestionclientes.controllers;

import academy.atl.gestionclientes.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    to.add("xxxxxxx@gmail.com");
    String body= "Hola, gracias por registrate...";
  //  String cco= "";
        service.sendEmail(asunto,to,body);

    }

}
