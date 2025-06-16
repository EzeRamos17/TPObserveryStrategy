package observer.ejercicio4.model;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailNotifier implements Observer {
    @Override
    public void update(String nombre, String email) {
        try {
            sendEmail(nombre, email);
        } catch (MessagingException e) {
            System.err.println("Error al enviar el email: " + e.getMessage());
        }
    }

    private void sendEmail(String nombre, String toEmail) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", MailtrapConfig.SMTP_HOST);
        props.put("mail.smtp.port", MailtrapConfig.SMTP_PORT);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MailtrapConfig.SMTP_USER, MailtrapConfig.SMTP_PASSWORD);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(MailtrapConfig.FROM_EMAIL));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        message.setSubject("Confirmación de Registro");
        message.setText("Hola " + nombre + ",\n\nGracias por registrarte. Tu registro ha sido confirmado.\n\nSaludos cordiales,\nEl equipo de registro");

        Transport.send(message);
        System.out.println("Email enviado exitosamente a " + toEmail);
    }
} 