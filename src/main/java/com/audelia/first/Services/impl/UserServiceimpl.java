package com.audelia.first.Services.impl;
import com.audelia.first.Domain.UserDTO;
import com.audelia.first.Repositories.UserRepository;
import com.audelia.first.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceimpl implements UserServices {


    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDTO> findAllUsers() {

        List<UserDTO> allusers = userRepository.findAll();
        return allusers;

    }

    @Override
    public String saveUser(UserDTO userdata) {

        userRepository.save(userdata);
        return "data saved";
    }

    @Override
    public String updateUser(UserDTO newUserData) {
        String msg=null;
        if (newUserData.getId()!= null){
            userRepository.save(newUserData);
            msg="Data updated";
        }
        else{
            msg="Error";}

        return msg;
    }

    @Override
    public UserDTO findById(Integer id) {
        return userRepository.getOne(id);
    }
}
