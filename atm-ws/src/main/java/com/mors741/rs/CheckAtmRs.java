package com.mors741.rs;

import com.mors741.jpa.Atm;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/atms")
@Stateless
public class CheckAtmRs {

    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Path("{atmid}")
    public Response availableCash(@PathParam("atmid") int id) {
        Atm atm = entityManager.find(Atm.class, id);
        if (atm != null) {
            return Response.ok(atm.getJsonDescr(), MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

    }

}