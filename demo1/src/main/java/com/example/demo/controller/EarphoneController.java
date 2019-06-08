package com.example.demo.controller;

import com.example.demo.entity.Earphone;
import com.example.demo.service.EarphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/earphone")
public class EarphoneController {

    @Autowired
    private EarphoneService earphoneService;

    @PostMapping("")
    @ResponseBody
    public List<Earphone> selectAll(){

        List<Earphone> earphones=earphoneService.selecetAll();
        return  earphones;
    }

    @PostMapping("/select")
    @ResponseBody
    public Earphone selectByXuenian(@RequestParam(value = "xuenian")String xuenian,
                                    @RequestParam(value = "zhuanyenianji") String zhuanyenianji){

        Earphone earphone=earphoneService.selecetByXuenian(xuenian, zhuanyenianji);
        return  earphone;
    }

    @PostMapping("/selectById")
    @ResponseBody
    public Earphone selectById(@RequestParam(value = "id")Integer id){

        Earphone earphone=earphoneService.selecetById(id);
        return  earphone;
    }

    @PostMapping("/add")
    @ResponseBody
    public int Insert(@RequestParam(value = "xuenian") String xuenian,
            @RequestParam(value = "zhuanyenianji") String zhuanyenianji,
            @RequestParam(value = "danjia") BigDecimal danjia){
        int i=earphoneService.insert(xuenian,zhuanyenianji,danjia);
        return  i;
    }

    @PostMapping("/update")
    @ResponseBody
    public int Update(@RequestParam(value = "id") Integer id,
                      @RequestParam(value = "danjia") BigDecimal danjia){
        int i=earphoneService.updateById(id,danjia);
        return  i;
    }

    @PostMapping("/delete")
    @ResponseBody
    public Integer Delete(@RequestParam(value = "id") Integer id){
       int i=0;
       i=earphoneService.deleteById(id);
        return  i;
    }
}
