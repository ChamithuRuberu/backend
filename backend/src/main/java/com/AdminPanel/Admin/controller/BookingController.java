package com.AdminPanel.Admin.controller;

import com.AdminPanel.Admin.dto.RequestBookingSaveDTO;
import com.AdminPanel.Admin.util.StanderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin
@RequestMapping("api/v1/booking")
public class BookingController {

    @PostMapping("/saveMovie")
    public ResponseEntity<StanderResponse> saveMovie(@RequestBody RequestBookingSaveDTO requestBookingSaveDTO ) {
        
        return new ResponseEntity<StanderResponse>(
                new StanderResponse(201,id+" Saved Succecfully ",id),
                HttpStatus.CREATED
        );
    }
}
