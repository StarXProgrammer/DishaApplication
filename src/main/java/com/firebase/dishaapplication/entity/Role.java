package com.firebase.dishaapplication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "roles", schema = "jobportal")
@AttributeOverrides({
        @AttributeOverride(name = "createdAt",
                column = @Column(nullable = false)),
        @AttributeOverride(name = "createdBy",
                column = @Column(nullable = false,
                        length = 20)),
        @AttributeOverride(name = "updatedAt",
                column = @Column),
        @AttributeOverride(name = "updatedBy",
                column = @Column(length = 20))})
public class Role extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50)
    private String name;


}