package com.example.demo.mapper;

import com.example.demo.entity.Zhuanyenianji;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZhuanyenianjiMapper {

    List<Zhuanyenianji> selectAll(Integer academy);
    List<Zhuanyenianji> selectAll1();
    Zhuanyenianji selectByZhuanyenianji(String zhuanyenianji);
    int insert(Integer academy,String zhuanyenianji);
    int deleteById(Integer id);
    int updateById(Integer id,String zhuanyenianji);
}
