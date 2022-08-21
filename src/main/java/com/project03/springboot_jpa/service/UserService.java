package com.project03.springboot_jpa.service;

import com.project03.springboot_jpa.pojo.Admin;
import com.project03.springboot_jpa.pojo.Student;
import com.project03.springboot_jpa.pojo.Teacher;

import java.time.LocalDate;
import java.util.List;


public interface UserService {

    public boolean addScoreStudent(int scoreId);

    boolean addNewStudent(Student student);

    //获取用户总数
    int getStudentsCount(String tName);
    int getStudentsCountAdmin();

    //获取登录用户
    Teacher getLoginTeacher(int id);
    Student getLoginStudent(int username);
    Admin getLoginAdmin(String id);

    //查询注册的学生总数
    List<Student> getStudentListLimit(String tName, int currentPage, int pageSize);
    List<Student> getStudentList();
    List<Teacher> getTeacherList();
    //修改教师信息
    boolean modifyTeacher(Teacher teacher);

    /*学生信息的增删改查*/
    boolean studentInputDB(List<Student> students);
    boolean deleteStudent(int deleId);
    boolean modifyStudent(Student modiStu);

    //批量添加
    boolean addScoreStudentList(List<Student> students);


    /**
     * admin
     * @return
     */
    List<Student> getAllStudents(int currentPage, int pageSize);
    //查询注册的教师总数
    List<Teacher> getAllTeachers(int currentPage, int pageSize);
    boolean setStudentStatus(String status, int id);
    boolean setStudentPermission(int s_id,Integer permission);
    LocalDate getStudentDeadline(int s_id);
    boolean setStudentTime(int s_id, LocalDate newTime);
    boolean deleteTeacher(int t_id);
    int getTeachersCountAdmin();
    boolean setTeacherStatus(int t_id,String status);
    boolean setTeacherPermission(int t_id,Integer permission);
    LocalDate getTeacherDeadline(int t_id);
    boolean setTeacherTime(int t_id,LocalDate newTime);
    boolean addNewTeacher(Teacher newTeacher);
    boolean teacherInputDB(List<Teacher> teacherList);
    boolean addNewAdmin(Admin newAdmin);
    boolean modifyAdmin(Admin admin);
    boolean deleteStudentScore(int s_Id);
    List<Admin> getAdminList();
}
