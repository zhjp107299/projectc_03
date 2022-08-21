//package com.project03.springboot_jpa.repository;
//
//
//import com.project03.springboot_jpa.pojo.Student;
//
//import com.project03.springboot_jpa.respository.StudentRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.PageRequest;
//
//import org.springframework.data.domain.Pageable;
//import java.util.List;
//
//@SpringBootTest
//public class JpaTests {
//
////    @Autowired
////    private CommentRespository repository;
////
////    @Test
////    public void getCommentPage(){
////        //展示第一页第三条数据
////        Pageable pageable = (Pageable) PageRequest.of(0,3);
////        List<Comment> commentList = repository.getCommentPage(1, pageable);
////        System.out.println(commentList);
////    }
//
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Test
//    //获取学生表的数据页面
//    public void getStudentPage(){
//        Student student = new Student(787878,"张三","男","123456");
//        System.out.println(studentRepository.save(student));
//    }
//}
