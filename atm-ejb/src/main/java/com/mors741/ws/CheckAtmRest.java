package com.mors741.ws;

import com.mors741.jpa.Atm;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/atm")
@Stateless
public class CheckAtmRest {

    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Path("{atmid}")
//    @Produces({"application/json"})
    @Produces("text/plain")
    public String availableCash(@PathParam("atmid") int id) {
        Atm atm = entityManager.find(Atm.class, id);
        return String.format("{\"amount\":\"%s\",\"currency\":\"%s\"",atm.getAmount(), atm.getCurrency());
    }
}
