package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Data
@Table(name="Account_login")
@NoArgsConstructor
@AllArgsConstructor
public class Account_login implements Serializable {
   @Id
   @Column(name = "Id_account")
    private int Id_account;
   @Column(name="Username")
    private String Username;
   @Column(name = "Pass")
    private String Pass;


}
