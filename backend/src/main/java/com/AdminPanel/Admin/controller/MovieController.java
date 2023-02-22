package com.AdminPanel.Admin.controller;

import com.AdminPanel.Admin.dto.request.RequestMovieSaveDTO;
import com.AdminPanel.Admin.service.MovieService;
import com.AdminPanel.Admin.util.StanderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/api3")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/saveMovie")
    public ResponseEntity<StanderResponse> saveMovie(@RequestBody RequestMovieSaveDTO requestMovieSaveDTO) {
        String id=movieService.addMovie(requestMovieSaveDTO);
        return new ResponseEntity<StanderResponse>(
                new StanderResponse(201,id+" Saved Succecfully ",id),
                HttpStatus.CREATED
        );
    }
}
