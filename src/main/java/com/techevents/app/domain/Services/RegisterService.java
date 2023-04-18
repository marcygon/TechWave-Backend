package com.techevents.app.domain.Services;

import com.techevents.app.Repositories.IEventRepository;
import com.techevents.app.Repositories.IRegisterToEventRepository;
import com.techevents.app.domain.Models.RegisterToEvent;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final IEventRepository eventRepository;
    private final AuthService authService;
    private final IRegisterToEventRepository registerToEventRepository;

    public RegisterService(IEventRepository eventRepository, AuthService authService, IRegisterToEventRepository registerToEventRepository) {
        this.eventRepository = eventRepository;
        this.authService = authService;
        this.registerToEventRepository = registerToEventRepository;
    }


    public void loggedUserRegisterToEvent(Long eventId){
        new RegisterToEvent();
    }
/*
    public Event loggedUserRegisterToEvent (Long eventId){
        var userAuth = this.userRepository.findByEmail(userLogged).orElseThrow(() -> new RuntimeException("In order to register for this event, you must be logged in to your account."));
        var eventSelected = this.eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("We were unable to locate the event with the given ID. Please try again with a different ID."));

        if(userAuth.isEnabled() && eventSelected != null){
            eventSelected.registerParticipant();
        }

        return this.eventRepository.save(eventSelected);
    }

 */
}
