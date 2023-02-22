package com.AdminPanel.Admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking_Details")
public class BookingDeails {
    @Id
    @Column(name = "booking_Details_id", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int BookingDetailsId;

    @Column(name = "movie_name", length = 20)
    private String MovieName;

    @Column(name = "quantity", length = 20)
    private String Quantity;

    @Column(name = "amount",nullable = false)
    private Double Amount;

    @ManyToOne
    @JoinColumn(name="booking_id", nullable=false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name="movie_id", nullable=false)
    private Movie movie;

}
