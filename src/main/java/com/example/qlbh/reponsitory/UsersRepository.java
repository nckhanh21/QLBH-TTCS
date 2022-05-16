package com.example.qlbh.reponsitory;

import com.example.qlbh.entity.Account_profile;
import com.example.qlbh.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
