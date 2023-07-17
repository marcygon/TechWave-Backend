package com.techevents.app.domain.Services;

import com.techevents.app.Repositories.IEventRepository;
import com.techevents.app.Repositories.IJoinAnEventRepository;
import com.techevents.app.domain.Models.Event;
import com.techevents.app.domain.Models.JoinAnEvent;
import com.techevents.app.security.auth.AuthenticationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JoinAnEventService {

    private final IEventRepository eventRepository;
    private final AuthenticationService authenticationService;
    private final IJoinAnEventRepository joinAnEventRepository;
    private final SendMailService sendMailService;

    public JoinAnEventService(IEventRepository eventRepository, AuthenticationService authenticationService, IJoinAnEventRepository joinAnEventRepository, SendMailService sendMailService) {
        this.eventRepository = eventRepository;
        this.authenticationService = authenticationService;
        this.joinAnEventRepository = joinAnEventRepository;
        this.sendMailService = sendMailService;
    }


    public void loggedUserRegisterToEvent(Long eventId){
        var event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("We were unable to locate the event with the given ID. Please try again with a different ID."));
        var auth = authenticationService.getAuthUser();

        if(event.alreadyRegistered(auth)){
            var checkRegister = joinAnEventRepository.findByUserAndEvent(auth, event);
            if(checkRegister != null){
                joinAnEventRepository.delete(checkRegister);
            }
        }
        else if (event.isAvailable() && event.registersCount() < event.getMaxParticipants()){
            var register = new JoinAnEvent(auth, event);
            //sendMailService.sendMail(auth.getEmail());
            joinAnEventRepository.save(register);
        }
    }

    public List<Event> loggedUserCheckEventsJoined(){
        var auth = authenticationService.getAuthUser();
        var listOfEvents = joinAnEventRepository.eventsJoined(auth);

        List<Event> eventsJoined = new ArrayList<>();

        for (JoinAnEvent joinAnEvent : listOfEvents) {
            eventsJoined.add(joinAnEvent.getEvent());
        }
        return eventsJoined;
    }
}
