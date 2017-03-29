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

    public String getTextDescr() {
        return String.format("id = %d, money = %s %s",
                id, amount, currency);
    }

    public String getJsonDescr() {
        return String.format("{\"id\":\"%d\",\"amount\":\"%s\", \"currency\":\"%s\"}",
                id, amount, currency);
    }


}
