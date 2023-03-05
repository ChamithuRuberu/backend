package com.AdminPanel.Admin.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestBookingSaveDetailsDTO {

    private String MovieName;
    private int Quantity;
    private Double Amount;
    private int movie;
}
