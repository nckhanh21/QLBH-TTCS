package com.example.qlbh.reponsitory;

import com.example.qlbh.entity.Account_login;
import com.example.qlbh.entity.Account_profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Account_profileRepository extends JpaRepository<Account_profile, Integer> {
}
