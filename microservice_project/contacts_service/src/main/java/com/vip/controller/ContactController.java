package com.vip.controller;

import com.vip.model.Contacts;
import com.vip.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactsService contactsService;

    @GetMapping("/get/contacts/{userId}")
    public ResponseEntity<List<Contacts>> findUserById(@PathVariable Long userId){

        List<Contacts> contactsOfUser = contactsService.getContactsOfUser(userId);
        return ResponseEntity.ok(contactsOfUser);
    }

}
