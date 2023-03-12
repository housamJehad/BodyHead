package org.innsys.models.helper;

import org.innsys.models.db.Headers;

public class AccountRequest extends Request {

    private final String accountNumber;

    public AccountRequest(Headers headers, boolean isSuperUser, String accountNumber) {
        super(headers, isSuperUser);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
