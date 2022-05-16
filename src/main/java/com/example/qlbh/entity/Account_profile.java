package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Account_profile")
public class Account_profile implements Serializable {
    @Id
    @Column(name = "ID")
    private int id;
    @OneToOne
    @JoinColumn(name = "Id_account")
    private Account_login account_login;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Phone")
    private String Phone;
    @Column(name="rol")
    private boolean rol;


}
