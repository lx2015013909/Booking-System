package com.example.demo.controller;

import com.example.demo.entity.DingJia;
import com.example.demo.service.DingJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/dj")
public class DingJiaController {

    @Autowired
    private DingJiaService dingJiaService;

    @PostMapping("")
    @ResponseBody
    public List<DingJia> selectByUsername(@RequestParam(value = "username")String  Username){

        List<DingJia> dingJias=dingJiaService.selecetByUsername(Username);
        return  dingJias;
    }

    @PostMapping("/add")
    @ResponseBody
    public int Insert(@RequestParam(value = "xuenian") String xuenian,
            @RequestParam(value = "jiaocaimingcheng") String jiaocaimingcheng,
            @RequestParam(value = "dingjia") BigDecimal dingjia,
            @RequestParam(value = "beizhu") String beizhu,
            @RequestParam(value = "username")String  username){
        int i=dingJiaService.insert(xuenian,jiaocaimingcheng,dingjia,beizhu, username);
        return  i;
    }

    @PostMapping("/update")
    @ResponseBody
    public int Update(@RequestParam(value = "id") Integer id,
                        @RequestParam(value = "xuenian") String xuenian,
                      @RequestParam(value = "jiaocaimingcheng") String jiaocaimingcheng,
                      @RequestParam(value = "dingjia") BigDecimal dingjia,
                      @RequestParam(value = "beizhu") String beizhu){
        int i=dingJiaService.updateById(id,xuenian,jiaocaimingcheng,dingjia,beizhu);
        return  i;
    }

    @PostMapping("/by")
    @ResponseBody
    public DingJia Update(@RequestParam(value = "id") Integer id){
       DingJia dingJia=dingJiaService.selecetById(id);
        return  dingJia;
    }

    @PostMapping("/delete")
    @ResponseBody
    public Integer Delete(@RequestParam(value = "id") Integer id){
       int i=0;
       i=dingJiaService.deleteById(id);
        return  i;
    }
}
