package com.extensionista.school.controllers;

import com.extensionista.school.dtos.LoginRequestDTO;
import com.extensionista.school.dtos.LoginResponseDTO;
import com.extensionista.school.entities.User;
import com.extensionista.school.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request){
        var response  = authenticationService.authenticate(request);
        return ResponseEntity.ok(response);
    }


}
