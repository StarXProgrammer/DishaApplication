package com.firebase.dishaapplication.repository;

import com.firebase.dishaapplication.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}