package com.techevents.app.domain.Models;

import com.techevents.app.security.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "registrationsToEvents")
public class RegisterToEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
//logica aqui necesito un evento y un usuario autenticado