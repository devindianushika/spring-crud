package com.audelia.first.Services;
import com.audelia.first.Domain.UserDTO;

import java.util.List;


public interface UserServices {

    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userdata);

    String updateUser(UserDTO newUserData);


    UserDTO findById(Integer id);
}
