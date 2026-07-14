package com.extensionista.school.service;

import com.extensionista.school.dtos.LoginRequestDTO;
import com.extensionista.school.dtos.LoginResponseDTO;
import com.extensionista.school.entities.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;

    public AuthenticationService(AuthenticationManager authenticationManager, JWTService jwtService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    public LoginResponseDTO authenticate(LoginRequestDTO request){
        Authentication authentication =
                new UsernamePasswordAuthenticationToken(
                                request.username(),request.password());

        Authentication authenticated = authenticationManager.authenticate(authentication);
        String token = jwtService.generateToken((User) authenticated.getPrincipal());

        return new LoginResponseDTO(token);
    }
}
