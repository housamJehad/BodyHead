package org.innsys.services.impl;

import org.innsys.models.helper.Request;
import org.innsys.models.db.Body;
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


    @Transactional
    @Override
    public ResponseUtil<Body> saveAllUserRequest(Request request) {

        ResponseUtil<Body> responseUtil = new ResponseUtil<>();
        String validationResult = validateAllUserRequest(request);

        if (validationResult.equals("SUCCESS")) {
            Body body = createBody(request);
            bodyRepository.persist(body);
            return responseUtil.setValidResponse(validationResult, body);
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


}
