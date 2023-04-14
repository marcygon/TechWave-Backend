package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRegistrationRepository extends JpaRepository<EventRegistration, Long> {
}
