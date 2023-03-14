package org.innsys.services;

import org.innsys.models.db.User;
import org.innsys.models.helper.ResponseUtil;

public interface UserService {


    ResponseUtil<User> insert(User user);

    ResponseUtil<User> get(String userId);


}
