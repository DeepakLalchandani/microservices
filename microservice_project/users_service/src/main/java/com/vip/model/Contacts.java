package com.vip.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Contacts {

    private Long cId;
    private String email;
    private String contactName;
    private Long userId;



}
