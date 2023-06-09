package com.AdminPanel.Admin.controller;
import com.AdminPanel.Admin.dto.UserDTO;
import com.AdminPanel.Admin.dto.request.RequestBookingSaveDTO;
import com.AdminPanel.Admin.dto.request.RequestBookingSaveDetailsDTO;
import com.AdminPanel.Admin.service.BookingService;
import com.AdminPanel.Admin.util.StanderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/booking2")
public class BookingController {


    @Autowired
    private BookingService bookingService;

    @PostMapping("/saveBooking")
    public ResponseEntity<StanderResponse> saveBooking(@RequestBody RequestBookingSaveDTO requestBookingSaveDTO) {
        String id=bookingService.addBooking(requestBookingSaveDTO);
        return new ResponseEntity<StanderResponse>(
                new StanderResponse(201,id+" Saved Succecfully ",id),
                HttpStatus.CREATED
        );
    }

    @GetMapping(
            path = "get-all-BookingDetails"
    )
    public ResponseEntity<StanderResponse> getAllBookingDetails() {

        List<RequestBookingSaveDetailsDTO> requestBookingSaveDetailsDTOS = bookingService.getAllBookingDetails();
        return new ResponseEntity<StanderResponse>(

                new StanderResponse(200," done",requestBookingSaveDetailsDTOS),
                HttpStatus.OK
        );
    }

}
