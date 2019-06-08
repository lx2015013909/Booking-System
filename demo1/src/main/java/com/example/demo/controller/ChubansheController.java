package com.example.demo.controller;

import com.example.demo.entity.Chubanshe;
import com.example.demo.service.ChubansheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/chubanshe")
public class ChubansheController {

    @Autowired
    private ChubansheService chubansheService;

    @PostMapping("")
    @ResponseBody
    public List<Chubanshe> selectAll(){

        List<Chubanshe> chubanshes=chubansheService.selecetAll();
        return  chubanshes;
    }

    @PostMapping("/all")
    @ResponseBody
    public List<Chubanshe> selectAll1(){

        List<Chubanshe> chubanshes=chubansheService.selecetAll1();
        return  chubanshes;
    }

    @PostMapping("/xuenian")
    @ResponseBody
    public List<Chubanshe> selectByXuenian(@RequestParam(value = "xuenian")String xuenian){

        List<Chubanshe> chubanshes=chubansheService.selecetByXuenian(xuenian);
        return  chubanshes;
    }

    @PostMapping("/add")
    @ResponseBody
    public int  insert(@RequestParam(value = "xuenian")String xuenian,
                       @RequestParam(value = "baoming")String baoming,
                       @RequestParam(value = "chubanshe")String chubanshe,
                       @RequestParam(value = "zhekou") BigDecimal zhekou){
        return  chubansheService.insert(xuenian,baoming,chubanshe,zhekou);
    }

    @PostMapping("/update")
    @ResponseBody
    public int  updateById(@RequestParam(value = "id")Integer id,
                       @RequestParam(value = "xuenian")String xuenian,
                       @RequestParam(value = "baoming")String baoming,
                       @RequestParam(value = "chubanshe")String chubanshe,
                       @RequestParam(value = "zhekou") BigDecimal zhekou){
        return  chubansheService.updateById(id,xuenian,baoming,chubanshe,zhekou);
    }

    @PostMapping("/delete")
    @ResponseBody
    public int  deleteById(@RequestParam(value = "id")Integer id){
        return  chubansheService.deleteById(id);
    }

    @PostMapping("/select")
    @ResponseBody
    public Chubanshe  selectById(@RequestParam(value = "id")Integer id){
        return  chubansheService.selectById(id);
    }



}
