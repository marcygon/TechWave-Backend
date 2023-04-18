package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.RegisterToEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegisterToEventRepository extends JpaRepository<RegisterToEvent, Long> {

}
