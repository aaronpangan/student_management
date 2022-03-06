package com.example.student_management.admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/sample/{id}")
    public Optional<Admin> getAdmin(@PathVariable long id) {

        System.out.println(id);
        return adminService.getAdmin(id);

    }

    @PostMapping("/")
    public Admin SampleCreate(@RequestBody Admin admin) {
        System.out.println(admin.toString());
        return adminService.sampleCreate(admin);

    }

}
