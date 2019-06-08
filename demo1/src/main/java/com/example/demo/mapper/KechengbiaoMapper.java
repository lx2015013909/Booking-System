package com.example.demo.mapper;

import com.example.demo.entity.Kechengbiao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KechengbiaoMapper {

    List<Kechengbiao> selectAll(Integer academy);
    List<Kechengbiao> selectAllPublic(Integer academy);
    Integer selectByKechengmingcheng(String  kechengmingcheng);
    int insert(String kechengmingcheng,Integer academy);
    int deleteById(Integer id);
}
