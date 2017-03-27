package com.mors741.jpa;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Atm {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private int id;

    @Column
    @Getter
    @Setter
    private String currency;

    @Column
    @Getter
    @Setter
    private int amount;


}
