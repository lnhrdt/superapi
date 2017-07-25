package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.List;

@Path("/rest/accounts")
public class AccountsResource {

    @GET
    public List<Account> getAccounts() {
        return Collections.emptyList();
    }

    private class Account {
    }
}
