package com.techevents.app.domain.Services;

import com.techevents.app.security.auth.AuthenticationService;
import com.techevents.app.security.user.UserRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendMailService {
    private JavaMailSender mail;
    private UserRepository userRepository;
    private AuthenticationService authenticationService;

    public SendMailService(JavaMailSender mail, UserRepository userRepository, AuthenticationService authenticationService) {
        this.mail = mail;
        this.userRepository = userRepository;
        this.authenticationService = authenticationService;
    }

    public void sendMail(String email){
        SimpleMailMessage emailMessage = new SimpleMailMessage();
        emailMessage.setTo(email);
        emailMessage.setFrom("mail@mail.com");
        emailMessage.setSubject("Thank You for Trusting Eventia - Confirmation of Registration");
        emailMessage.setText("Congratulations! You have successfully registered for the event. We look forward to seeing you there and hope you have a great experience. Thank you for your participation!");

        mail.send(emailMessage);
    }
}
