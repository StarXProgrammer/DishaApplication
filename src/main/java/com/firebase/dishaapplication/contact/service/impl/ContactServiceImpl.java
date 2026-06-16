package com.firebase.dishaapplication.contact.service.impl;

import com.firebase.dishaapplication.contact.service.ContactService;
import com.firebase.dishaapplication.dto.ContactRequestDto;
import com.firebase.dishaapplication.entity.Contact;
import com.firebase.dishaapplication.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService
{

    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto)
    {
        boolean result = false;
        Contact contact = contactRepository.save(trasnformtoEntity(contactRequestDto));
        if (contact != null && contact.getId() != null)
        {
            result = true;
        }
        return result;
    }

    public Contact trasnformtoEntity(ContactRequestDto contactRequestDto)
    {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        contact.setCreatedAt(Instant.now());
        contact.setCreatedBy("SYSTEM");
        contact.setStatus("NEW");
        return contact;
    }
}
