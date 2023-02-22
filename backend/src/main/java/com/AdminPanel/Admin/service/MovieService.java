package com.AdminPanel.Admin.service;

import com.AdminPanel.Admin.dto.request.RequestMovieSaveDTO;

public interface MovieService {
    String addMovie(RequestMovieSaveDTO requestMovieSaveDTO);
}
