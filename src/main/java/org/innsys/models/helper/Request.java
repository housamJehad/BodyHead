package org.innsys.models.helper;


import org.innsys.models.db.Headers;

public class Request {

    private final Headers headers;
    private final boolean isSuperUser;

    public Request(Headers headers, boolean isSuperUser) {
        this.headers = headers;
        this.isSuperUser = isSuperUser;
    }

    public Headers getHeaders() {
        return headers;
    }

    public boolean isSuperUser() {
        return isSuperUser;
    }

}
