package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface IEventRepository extends JpaRepository<Event, Long> {
    @Query("select s from Event s where s.highlights = true")
    List<Event> findByHighlightsTrue();

    @Query("select s from Event s where s.category.id = ?1")
    List<Event> findByCategory_Id(@PathVariable Long id);

    @Query("select e from Event e where upper(e.name) like upper(concat('%', ?1, '%'))")
    List<Event> filterAllEventsByName(String name);

    @Query("select e from Event e where upper(e.name) like upper(concat('%', ?1, '%')) and e.highlights = true")
    List<Event> filterHighlightEventsByName(String name);

    //@Query("select e from Event e where upper(e.name) like upper(concat('%', ?1, '%')) and e.available = true")
    //@Query("select e from Event e where upper(e.name) like upper(concat('%', ?1, '%')) and e.isAvailable = true")
    //@Query("select e from Event e where upper(e.name) like upper(concat('%', ?1, '%')) and e.isAvailable")
    //@Query("select e from Event e where upper(e.name) like upper(concat('%', ?1, '%')) and e.stream().filter(event -> event.isAvailable()")
    //@Query(value = "select e from Event e where upper(e.name) like upper(concat('%', ?1, '%')) and (date(e.eventDate) > current_date or (date(e.eventDate) = current_date and time(e.eventHour) > current_time))", nativeQuery = true)
    //List<Event> filterAvailableEventsByName(String name);



}