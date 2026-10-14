package com.ibrahim.smartreader.auth.service;

import com.ibrahim.smartreader.auth.dto.AuthenticationRequest;
import com.ibrahim.smartreader.auth.dto.AuthenticationResponse;
import com.ibrahim.smartreader.auth.dto.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}