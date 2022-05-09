package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order_item_id implements Serializable {
    private Belong belong;
    private Users users;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order_item_id order_item_id = (Order_item_id) o;
        return belong.equals(order_item_id.belong) &&
                users.equals(order_item_id.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(belong, users);
    }
}
