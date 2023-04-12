package com.techevents.app.domain.Services;

import com.techevents.app.domain.Models.Admin;
//import com.techevents.app.infrastructure.Repositories.IAdminRepository;
import com.techevents.app.Repositories.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private IAdminRepository adminRepository;

    //Admin getAdminRegistered(){
        //return this.adminRepository.findById(1L).get();
    //}

    public List<Admin> findAllAdmins(){
        return adminRepository.findAll();
    }
}
