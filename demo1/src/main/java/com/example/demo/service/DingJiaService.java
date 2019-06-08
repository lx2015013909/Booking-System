package com.example.demo.service;

import com.example.demo.entity.DingJia;
import com.example.demo.mapper.DingJiaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DingJiaService {

    @Autowired
    private DingJiaMapper dingJiaMapper;

    @Autowired
    private JcydService jcydService;

    public List<DingJia> selecetByUsername(String username){
        return dingJiaMapper.selectByUsername(username);
    }

    public DingJia selecetById(Integer id){
        return dingJiaMapper.selectById(id);
    }

    public int insert(String xuenian, String jiaocaimingcheng, BigDecimal dingjia,String beizhu,String username){

        int i=0;
        i=jcydService.updateByAdmin(xuenian,jiaocaimingcheng,dingjia);
        if(i==0)
        {
            dingJiaMapper.insert(xuenian,jiaocaimingcheng,dingjia,beizhu,username);
            return -1;
        }
        else
        {
            return  dingJiaMapper.insert(xuenian,jiaocaimingcheng,dingjia,beizhu,username);
        }
    }

    public   Integer updateById(Integer id,String xuenian,String jiaocaimingcheng,BigDecimal dingjia,String beizhu){
        int i=0;
        jcydService.updateByAdmin(xuenian,jiaocaimingcheng,dingjia);
        i=dingJiaMapper.updateById(id,xuenian,jiaocaimingcheng,dingjia,beizhu);
      return i;
    }

    public   Integer deleteById(Integer id){
        return dingJiaMapper.deleteById(id);
    }
}
