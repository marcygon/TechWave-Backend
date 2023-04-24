package com.techevents.app.mailSender;

import com.techevents.app.security.auth.AuthenticationService;
import com.techevents.app.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMail {
    @Autowired
    private JavaMailSender mail;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("sendMail")
    public ResponseEntity<?> sendMail(){
        String getUserMail = authenticationService.getAuthUser().getEmail();
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(getUserMail);
        email.setFrom("mailsendersfirsttry@gmail.com");
        email.setSubject("Enviado desde backend");
        email.setText("Hola jeje soy un mensaje");

        mail.send(email);

        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
