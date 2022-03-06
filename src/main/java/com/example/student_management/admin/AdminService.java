package com.example.student_management.admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Optional<Admin> getAdmin(long id) {

        return adminRepository.findById(id);

    }

    public Admin sampleCreate(Admin admin) {

        return admin;

    }

}
