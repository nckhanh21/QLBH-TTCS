package com.example.qlbh.reponsitory;

import com.example.qlbh.entity.Account_login;
import com.example.qlbh.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {
}
