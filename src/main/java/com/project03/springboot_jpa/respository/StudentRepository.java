package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {




    @Query(value = "  select count(1) as count from student where s_teacher = ?1 ",nativeQuery = true)
    int countAllBySTeacher(String teacher_name);

//    int countBySIdNotNull();


    @Query(value = "   select * from student\n" +
            "        where s_teacher = ?1 \n" +
            "        limit ?2 ,?3",nativeQuery = true)
    List<Student> getStudentListLimit(@Param("tName") String tName, @Param("currentPageNo") int currentPageNo, @Param("pageSize") int pageSize);


    @Query(value = "select * from student limit ?1,?2 ",nativeQuery = true)

    List<Student> getAllStudents(@Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);

}
