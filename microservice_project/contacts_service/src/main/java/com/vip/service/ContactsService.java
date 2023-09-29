package com.vip.service;

import com.vip.model.Contacts;

import java.util.List;

public interface ContactsService {

    List<Contacts> getContactsOfUser(Long userId);
}
