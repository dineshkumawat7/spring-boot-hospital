package com.hospital.management.service.email;

public interface EmailService {
    public boolean sendEmail(String subject, String message, String to);
}
