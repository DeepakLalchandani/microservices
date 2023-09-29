package com.vip.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;

}
