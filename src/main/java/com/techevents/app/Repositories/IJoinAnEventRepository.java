package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.Event;
import com.techevents.app.domain.Models.JoinAnEvent;
import com.techevents.app.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface IJoinAnEventRepository extends JpaRepository<JoinAnEvent, Long> {

    JoinAnEvent findByUserAndEvent(User auth, Event event);

    @Query("select j from JoinAnEvent j where j.user = :user")
    List<JoinAnEvent> eventsJoined(@Param("user")User auth);

}
