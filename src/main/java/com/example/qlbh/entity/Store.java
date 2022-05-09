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
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Store")
public class Store implements Serializable {
    @Id
    @Column(name = "Id_store")
    private int Id_store;
    @Column(name="Address_store")
    private String Address_store;
    @Column(name="Rate")
    private int Rate;
    @Column(name = "Lat")
    private float Lat;
    @Column(name = "Long")
    private float Long;


}
