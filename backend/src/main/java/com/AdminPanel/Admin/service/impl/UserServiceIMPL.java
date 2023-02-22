package com.AdminPanel.Admin.service.impl;

import com.AdminPanel.Admin.dto.request.RequestUserSaveDTO;
import com.AdminPanel.Admin.entity.Movie;
import com.AdminPanel.Admin.entity.User;
import com.AdminPanel.Admin.repo.UserRepo;
import com.AdminPanel.Admin.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String addUser(RequestUserSaveDTO requestUserSaveDTO) {
        User user  = modelMapper.map(requestUserSaveDTO, User.class);
        if (! userRepo.existsById(user.getUserId())){
            return userRepo.save(user).getUserName();
        }
        return null;
    }
}
