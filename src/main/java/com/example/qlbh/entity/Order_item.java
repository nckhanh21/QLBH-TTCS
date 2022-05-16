package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Order_item")
public class Order_item implements Serializable {
    @Id
    @Column(name = "ID")
    private int id;
    @ManyToOne
    @JoinColumn (name = "Id_belong")
    private Belong belong;
    @ManyToOne
    @JoinColumn(name="Id_order")
    private User_Order user_order;
}
