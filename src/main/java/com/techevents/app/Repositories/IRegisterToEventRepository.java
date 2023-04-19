package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.Event;
import com.techevents.app.domain.Models.RegisterToEvent;
import com.techevents.app.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegisterToEventRepository extends JpaRepository<RegisterToEvent, Long> {

    RegisterToEvent findByUserAndEvent(User auth, Event event);
}
