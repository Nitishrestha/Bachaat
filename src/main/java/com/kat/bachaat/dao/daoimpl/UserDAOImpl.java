package com.kat.bachaat.dao.daoimpl;

import com.kat.bachaat.dao.UserDAO;
import com.kat.bachaat.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User registerUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user;
    }
}
