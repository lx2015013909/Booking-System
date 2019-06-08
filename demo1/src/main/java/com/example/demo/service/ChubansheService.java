package com.example.demo.service;

import com.example.demo.entity.Chubanshe;
import com.example.demo.mapper.ChubansheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ChubansheService {

    @Autowired
    private ChubansheMapper chubansheMapper;

    public List<Chubanshe> selecetAll(){
        return chubansheMapper.selectAll();
    }
    public List<Chubanshe> selecetAll1(){
        return chubansheMapper.selectAll1();
    }
    public List<Chubanshe> selecetByXuenian(String xuenian){
        return chubansheMapper.selectByXuenian(xuenian);
    }

    public List<Chubanshe> selectZheKou(String xuenian,String chubanshe){
        return chubansheMapper.selectZheKou(xuenian,chubanshe);
    }

    public Chubanshe selectById(Integer id){
        return  chubansheMapper.selectById(id);
    }

    public  int insert(String xuenian, String baoming, String chubanshe, BigDecimal zhekou){
        if(chubansheMapper.selectByAll(xuenian,baoming,chubanshe)!=null)
            return 0;
        else
            return  chubansheMapper.insert(xuenian,baoming,chubanshe,zhekou);
    }

    public int deleteById(Integer id){
        return  chubansheMapper.deleteById(id);
    }

    public  int updateById(Integer id,String xuenian,String baoming,String chubanshe,BigDecimal zhekou){
        return chubansheMapper.updateById(id,xuenian,baoming,chubanshe,zhekou);
    }
}
