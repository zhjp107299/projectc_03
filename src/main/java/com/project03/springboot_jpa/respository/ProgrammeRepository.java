package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.Judge;
import com.project03.springboot_jpa.pojo.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgrammeRepository extends JpaRepository<Programme,Integer> {

    @Query(value = "     select * from qb_programme\n" +
            "        where indepropo_name = ?1 \n" +
            "        order by rand()\n" +
            "        limit 0,3",nativeQuery = true)
    List<Programme> getIndeProgrammes3(String indepropoName);


    //获取3道编程题
    @Query(value = "        select distinct * from qb_programme\n" +
            "        where chapter = ?1\n" +
            "        order by rand()\n" +
            "        limit 0,3",nativeQuery = true)
    List<Programme> getQbProgrammes3(int index);

    //随机获取10/25/50判断题练习
    @Query(value = "   select distinct * from qb_programme\n" +
            "        order by rand()\n" +
            "        limit 0,?1",nativeQuery = true)
    List<Programme> getQbProgrammeListN(int count);

    @Query(value = "        select distinct * from projectc.qb_programme where c_level = ?1 \n" +
            "        order by rand()\n" +
            "        limit 0,4",nativeQuery = true)
    List<Programme> getQbProgramme_4(String type);

}
