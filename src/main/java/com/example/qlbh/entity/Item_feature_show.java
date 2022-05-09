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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Item_feature_show")
public class Item_feature_show implements Serializable {
    @Id
    @Column(name = "Id_item")
    private int Id_item;
    @Column(name = "Name_item")
    private String Name_item;
    @Column(name = "Size")
    private float Size;
    @Column(name = "Color")
    private String Color;
    @Column(name = "Brand")
    private String Brand;
    @Column(name = "Price")
    private float Price;


}
