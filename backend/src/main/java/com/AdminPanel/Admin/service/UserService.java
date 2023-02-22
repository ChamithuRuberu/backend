package com.AdminPanel.Admin.service;

import com.AdminPanel.Admin.dto.request.RequestUserSaveDTO;

public interface UserService {
    String addUser(RequestUserSaveDTO requestUserSaveDTO);
}
