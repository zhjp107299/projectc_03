package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.Judge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JudgeRepository extends JpaRepository<Judge,Integer> {

    //获取12道判断题
    @Query(value = "select * from qb_judge\n" +
            "        where indepropo_name =?1 \n" +
            "        order by rand()\n" +
            "        limit 0,12",nativeQuery = true)
    List<Judge> getIndeJudges12(String indepropoName);


    @Query(value = "select distinct * from qb_judge\n" +
            "        where chapter = ?1 \n" +
            "        order by rand()\n" +
            "        limit 0,12;",nativeQuery = true)
    //获取12道判断题
    List<Judge> getQbJudges12(int index);


    @Query(value = "select distinct * from qb_judge\n" +
            "        order by rand()\n" +
            "        limit 0,?1",nativeQuery = true)
    //随机获取10/25/50判断题练习
    List<Judge> getQbJudgeListN(int count);
}
