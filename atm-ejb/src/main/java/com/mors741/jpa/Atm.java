package com.mors741.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Atm {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String currency;

    @Column
    private int amount;


}
