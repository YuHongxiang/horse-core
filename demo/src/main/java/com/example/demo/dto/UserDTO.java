package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="PASSWORD")
    private String password;

    private String secrect;

    static String transient1; // not persistent because of static
    final String transient2 = "Satish"; // not persistent because of final
    transient String transient3; // not persistent because of transient

    @Transient
    String transient4; // not persistent because of @Transient
}
