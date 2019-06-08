package com.example.demo.mapper;

import com.example.demo.entity.Earphone;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface EarphoneMapper {

    Earphone selectByXuenian(String xuenian, String zhuanyenianji);
    Earphone selectById(Integer id);
    List<Earphone> selectAll();
    Integer insert(String xuenian, String zhuanyenianji, BigDecimal danjia);
    Integer updateById(Integer id,BigDecimal danjia);
    Integer deleteById(Integer id);
}
