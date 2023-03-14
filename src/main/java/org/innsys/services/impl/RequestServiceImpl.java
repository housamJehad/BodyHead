package org.innsys.services.impl;

import org.innsys.models.db.User;
import org.innsys.models.helper.Request;
import org.innsys.models.db.Body;
import org.innsys.models.helper.Response;
import org.innsys.models.helper.ResponseUtil;
import org.innsys.repositories.BodyRepository;
import org.innsys.services.RequestService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Objects;

@ApplicationScoped
public class RequestServiceImpl implements RequestService {

    @Inject
    BodyRepository bodyRepository;

    @Inject
    UserServiceImpl userService;


    @Transactional
    @Override
    public ResponseUtil<Response> saveAllUserRequest(Request request) {

        Response response = new Response();
        ResponseUtil<Response> responseUtil = new ResponseUtil<>();

        String validationResult = validateAllUserRequest(request);


        if (validationResult.equals("SUCCESS")) {
            Body body = createBody(request);
            User user = getUser(request.getHeaders().getUserId());

            if (isUserExist(user)) {
                setHeadersInResponse(response, body);
                setUserInfoInResponse(response, user);
                bodyRepository.persist(body);
                return responseUtil.setValidResponse(validationResult, response);
            } else {
                validationResult = "USER_NOT_FOUND";
            }
        }
        return responseUtil.setInValidResponse(validationResult);
    }

    private String validateAllUserRequest(Request request) {
        if (Objects.isNull(request)) {
            return "REQUEST_IS_NULL";
        }
        if (Objects.isNull(request.getHeaders())) {
            return "HEADERS_MISSED";
        }
        if (Objects.isNull(request.getHeaders().getUserId())) {
            return "USER_ID_MISSED";
        }
        if (!request.isSuperUser()) {
            return "IS_NOT_SUPER_USER";
        }
        return "SUCCESS";
    }

    private Body createBody(Request request) {
        return new Body().setHeaders(request.getHeaders());
    }

    private User getUser(String userId) {
        return userService.get(userId).getBody();
    }

    private boolean isUserExist(User user) {
        return !Objects.isNull(user);
    }


    private void setHeadersInResponse(Response response, Body body) {
        response.setHeaders(body.getHeaders()).build();
    }

    private void setUserInfoInResponse(Response response, User user) {
        response.setAccountNumber(user.getAccountNumber())
                .setPilotDetails(user.getPilotDetails())
                .setUserFunctions(user.getFunctions());
    }


}
