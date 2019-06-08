package com.example.demo.mapper;

import com.example.demo.entity.Otherfee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface OtherfeeMapper {

    Otherfee selectByXuenian(String xuenian, String zhuanyenianji);
    Otherfee selectById(Integer id);
    List<Otherfee> selectAll();
    Integer insert(String xuenian, String zhuanyenianji, BigDecimal danjia,String beizhu);
    Integer updateById(Integer id, BigDecimal danjia,String beizhu);
    Integer deleteById(Integer id);
}
