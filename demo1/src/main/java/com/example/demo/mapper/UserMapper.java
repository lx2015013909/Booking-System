package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User findByUsername(String username, String password);
    List<User> selectAll();
    Integer insert(String username,String password,String name,String academy,String flag);
    Integer deleteById(Integer id);
    Integer updateById(Integer id,String password);
}
