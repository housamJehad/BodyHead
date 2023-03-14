package org.innsys.controllers;


import org.innsys.models.helper.AccountRequest;
import org.innsys.models.helper.Request;
import org.innsys.models.helper.ResponseUtil;
import org.innsys.services.impl.RequestServiceImpl;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1")
public class RequestController {

    @Inject
    RequestServiceImpl requestService;

    @POST
    @Path("/get-all-functions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseUtil<org.innsys.models.helper.Response> getAllUserFunctions(Request request) {
        return requestService.saveAllUserRequest(request);
    }


    //TODO COMPLETE THIS
    @POST
    @Path("/get-monetary-functions")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMonetaryFunctions() {
        return Response.ok("monetary").build();
    }

    //TODO COMPLETE THIS
    @POST
    @Path("/get-pending-transaction-functions")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPendingTransactionFunctions() {
        return Response.ok("pending").build();
    }


    //TODO COMPLETE THIS
    @POST
    @Path("/get-account-functions")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAccountFunctions(AccountRequest accountRequest) {
        System.out.println(accountRequest.getHeaders().getUserId());
        System.out.println(accountRequest.getAccountNumber());
        return Response.ok(accountRequest.getHeaders()).build();
    }


}