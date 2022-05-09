package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "User_Order")
@AllArgsConstructor
@NoArgsConstructor
public class User_Order implements Serializable {
    @Id
    @Column(name = "Id_order")
    private int Id_order;
    @ManyToOne
    @JoinColumn(name = "Id_account")
    private Users users;
    @Column(name = "deliver_status")
    private Boolean deliver_status;
    @Column(name = "order_date")
    private Date order_date;
}
