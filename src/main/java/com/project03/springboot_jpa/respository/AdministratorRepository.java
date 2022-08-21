package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdministratorRepository extends JpaRepository<Admin,String> {
}
