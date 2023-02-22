package com.AdminPanel.Admin.service.impl;

import com.AdminPanel.Admin.dto.request.RequestMovieSaveDTO;
import com.AdminPanel.Admin.entity.Movie;
import com.AdminPanel.Admin.repo.MovieRepo;
import com.AdminPanel.Admin.service.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceIMPL implements MovieService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MovieRepo movieRepo;


    @Override
    public String addMovie(RequestMovieSaveDTO requestMovieSaveDTO) {
        Movie movie  = modelMapper.map(requestMovieSaveDTO,Movie.class);
        if (! movieRepo.existsById(movie.getMovieId())){
            return movieRepo.save(movie).getMovieName();
        }
        return null;
    }
}
