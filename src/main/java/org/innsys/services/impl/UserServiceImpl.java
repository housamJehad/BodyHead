package org.innsys.services.impl;

import org.innsys.models.db.User;
import org.innsys.models.helper.ResponseUtil;
import org.innsys.repositories.UserRepository;
import org.innsys.services.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;


    @Transactional
    @Override
    public ResponseUtil<User> insert(User user) {

        ResponseUtil<User> response = new ResponseUtil<>();
        userRepository.persist(user);
        return response.setValidResponse("SUCCESS", user);

    }

    @Override
    public ResponseUtil<User> get(String userId) {


        List<User> users = userRepository.findUserById(userId);
        ResponseUtil<User> response = new ResponseUtil<>();

        if (users.size() > 0) {
            return response.setValidResponse("SUCCESS", users.get(0));
        }

        return response.setInValidResponse("ERROR");


    }


}
