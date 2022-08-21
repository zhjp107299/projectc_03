package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.ScoreStudent;
import org.apache.ibatis.annotations.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreStudentRepository  extends JpaRepository<ScoreStudent,Integer> {

}
