package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class Users implements Serializable {
    @Id
    @Column(name = "ID")
    private int id;
    @JoinColumn(name = "Id_account")
    @OneToOne
    private Account_profile account_profile;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "DOB")
    private Date DOB;
    @Column(name = "Gender")
    private Boolean Gender;
    @Column(name="Lat")
    private float Lat;
    @Column(name = "Long")
    private float Long;
    @Column(name = "Address_user")
    private String Address_user;
    @Column(name = "Lastbuy")
    private Date Lastbuy;
    @Column(name = "Totalbuy")
    private float Totalbuy;


}
