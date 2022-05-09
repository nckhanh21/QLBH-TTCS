package com.example.qlbh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Click_id implements Serializable {
    private Users users;
    private Item_feature_show item_feature_show;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Click_id click_id = (Click_id) o;
        return users.equals(click_id.users) &&
                item_feature_show.equals(click_id.item_feature_show);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users, item_feature_show);
    }
}
