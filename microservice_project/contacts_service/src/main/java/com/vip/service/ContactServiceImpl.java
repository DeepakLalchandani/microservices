package com.vip.service;

import com.vip.model.Contacts;
import com.vip.repo.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactsService{


    @Autowired
    private ContactsRepository contactsRepository;

    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return contactsRepository.findAllByUserId(userId);
    }
}
