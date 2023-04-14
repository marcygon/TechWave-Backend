package com.techevents.app.domain.Services;

import com.techevents.app.Repositories.IEventRegistrationRepository;
import com.techevents.app.Repositories.IEventRepository;
import com.techevents.app.Repositories.IUserRepository;
import com.techevents.app.domain.Models.EventRegistration;
import org.springframework.stereotype.Service;

@Service
public class EventRegistrationService {
    public final IEventRegistrationRepository eventRegistrationRepository;
    public final IUserRepository userRepository;
    public final IEventRepository eventRepository;

    public EventRegistrationService(IEventRegistrationRepository eventRegistrationRepository, IUserRepository userRepository, IEventRepository eventRepository) {
        this.eventRegistrationRepository = eventRegistrationRepository;
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    public EventRegistration registrationToEvent(Long userId, Long eventId) {
        var user = userRepository.findById(userId).orElse(null);
        var event = eventRepository.findById(eventId).orElse(null);
        EventRegistration registration = null;

        if (user != null && event != null) {
            if (event.getRegistrations().stream().anyMatch(e -> e.getUser().equals(user))) {
                throw new RuntimeException("Registration failed. The user is already registered for this event.");
            }

            registration = new EventRegistration();
            registration.setUser(user);
            registration.setEvent(event);

            user.getRegistrations().add(registration);
            event.getRegistrations().add(registration);

            userRepository.save(user);
            eventRepository.save(event);
            eventRegistrationRepository.save(registration);
        } else {
            throw new RuntimeException("An error occurred while attempting to register the user for the event. Either the user or the event does not exist.");
        }
        return registration;
    }
}

