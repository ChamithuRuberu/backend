package com.AdminPanel.Admin.service;


import com.AdminPanel.Admin.dto.request.RequestBookingSaveDTO;
import com.AdminPanel.Admin.dto.request.RequestBookingSaveDetailsDTO;

import java.util.List;

public interface BookingService {

    String addBooking(RequestBookingSaveDTO requestBookingSaveDTO);

    List<RequestBookingSaveDetailsDTO> getAllBookingDetails();
}
