package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QbChoiceRepository extends JpaRepository<Choice, Integer> {


    @Query(value = "select distinct indepropo_name,indepropo_switch from qb_choice where indepropo_name is not null and indepropo_name like %?1%", nativeQuery = true)
    List<IndepropoShow> getIndepropoShowList(String teacher);


    @Query(value = "  select distinct indepropo_switch from qb_choice where indepropo_name = ?1", nativeQuery = true)
    String getIndePropoNameStatus(String indeName);

    @Query(value = "SELECT DISTINCT indepropo_name FROM qb_choice\n" +
            "        WHERE indepropo_name IS NOT NULL\n" +
            "        AND indepropo_name\n" +
            "        LIKE '%?1%' ", nativeQuery = true)
    List<IndepropoShow> getIndepropoNameList(String teacher);

    @Query(value = " select * from qb_choice where indepropo_name = ?1 order by rand() limit 0,12",nativeQuery = true)
//@Query(value = " select * from qb_choice  order by rand() limit 0,12",nativeQuery = true)
    List<Choice> getIndeChoices12(String indepropoName);




    @Query(value = "   select * from qb_gap_filling\n" +
            "        where indepropo_name = ?1\n" +
            "        order by rand()\n" +
            "        limit 0,8", nativeQuery = true)
    List<GapFilling> getIndeGapFillings8(String indepropoName);


    @Query(value = "        select * from qb_judge where indepropo_name = ?1 order by rand() limit 0,12", nativeQuery = true)
    List<Judge> getIndeJudges12(String indepropoName);





    @Query(value = "        select * from qb_programme\n" +
            "        where indepropo_name = ?1\n" +
            "        order by rand()\n" +
            "        limit 0,3", nativeQuery = true)
    List<Programme> getIndeProgrammes3(String indepropoName);





    @Modifying
    @Query(value = "update ?1  set indepropo_switch = ?2 where indepropo_name = ?3", nativeQuery = true)
    boolean changeIndePropoStatus(String indeType, String newStatus, String indeName);


    //获取12道选择题
    @Query(value = "    select distinct * from projectc.qb_choice\n" +
            "         where chapter = ?1\n" +
            "         order by rand()\n" +
            "         limit 0,12",nativeQuery = true)
    List<Choice> getQbChoices12(int index);


    //随机获取10/25/50选择题练习
    @Query(value = " select distinct * from qb_choice\n" +
            "        order by rand() \n" +
            "        limit 0,?1",nativeQuery = true)
    List<Choice> getQbChoiceNList(int count);

    //c模块
    @Query(value = "select distinct * from qb_choice where c_level = ?1 \n" +
            "        order by rand()\n" +
            "        limit 0,50",nativeQuery = true)
    List<Choice> getQbChoice_50(String type);


}
