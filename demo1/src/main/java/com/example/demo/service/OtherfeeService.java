package com.example.demo.service;

import com.example.demo.entity.Otherfee;
import com.example.demo.mapper.OtherfeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OtherfeeService {

    @Autowired
    private OtherfeeMapper otherfeeMapper;


    public List<Otherfee> selecetAll(){
        return otherfeeMapper.selectAll();
    }

    public Otherfee selecetByXuenian(String xuenian,String zhuanyenianji){
        return otherfeeMapper.selectByXuenian(xuenian,zhuanyenianji);
    }
    public Otherfee selecetById(Integer id){
        return otherfeeMapper.selectById(id);
    }

    public int insert(String xuenian, String zhuanyenianji, BigDecimal danjia,String beizhu){

        if(otherfeeMapper.selectByXuenian(xuenian,zhuanyenianji)!=null)
            return 0;
         else return  otherfeeMapper.insert(xuenian,zhuanyenianji,danjia,beizhu);
    }

    public   Integer updateById(Integer id,BigDecimal danjia,String beizhu){
       return otherfeeMapper.updateById(id,danjia,beizhu);
    }

    public   Integer deleteById(Integer id){
        return otherfeeMapper.deleteById(id);
    }
}
