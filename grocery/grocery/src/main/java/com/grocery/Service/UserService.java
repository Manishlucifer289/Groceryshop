package com.grocery.Service;

import com.grocery.Entity.User;
import com.grocery.Payload.Logindto;
import com.grocery.Payload.Userdto;


public interface UserService {
    public User createuser(Userdto userdto);

    boolean verifylogin(Logindto logindto);
}
