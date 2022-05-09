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
@Table(name = "Item_show")
public class Item_show implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "Id_item")
    private Item_feature_show item_feature_show;
    @Column(name = "Link")
    private String Link;
    @Column(name = "Type_item")
    private boolean Type_item;
}
