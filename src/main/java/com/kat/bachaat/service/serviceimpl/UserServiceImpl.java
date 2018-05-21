package com.kat.bachaat.service.serviceimpl;

import com.kat.bachaat.dao.UserDAO;
import com.kat.bachaat.model.User;
import com.kat.bachaat.service.UserService;
import com.kat.bachaat.util.ActivationCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final ActivationCodeUtil activationCodeUtil;

    @Autowired
    public UserServiceImpl(UserDAO userDAO, ActivationCodeUtil activationCodeUtil) {
        this.userDAO = userDAO;
        this.activationCodeUtil = activationCodeUtil;
    }

    @Override
    public User registerUser(User user) {
        user.setActivationCode(activationCodeUtil.getActivationCode());
        return userDAO.registerUser(user);
    }
}
