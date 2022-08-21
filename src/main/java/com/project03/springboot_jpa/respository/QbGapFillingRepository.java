package com.project03.springboot_jpa.respository;

import com.project03.springboot_jpa.pojo.GapFilling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QbGapFillingRepository extends JpaRepository<GapFilling,Integer> {

    @Query(value = "   select * from qb_gap_filling\n" +
            "        where indepropo_name = ?1\n" +
            "        order by rand()\n" +
            "        limit 0,8", nativeQuery = true)
    List<GapFilling> getIndeGapFillings8(String indepropoName);

    //获取8道填空题
    @Query(value = " select distinct * from qb_gap_filling\n" +
            "        where chapter = ?1 \n" +
            "        order by rand()\n" +
            "        limit 0,8",nativeQuery = true)
    List<GapFilling> getQbGapFillings8(int index);

    //随机获取10/25/50填空题练习
    @Query(value = "select distinct * from qb_gap_filling\n" +
            "        order by rand()\n" +
            "        limit 0,?1",nativeQuery = true)
    List<GapFilling> getQbGapFillingNList(int count);

    @Query(value = "        select distinct * from qb_gap_filling where c_level =?1 \n" +
            "        order by rand()\n" +
            "        limit 0,20",nativeQuery = true)
    List<GapFilling> getQbGapFilling_20(String type);


}
