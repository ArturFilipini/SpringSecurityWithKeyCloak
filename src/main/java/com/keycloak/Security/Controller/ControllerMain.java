package com.keycloak.Security.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/main")
public class ControllerMain {


    @GetMapping("hello")
    @RolesAllowed("user")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello world");
    }
    @GetMapping("admin")
    @RolesAllowed("admin")
    public ResponseEntity<String> admin(){
        return ResponseEntity.ok("Hello Admin");
    }

}
