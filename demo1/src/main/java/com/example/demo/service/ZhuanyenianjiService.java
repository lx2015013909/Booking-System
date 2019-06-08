package com.example.demo.service;

import com.example.demo.entity.Zhuanyenianji;
import com.example.demo.mapper.ZhuanyenianjiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhuanyenianjiService {

    @Autowired
    private ZhuanyenianjiMapper zhuanyenianjiMapper;

    public List<Zhuanyenianji> selecetAll(Integer academy){
        return zhuanyenianjiMapper.selectAll(academy);
    }
    public List<Zhuanyenianji> selecetAll1(){
        return zhuanyenianjiMapper.selectAll1();
    }

    public  int insert(Integer academy,String zhuanyenianji){
        if(zhuanyenianjiMapper.selectByZhuanyenianji(zhuanyenianji)!=null)
            return 0;
        else return  zhuanyenianjiMapper.insert(academy,zhuanyenianji);
    }

    public  int updateById(Integer id,String zhuanyenianji){
        return  zhuanyenianjiMapper.updateById(id,zhuanyenianji);
    }

    public int deleteById(Integer id){
        return  zhuanyenianjiMapper.deleteById(id);
    }
}
