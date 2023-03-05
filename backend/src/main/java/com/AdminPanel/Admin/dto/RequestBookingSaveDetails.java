package com.AdminPanel.Admin.dto;

import com.AdminPanel.Admin.entity.Booking;
import com.AdminPanel.Admin.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestBookingSaveDetails {

    private String MovieName;
    private int Quantity;
    private Double Amount;
    private int booking;
    private int movie;
}
