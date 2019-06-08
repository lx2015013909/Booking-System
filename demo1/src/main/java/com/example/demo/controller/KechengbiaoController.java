package com.example.demo.controller;

import com.example.demo.entity.Kechengbiao;
import com.example.demo.service.KechengbiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/kechengbiao")
public class KechengbiaoController {

    @Autowired
    private KechengbiaoService kechengbiaoService;

    @PostMapping("")
    @ResponseBody
    public List<Kechengbiao> selectAll(@RequestParam(value = "academy")Integer academy){
        List<Kechengbiao> kechengbiaos=kechengbiaoService.selecetAll(academy);
        return  kechengbiaos;
    }

    @PostMapping("/public")
    @ResponseBody
    public List<Kechengbiao> selectAllPublic(@RequestParam(value = "academy")Integer academy){
        List<Kechengbiao> kechengbiaos=kechengbiaoService.selecetAllPublic(academy);
        return  kechengbiaos;
    }

    @PostMapping("/add")
    @ResponseBody
    public int insert(@RequestParam(value = "academy")Integer academy,
                                    @RequestParam(value = "kechengmingcheng")String kechengmingcheng ){
        return  kechengbiaoService.insert(kechengmingcheng,academy);
    }
    @PostMapping("/delete")
    @ResponseBody
    public int deleteById(@RequestParam(value = "id")Integer id){
        return  kechengbiaoService.deleteById(id);
    }
}
