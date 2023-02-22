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
@Table(name = "User")
public class User {
    @Id
    @Column(name = " user_id  ", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int userId;

    @Column(name = "name",length = 30)
    private String  userName;

    @Column(name ="nic",length =13)
    private String userNic;

    @Column(name = "contact",length = 50)
    private int memberContact;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "active_state",columnDefinition = "TINYINT default 1")
    private boolean activestate;

    @OneToMany(mappedBy="user")
    private Set<Booking> bookings;

    public User(String password, boolean activestate) {
        this.password = password;
        this.activestate = activestate;
    }

}
