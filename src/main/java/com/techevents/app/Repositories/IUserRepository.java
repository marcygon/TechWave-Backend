package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
