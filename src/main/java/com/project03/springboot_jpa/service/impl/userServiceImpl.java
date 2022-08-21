package com.project03.springboot_jpa.service.impl;

import com.project03.springboot_jpa.pojo.Admin;
import com.project03.springboot_jpa.pojo.ScoreStudent;
import com.project03.springboot_jpa.pojo.Student;
import com.project03.springboot_jpa.pojo.Teacher;
import com.project03.springboot_jpa.respository.AdministratorRepository;
import com.project03.springboot_jpa.respository.ScoreStudentRepository;
import com.project03.springboot_jpa.respository.StudentRepository;
import com.project03.springboot_jpa.respository.TeacherRepository;
import com.project03.springboot_jpa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class userServiceImpl implements UserService {

    @Resource
    ScoreStudentRepository scoreStudentRepository;

    @Resource
    StudentRepository studentRepository;

    @Resource
    TeacherRepository teacherRepository;

    @Resource
    AdministratorRepository administratorRepository;


    @Override
    public boolean addScoreStudent(int scoreId) {
        ScoreStudent scoreStudent = scoreStudentRepository.save(new ScoreStudent(scoreId));
        if (scoreStudent.getScoreId() != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addNewStudent(Student student){
        Student student1 = studentRepository.save(student);
        if (student1.getSId() != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getStudentsCount(String tName) {
        return  studentRepository.countAllBySTeacher(tName);
    }

    @Override
    public int getStudentsCountAdmin() {
        return studentRepository.findAll().size();
    }

    @Override
    public Teacher getLoginTeacher(int t_id) {
        return  teacherRepository.findById(t_id).orElse(null);

    }

    @Override
    public Student getLoginStudent(int s_id) {
        return studentRepository.findById(s_id).orElse(null);
    }

    @Override
    public Admin getLoginAdmin(String A_id) {
        return administratorRepository.findById(A_id).orElse(null);
    }

    @Override
    public List<Student> getStudentListLimit(String tName, int currentPage, int pageSize) {
        return studentRepository.getStudentListLimit(tName,currentPage,pageSize);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherRepository.findAll();
    }

    @Override
    public boolean modifyTeacher(Teacher teacher) {
        if (teacher==null){
            return false;
        }else {
            Teacher teacher1 = teacherRepository.save(teacher);
            return  true;
        }
    }

    @Override
    public boolean studentInputDB(List<Student> students) {
        List<Student> studentList =studentRepository.saveAll(students);
        return studentList.size()==students.size();
    }

    @Override
    public boolean deleteStudent(int s_id) {
        if (!studentRepository.findById(s_id).isPresent()){
            return false;
        }else {
            studentRepository.deleteById(s_id);
            return true;
        }

    }

    @Override
    public boolean modifyStudent(Student student) {
        if (student==null){
            return false;
        }else {
            studentRepository.save(student);
            return  true;
        }
    }

    //不确定是不是这样写的

    @Override
    public boolean addScoreStudentList(List<Student> students) {
        for (Student student : students){
            scoreStudentRepository.save(new ScoreStudent(student.getSId()));
        }
            return true;
    }

    @Override
    public List<Student> getAllStudents(int currentPage, int pageSize) {
        return studentRepository.getAllStudents(currentPage,pageSize);
    }

    @Override
    public List<Teacher> getAllTeachers(int currentPage, int pageSize) {
        return teacherRepository.getAllTeachers(currentPage,pageSize);
    }

    @Override
    public boolean setStudentStatus(String status, int s_id) {
        Optional<Student> student = studentRepository.findById(s_id);
        if (!student.isPresent()){
            return false;
        }
        else {
            student.get().setStatus(Boolean.parseBoolean(status));
            studentRepository.save(student.get());
            return true;
        }

    }

    @Override
    public boolean setStudentPermission(int s_id, Integer permission) {
        Optional<Student> student = studentRepository.findById(s_id);
        if (!student.isPresent()){
            return false;
        }
        else {
            student.get().setSPermission(permission);
            studentRepository.save(student.get());
            return true;
        }
    }

    @Override
    public LocalDate getStudentDeadline(int s_id) {
        Optional<Student> student = studentRepository.findById(s_id);
        if (!student.isPresent()){
            return null;
        }
        else {
           return student.get().getSDeadline();
        }
    }

    @Override
    public boolean setStudentTime(int s_id, LocalDate newTime){
        Optional<Student> student = studentRepository.findById(s_id);
        if (!student.isPresent()){
            return false;
        }
        else {
            student.get().setSDeadline(newTime);
            studentRepository.save(student.get());
            return true;

        }


    }

    @Override
    public boolean deleteTeacher(int t_id) {
        Optional<Teacher> teacher = teacherRepository.findById(t_id);
        if (!teacher.isPresent()){
            return false;
        }
        else {
            teacherRepository.deleteById(t_id);
            return true;

        }
    }



    @Override
    public int getTeachersCountAdmin() {
       return teacherRepository.findAll().size();
    }

    @Override
    public boolean setTeacherStatus(int t_id, String status){
    Optional<Teacher> teacher = teacherRepository.findById(t_id);
        if (!teacher.isPresent()){
        return false;
    }
        else {
        teacher.get().setStatus(Boolean.parseBoolean(status));
        teacherRepository.save(teacher.get());
        return true;
    }
    }

    @Override
    public boolean setTeacherPermission(int t_id, Integer permission) {
        Optional<Teacher> teacher = teacherRepository.findById(t_id);
        if (!teacher.isPresent()){
            return false;
        }
        else {
            teacher.get().setTPermission(permission);
            teacherRepository.save(teacher.get());
            return true;
        }
    }

    @Override
    public LocalDate getTeacherDeadline(int t_id) {
        Optional<Teacher> teacher = teacherRepository.findById(t_id);
        if (!teacher.isPresent()){
            return null;
        }
        else {
            return teacher.get().getTDeadline();
        }
    }

    @Override
    public boolean setTeacherTime(int t_id, LocalDate newTime) {

        Optional<Teacher> teacher = teacherRepository.findById(t_id);
        if (!teacher.isPresent()){
            return false;
        }
        else {
            teacher.get().setTDeadline(newTime);
            teacherRepository.save(teacher.get());
            return true;

        }
    }

    @Override
    public boolean addNewTeacher(Teacher newTeacher) {

        Teacher teacher1 = teacherRepository.save(newTeacher);
        if (teacher1.getTId() != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean teacherInputDB(List<Teacher> teacherList){

        List<Teacher> teacherList1 =teacherRepository.saveAll(teacherList);
        return teacherList1.size()==teacherList.size();
    }

    @Override
    public boolean addNewAdmin(Admin newAdmin) {

        Admin admin1 = administratorRepository.save( newAdmin);
        if (admin1.getAdministrator() != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean modifyAdmin(Admin admin) {
        if (admin==null){
            return false;
        }else {
            administratorRepository.save(admin);
            return  true;
        }

    }

    @Override
    public boolean deleteStudentScore(int s_id){
        if (!scoreStudentRepository.findById(s_id).isPresent()){
            return false;
        }else
        {
            scoreStudentRepository.deleteById(s_id);
            return true;
        }

}

    @Override
    public List<Admin> getAdminList() {

        return administratorRepository.findAll();
    }


}