package com.example.demo.controller;

import com.example.demo.entity.Zhuanyenianji;
import com.example.demo.service.ZhuanyenianjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/zhuanyenianji")
public class ZhuanyenianjiController {

    @Autowired
    private ZhuanyenianjiService zhuanyenianjiService;



    @PostMapping("")
    @ResponseBody
    public List<Zhuanyenianji> selectAll(@RequestParam(value = "academy")Integer academy){

        List<Zhuanyenianji> zhuanyenianjis=zhuanyenianjiService.selecetAll(academy);
        return  zhuanyenianjis;
    }

    @PostMapping("/add")
    @ResponseBody
    public int add(@RequestParam(value = "academy")Integer academy,
                   @RequestParam(value = "zhuanyenianji")String zhuanyenianji){

        return  zhuanyenianjiService.insert(academy,zhuanyenianji);
    }

    @PostMapping("/delete")
    @ResponseBody
    public int deleteById(@RequestParam(value = "id")Integer id){

        return  zhuanyenianjiService.deleteById(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public int updateById(@RequestParam(value = "id")Integer id,
                   @RequestParam(value = "zhuanyenianji")String zhuanyenianji){

        return  zhuanyenianjiService.updateById(id,zhuanyenianji);
    }


    @PostMapping("/all")
    @ResponseBody
    public List<Zhuanyenianji> selectAll(){

        List<Zhuanyenianji> zhuanyenianjis=zhuanyenianjiService.selecetAll1();
        return  zhuanyenianjis;
    }
}
