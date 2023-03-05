package com.AdminPanel.Admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "booking_id", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int BookingId;

    @Column(name = "date",columnDefinition = "DATETIME")
    private Date date;

    @Column(name = "total",nullable = false)
    private Double Total;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @OneToMany(mappedBy="booking")
    private Set<BookingDeails> bookingDeails;

    public Booking(Date date, Double total, User user) {
        this.date = date;
        Total = total;
        this.user = user;
    }
}
