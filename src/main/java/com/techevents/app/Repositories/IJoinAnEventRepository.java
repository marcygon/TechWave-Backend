package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.Event;
import com.techevents.app.domain.Models.JoinAnEvent;
import com.techevents.app.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJoinAnEventRepository extends JpaRepository<JoinAnEvent, Long> {

    JoinAnEvent findByUserAndEvent(User auth, Event event);
}
