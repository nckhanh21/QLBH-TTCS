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
    @ManyToOne
    @JoinColumn (name = "Id_belong")
    private Belong belong;
    @Id
    @ManyToOne
    @JoinColumn(name="Id_account")
    private Users users;
}
