package com.ibrahim.smartreader.auth.dto;

public record RegisterRequest(
        String firstName,
        String lastName,
        String email,
        String password
) {}