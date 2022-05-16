package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Click")
@Entity
public class Click implements Serializable {
    @Id
    @Column(name = "ID")
    private int id;
    @ManyToOne
    @JoinColumn(name = "Id_account")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "Id_item")
    private Item_feature_show item_feature_show;
    @Column(name = "Click_number")
    private int Click_number;
}
