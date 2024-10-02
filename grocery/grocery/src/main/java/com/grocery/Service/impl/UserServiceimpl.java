package com.grocery.Service.impl;

import com.grocery.Entity.Grocery;
import com.grocery.Entity.User;
import com.grocery.Payload.Logindto;
import com.grocery.Payload.Userdto;
import com.grocery.Repository.UserRepository;
import com.grocery.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {
    private UserRepository userRepository;


    public UserServiceimpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public User createuser(Userdto userdto) {
        User user =new User();
        user.setFirstName(userdto.getFirstName());
        user.setLastName(userdto.getLastName());
        user.setUsername(userdto.getUsername());
        user.setPassword(BCrypt.hashpw(userdto.getPassword(),BCrypt.gensalt(10)));
        user.setEmail(userdto.getEmail());
        user.setRole(userdto.getRole());
        User saved = userRepository.save(user);
        return saved;
    }

    @Override
    public boolean verifylogin(Logindto logindto) {
        Optional<User> findbyusername = userRepository.findByUsername(logindto.getUsername());
        if(findbyusername.isPresent()){
            User user = findbyusername.get();
            return BCrypt.checkpw(logindto.getPassword(),user.getPassword());
        }
        return false;
    }

}
