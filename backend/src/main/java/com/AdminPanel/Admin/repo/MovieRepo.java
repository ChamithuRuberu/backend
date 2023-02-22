package com.AdminPanel.Admin.repo;

import com.AdminPanel.Admin.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {
}
