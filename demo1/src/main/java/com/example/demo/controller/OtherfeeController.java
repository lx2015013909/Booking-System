package com.example.demo.controller;

import com.example.demo.entity.Otherfee;
import com.example.demo.service.OtherfeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/otherfee")
public class OtherfeeController {

    @Autowired
    private OtherfeeService otherfeeService;

    @PostMapping("")
    @ResponseBody
    public List<Otherfee> selectAll(){

        List<Otherfee> otherfees=otherfeeService.selecetAll();
        return  otherfees;
    }

    @PostMapping("/select")
    @ResponseBody
    public Otherfee selectByXuenian(@RequestParam(value = "xuenian")String xuenian,
                                    @RequestParam(value = "zhuanyenianji") String zhuanyenianji){

        Otherfee otherfee=otherfeeService.selecetByXuenian(xuenian, zhuanyenianji);
        return  otherfee;
    }

    @PostMapping("/selectById")
    @ResponseBody
    public Otherfee selectById(@RequestParam(value = "id")Integer id){

        Otherfee otherfee=otherfeeService.selecetById(id);
        return  otherfee;
    }

    @PostMapping("/add")
    @ResponseBody
    public int Insert(@RequestParam(value = "xuenian") String xuenian,
            @RequestParam(value = "zhuanyenianji") String zhuanyenianji,
            @RequestParam(value = "danjia") BigDecimal danjia,
            @RequestParam(value = "beizhu") String beizhu){
        int i=otherfeeService.insert(xuenian,zhuanyenianji,danjia,beizhu);
        return  i;
    }

    @PostMapping("/update")
    @ResponseBody
    public int Update(@RequestParam(value = "id") Integer id,
                      @RequestParam(value = "danjia") BigDecimal danjia,
                      @RequestParam(value = "beizhu") String beizhu){
        int i=otherfeeService.updateById(id,danjia,beizhu);
        return  i;
    }

    @PostMapping("/delete")
    @ResponseBody
    public Integer Delete(@RequestParam(value = "id") Integer id){
       int i=0;
       i=otherfeeService.deleteById(id);
        return  i;
    }
}
