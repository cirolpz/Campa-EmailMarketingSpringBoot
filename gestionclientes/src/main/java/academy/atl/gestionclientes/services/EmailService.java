package academy.atl.gestionclientes.services;


import jakarta.mail.*;

import javax.mail.internet.InternetAddress;
import java.util.List;
import java.util.Properties;

public class EmailService implements IEmailService
{
    @Override
    public void sendEmail(String asunto, List<String> to, String body)
    {
        String usuario = "asdsadasdas@gmail.com";
        String password= "casa123";


        Properties props = new Properties();
        props.put("email.smtp.auth","true");
        props.put("email.smtp.starttls","true");
        props.put("email.smtp.host","smtp.gmail.com");//hosting para correo de gmail
        props.put("mail.smtp.port","587");//puerto por el q enviamos mail

        Session sesion = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return super.getPasswordAuthentication(usuario,password);
        }
    });

        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("info@aws.com"));
            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(to.get(0)));
            message.setSubject(asunnto);
            message.setText(body);
            Transport.send(message);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




        //Amazon web service/ mail chimp / Mail shep / mailijet / Brevo
    }
}