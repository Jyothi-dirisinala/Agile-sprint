package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Model.UserDetails;
import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class LoginController {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Autowired
    DepartmentRepository departmentRepository;


    @PostMapping("/logindetails")
    public String loginDetails(@RequestBody UserDetails userDetails){
       var status = false;
        List<UserDetails> userDetails1=userDetailsRepository.findAll();
      var value =  userDetailsRepository.findByUsernameContaining(userDetails.getUserName());
      var password = value.get(0).getPassword();
      if(userDetails.getPassword().equals(password)){
          return "success";
      }
      else
          return "fail";
    }
    @GetMapping("/departmentdetails")
    public List<Department> departmentData(){
        return departmentRepository.findAll();
    }

}
