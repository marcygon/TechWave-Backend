package com.techevents.app.domain.Services;

import com.techevents.app.Repositories.IEventRepository;
import com.techevents.app.Repositories.IJoinAnEventRepository;
import com.techevents.app.domain.Models.JoinAnEvent;
import org.springframework.stereotype.Service;

@Service
public class JoinAnEventService {

    private final IEventRepository eventRepository;
    private final AuthService authService;
    private final IJoinAnEventRepository registerToEventRepository;

    public JoinAnEventService(IEventRepository eventRepository, AuthService authService, IJoinAnEventRepository registerToEventRepository) {
        this.eventRepository = eventRepository;
        this.authService = authService;
        this.registerToEventRepository = registerToEventRepository;
    }


    public void loggedUserRegisterToEvent(Long eventId){
        var event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("We were unable to locate the event with the given ID. Please try again with a different ID."));
        var auth = authService.getAuthUser();

        if(event.alreadyRegistered(auth)){
            var checkRegister = registerToEventRepository.findByUserAndEvent(auth, event);
            if(checkRegister != null){
                registerToEventRepository.delete(checkRegister);
            }
        }
        else if (event.isAvailable() && event.registersCount() < event.getMaxParticipants()){
            var register = new JoinAnEvent(auth, event);
            registerToEventRepository.save(register);
        }
    }
}
