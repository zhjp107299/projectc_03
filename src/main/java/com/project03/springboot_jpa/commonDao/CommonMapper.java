package com.project03.springboot_jpa.commonDao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommonMapper {

    @Update("   update ${indeType}\n" +
            "  set `indepropo_switch` = #{newStatus} where `indepropo_name` = #{indeName};")
    boolean changeIndePropoStatus(@Param("indeType") String indeType, @Param("newStatus") String newStatus, @Param("indeName") String indeName);

}
