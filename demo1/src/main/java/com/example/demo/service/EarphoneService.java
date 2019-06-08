package com.example.demo.service;

import com.example.demo.entity.Earphone;
import com.example.demo.mapper.EarphoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EarphoneService {

    @Autowired
    private EarphoneMapper earphoneMapper;


    public List<Earphone> selecetAll(){
        return earphoneMapper.selectAll();
    }

    public Earphone selecetByXuenian(String xuenian,String zhuanyenianji){
        return earphoneMapper.selectByXuenian(xuenian,zhuanyenianji);
    }
    public Earphone selecetById(Integer id){
        return earphoneMapper.selectById(id);
    }

    public int insert(String xuenian, String zhuanyenianji, BigDecimal danjia){
                if(earphoneMapper.selectByXuenian(xuenian,zhuanyenianji)!=null){
                    return 0;
                }
       else  return  earphoneMapper.insert(xuenian,zhuanyenianji,danjia);
    }

    public   Integer updateById(Integer id,BigDecimal danjia){
       return earphoneMapper.updateById(id,danjia);
    }

    public   Integer deleteById(Integer id){
        return earphoneMapper.deleteById(id);
    }
}
