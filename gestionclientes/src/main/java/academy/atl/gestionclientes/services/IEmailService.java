package academy.atl.gestionclientes.services;

import java.util.List;

public interface IEmailService
{
void sendEmail(String asunto, List<String> to, String body);
    void enviarEmailBienvenida(String asunto, List<String> to, String nombre);
}
