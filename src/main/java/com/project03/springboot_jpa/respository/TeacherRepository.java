package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

//    int countAllByTIdNotNull();

    @Query( value = "select * from projectc.teacher limit ?1,?2",nativeQuery = true)
    List<Teacher> getAllTeachers(@Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);


//    //原方法： Teacher getLoginTeacher(int id);
//    Teacher save(Teacher teacher);
//
//    List<Teacher> getTeacherList();
//
//    //修改教师信息
//    boolean modifyTeacher(Teacher teacher);
//
//    List<Teacher> getAllTeachers(@Param("currentPageNo") int currentPageNo, @Param("pageSize") int pageSize);
//
//    boolean deleteTeacher(int deleId);
//
//    int getTeachersCountAdmin();
//
//    boolean setTeacherStatus(@Param("id") String id,@Param("status") String status);
//
//    boolean setTeacherPermission(@Param("id") String id,@Param("permission") Integer permission);
//
//    LocalDate getTeacherDeadline(String id);
//
//    boolean setTeacherTime(@Param("id") String id, @Param("newTime") LocalDate newTime);
//
//    boolean addNewTeacher(Teacher newTeacher);
//
//    boolean teacherInputDB(List<Teacher> teachers);

}
