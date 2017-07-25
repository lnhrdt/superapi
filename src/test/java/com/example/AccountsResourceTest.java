package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class AccountsResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(AccountsResource.class);
    }

    @Test
    public void testFetchAll() throws Exception {
        Response output = target("/rest/accounts")
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get();
        assertEquals("should return status 200", 200, output.getStatus());
    }
}
