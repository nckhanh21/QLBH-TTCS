package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="Belong")
@AllArgsConstructor
@NoArgsConstructor
public class Belong implements Serializable {
    @Id
    @Column(name = "Id_belong")
    private int Id_belong;
    @ManyToOne
    @JoinColumn(name="Id_store")
    private Store store;
    @ManyToOne
    @JoinColumn(name="Id_item")
    private Item_feature_show item_feature_show;
}
