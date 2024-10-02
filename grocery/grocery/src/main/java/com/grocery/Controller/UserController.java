package com.grocery.Controller;

import com.grocery.Entity.User;
import com.grocery.Payload.Logindto;
import com.grocery.Payload.Userdto;
import com.grocery.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String>createuser(@RequestBody Userdto userdto){
        User createuser = userService.createuser(userdto);
        return new ResponseEntity<>("your registration is successfully done", HttpStatus.CREATED);

    }
    @PostMapping("/verifylogin")
    public ResponseEntity<String>verifylogin(@RequestBody Logindto logindto){
        boolean status = userService.verifylogin(logindto);
        if(status){
            return new ResponseEntity<>("you are login successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("invalid credentials",HttpStatus.OK);
        }

    }
}
