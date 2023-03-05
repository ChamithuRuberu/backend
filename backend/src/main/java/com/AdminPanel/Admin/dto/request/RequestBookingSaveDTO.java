package com.AdminPanel.Admin.dto.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestBookingSaveDTO {
    private Date date;
    private Double Total;
    private int user;
    private List<RequestBookingSaveDetailsDTO> requestBookingSaveDetailsDTOS;

}
