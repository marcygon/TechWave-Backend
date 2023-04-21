package com.techevents.app.domain.Services;

import com.techevents.app.Repositories.ICategoryRepository;
import com.techevents.app.Repositories.IEventRepository;
import com.techevents.app.domain.Models.Event;
import com.techevents.app.security.auth.AuthenticationService;
import com.techevents.app.security.user.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class EventServiceTest {

    @Mock
    private IEventRepository eventRepository;
    @Mock
    private AdminService adminService;
    @Mock
    private ICategoryRepository categoryRepository;
    @Mock
    private UserRepository userRepository;
    @Mock
    private AuthenticationService authenticationService;

    private EventService eventService;

    @BeforeEach
    void setUp(){
        openMocks(this);
        this.eventService = new EventService(eventRepository, adminService, categoryRepository, userRepository, authenticationService);
    }

    @Test
    void findAll_ReturnsOneListOfAllEvents() {
        List<Event> allEventsList = new ArrayList<>();
        allEventsList.add(new Event());

        when(eventRepository.findAll()).thenReturn(allEventsList);

        var sut = eventService.findAll();
        assertEquals(allEventsList.size(), sut.size());
    }

    @Test
    void findById() {
    }
}