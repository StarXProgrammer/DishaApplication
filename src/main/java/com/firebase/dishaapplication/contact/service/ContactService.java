package com.firebase.dishaapplication.contact.service;

import com.firebase.dishaapplication.dto.ContactRequestDto;
import com.firebase.dishaapplication.entity.Contact;

public interface ContactService
{
    boolean saveContact(ContactRequestDto contactRequestDto);
}
