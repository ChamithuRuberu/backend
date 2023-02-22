package com.AdminPanel.Admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "movie_id", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int movieId;

    @OneToMany(mappedBy="movie")
    private Set<BookingDeails> bookingDeails;
}
