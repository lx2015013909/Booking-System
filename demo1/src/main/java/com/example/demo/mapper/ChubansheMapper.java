package com.example.demo.mapper;

import com.example.demo.entity.Chubanshe;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface ChubansheMapper {

    List<Chubanshe> selectAll();
    List<Chubanshe> selectAll1();
    List<Chubanshe> selectByXuenian(String xuenian);
    List<Chubanshe> selectZheKou(String xuenian,String chubanshe);
    Chubanshe selectById(Integer id);
    Integer selectByAll(String xuenian,String baoming,String chubanshe);
    Integer insert(String xuenian, String baoming, String chubanshe, BigDecimal zhekou);
    Integer deleteById(Integer id);
    Integer updateById(Integer id,String xuenian,String baoming,String chubanshe,BigDecimal zhekou);
}
