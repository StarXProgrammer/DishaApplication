package com.firebase.dishaapplication.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/**
 * DTO for {@link com.firebase.dishaapplication.entity.Company}
 */
public record CompanyDto(Long id, String name, String logo, String industry, String size, BigDecimal rating,
                         String locations, Integer founded, String description, Integer employees, String website,
                         Instant createdAt, List<JobDto> jobs) implements Serializable {
}