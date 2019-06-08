package com.example.demo.mapper;

import com.example.demo.entity.DingJia;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface DingJiaMapper {

    List<DingJia> selectByUsername(String  username);
    DingJia selectById(Integer id);
    Integer insert(String xuenian, String jiaocaimingcheng, BigDecimal dingjia,String beizhu,String username);
    Integer updateById(Integer id,String xuenian,String jiaocaimingcheng,BigDecimal dingjia,String beizhu);
    Integer deleteById(Integer id);
}
