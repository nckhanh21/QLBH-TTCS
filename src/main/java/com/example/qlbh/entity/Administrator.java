package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Administrator")
public class Administrator implements Serializable {
    @Id
    @JoinColumn (name = "Id_account")
    @OneToOne
    private Account_profile account_profile;
    @OneToOne
    @JoinColumn(name = "Id_store")
    private Store store;
}
