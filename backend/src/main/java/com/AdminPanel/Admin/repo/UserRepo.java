package com.AdminPanel.Admin.repo;

import com.AdminPanel.Admin.dto.request.RequestBookingSaveDTO;
import com.AdminPanel.Admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
