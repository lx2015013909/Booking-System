package com.example.demo.service;

import com.example.demo.entity.Kechengbiao;
import com.example.demo.mapper.KechengbiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KechengbiaoService {

    @Autowired
    private KechengbiaoMapper kechengbiaoMapper;

    public List<Kechengbiao> selecetAll(Integer academy){
        return kechengbiaoMapper.selectAll(academy);
    }

    public List<Kechengbiao> selecetAllPublic(Integer academy){
        return kechengbiaoMapper.selectAllPublic(academy);
    }

    public  int insert(String kechengmingcheng,Integer academy){
        if(kechengbiaoMapper.selectByKechengmingcheng(kechengmingcheng)!=null)
            return 0;
        else return  kechengbiaoMapper.insert(kechengmingcheng,academy);
    }

    public  int deleteById(Integer id){
        return  kechengbiaoMapper.deleteById(id);
    }
}
