package org.innsys.services;

import org.innsys.models.helper.Request;
import org.innsys.models.helper.Response;
import org.innsys.models.helper.ResponseUtil;

public interface RequestService {


    public ResponseUtil<Response> saveAllUserRequest(Request request);
}
