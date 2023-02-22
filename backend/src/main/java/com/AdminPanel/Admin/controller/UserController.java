package com.AdminPanel.Admin.controller;


import com.AdminPanel.Admin.dto.request.RequestMovieSaveDTO;
import com.AdminPanel.Admin.dto.request.RequestUserSaveDTO;
import com.AdminPanel.Admin.service.UserService;
import com.AdminPanel.Admin.util.StanderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/api4")
public class UserController {

    @Autowired
   private UserService userService;

    @PostMapping("/saveMovie")
    public ResponseEntity<StanderResponse> saveUser(@RequestBody RequestUserSaveDTO requestUserSaveDTO) {
        String id=userService.addUser(requestUserSaveDTO);
        return new ResponseEntity<StanderResponse>(
                new StanderResponse(201,id+" Saved Succecfully ",id),
                HttpStatus.CREATED
        );
    }
}
