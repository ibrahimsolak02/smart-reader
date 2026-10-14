package com.ibrahim.smartreader.auth.dto;

public record AuthenticationRequest(
        String email,
        String password
) {}