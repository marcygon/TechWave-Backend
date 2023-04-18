package com.techevents.app.domain.Models;

import com.techevents.app.security.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "registrationsToEvents")
@NoArgsConstructor
public class RegisterToEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public RegisterToEvent(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}