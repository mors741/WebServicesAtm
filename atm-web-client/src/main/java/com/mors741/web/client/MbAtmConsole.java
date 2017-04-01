package com.mors741.web.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

@ManagedBean
@ViewScoped
public class MbAtmConsole {

    @Getter
    @Setter
    private String atmId;

    @Getter
    @Setter
    private String output = "";

    @Getter
    @Setter
    private String error = "";

    private WebResource service;

    public static final String URI = "http://localhost:7001/atm-ws/atms";

    {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        service = client.resource(UriBuilder.fromUri(URI).build());
    }

    public void checkAtm() {
        output = "";
        error = "";

        WebResource.Builder builder = service.path(atmId).accept(MediaType.APPLICATION_JSON);
        Response.StatusType status = builder.get(ClientResponse.class).getStatusInfo();

        if (status.getStatusCode() == 200) {
            output = builder.get(String.class);
        } else {
            error = "Exception!";
        }


    }

}
