package org.innsys.models.helper;

import org.innsys.models.db.Headers;
import org.innsys.models.db.PilotDetails;
import org.innsys.models.db.UserFunction;

import java.util.List;

public class Response {

    private Headers headers;

    private String accountNumber;


    private PilotDetails pilotDetails;

    List<UserFunction> userFunctions;


    public Response setHeaders(Headers headers) {
        this.headers = headers;
        return this;
    }

    public Response setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public Response setPilotDetails(PilotDetails pilotDetails) {
        this.pilotDetails = pilotDetails;
        return this;
    }

    public Response setUserFunctions(List<UserFunction> userFunctions) {
        this.userFunctions = userFunctions;
        return this;
    }

    public Headers getHeaders() {
        return headers;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public PilotDetails getPilotDetails() {
        return pilotDetails;
    }

    public List<UserFunction> getUserFunctions() {
        return userFunctions;
    }

    public Response build() {
        return this;
    }


}
