package com.firebase.dishaapplication.dto;

import com.firebase.dishaapplication.entity.Contact;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link Contact}
 */
public record ContactRequestDto(

        @Size(message = "Name must be between 5 and 30 characters", min = 5, max = 30)
        @NotBlank(message = "Name can not be empty")
        @Pattern(
                regexp = "^[A-Za-z ]+$",
                message = "Name can contain only alphabets"
        )
        String name,

        @Email(message = "Invalid email address")
        @NotBlank(message = "Email can not be empty")
        String email,

        @Pattern(message = "UserType must be one of: Job Seeker, Employer, Other", regexp = "Job Seeker|Employer|Other")
        @NotBlank(message = "UserType can not be empty")
        String userType,

        @Size(message = "Subject must be between 5 and 150 characters", min = 5, max = 150)
        @NotBlank(message = "Subject can not be empty")
        String subject,

        @Size(message = "Message must be between 5 and 500 characters", min = 5, max = 500)
        @NotBlank(message = "Message can not be empty") String message)
        implements Serializable
{

}