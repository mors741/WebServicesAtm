package com.mors741.ws;

import com.mors741.jpa.Atm;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@WebService
public class CheckAtmSoup {

    @PersistenceContext
    EntityManager entityManager;

    @WebMethod
    public String availableCash(int id) {
        Atm atm = entityManager.find(Atm.class, id);
        return atm.getAmount() + " " + atm.getCurrency();
    }
}
