package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface IEventRepository extends JpaRepository<Event, Long> {
    @Query("select s from Sneaker s where s.highlights = true")
    List<Event> findByHighlightsTrue();

    @Query("select s from Sneaker s where s.category.id = ?1")
    List<Event> findByCategory_Id(@PathVariable Long id);



}