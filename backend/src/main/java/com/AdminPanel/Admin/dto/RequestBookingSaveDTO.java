package com.AdminPanel.Admin.dto;

import com.AdminPanel.Admin.entity.BookingDeails;
import com.AdminPanel.Admin.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestBookingSaveDTO {

    private Date date;
    private Double Total;
    private int user;
    private List<RequestBookingSaveDetails> bookingDeails;

}
