package org.innsys.controllers;

import org.innsys.models.db.User;
import org.innsys.models.helper.ResponseUtil;
import org.innsys.services.impl.UserServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/user")
public class UserController {


    @Inject
    UserServiceImpl userService;

    @POST
    @Path("/insert-user")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseUtil<User> insertUser(User user) {
        return userService.insert(user);
    }


    @GET
    @Path("/get-user")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseUtil<User> getUser(@QueryParam("userId") String userId) {
        return userService.get(userId);
    }


}
