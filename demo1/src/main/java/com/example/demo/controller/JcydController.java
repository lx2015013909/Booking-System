package com.example.demo.controller;

import com.example.demo.entity.Jcyd;
import com.example.demo.entity.feiyong;
import com.example.demo.service.JcydService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/jcyd")
@CrossOrigin
public class JcydController {

    @Autowired
    private JcydService jcydService;

    @ResponseBody
    @PostMapping("")
    public List<Jcyd> selectAll(@RequestParam(value = "username")String username){
        List<Jcyd> jcyds=jcydService.selecetAll(username);

        return jcyds ;
    }

    @ResponseBody
    @PostMapping("/add")
    public Integer addJc(@RequestParam(value = "xuenian")String xuenian,
                         @RequestParam(value = "kechengmingcheng")String kechengmingcheng,
                         @RequestParam(value = "shuhao")String shuhao,
                         @RequestParam(value = "jiaocaimingcheng")String jiaocaimingcheng,
                         @RequestParam(value = "zuozhe")String zuozhe,
                         @RequestParam(value = "chubanshe")String chubanshe,
                         @RequestParam(value = "chubanshijian")String chubanshijian,
                         @RequestParam(value = "jiaocaileibie")String jiaocaileibie,
                         @RequestParam(value = "zhuanyenianji")String zhuanyenianji,
                         @RequestParam(value = "xueshengshu")Integer xueshengshu,
                         @RequestParam(value = "jiaoben")Integer jiaoben,
                         @RequestParam(value = "hejibenshu")Integer hejibenshu,
                         @RequestParam(value = "beizhu")String beizhu,
                         @RequestParam(value = "username")String username,
                         @RequestParam(value = "academy")Integer academy){
                 Jcyd jcyd=new Jcyd();
                 jcyd.setXuenian(xuenian);
                 jcyd.setKechengmingcheng(kechengmingcheng);
                 jcyd.setShuhao(shuhao);
                 jcyd.setJiaocaimingcheng(jiaocaimingcheng);
                 jcyd.setZuozhe(zuozhe);
                 jcyd.setChubanshe(chubanshe);
                 jcyd.setChubanshijian(chubanshijian);
                 jcyd.setJiaocaileibie(jiaocaileibie);
                 jcyd.setZhuanyenianji(zhuanyenianji);
                 jcyd.setXueshengshu(xueshengshu);
                 jcyd.setJiaoben(jiaoben);
                 jcyd.setHejibenshu(hejibenshu);
                 jcyd.setBeizhu(beizhu);
                 jcyd.setUsername(username);
                 jcyd.setAcademy(academy);
                 jcyd.setFlag(1);
                int  i=jcydService.insert(jcyd);
        return i;
    }
    @ResponseBody
    @PostMapping("/sys")
    public List<Jcyd> selectAllSys(@RequestParam(value = "academy")Integer academy){
        List<Jcyd> jcyds=jcydService.selecetAllSys(academy);

        return jcyds ;
    }

    @ResponseBody
    @PostMapping("/sys/tongguo")
    public Integer SysTongGuo(@RequestParam(value = "id")Integer id){
        int i=0;
        i=jcydService.SysTongGuo(id);
        return i ;
    }

    @ResponseBody
    @PostMapping("/sys/jujue")
    public Integer SysJujue(@RequestParam(value = "id")Integer id){
        int i=0;
        i=jcydService.SysJujue(id);
        return i ;
    }

    @ResponseBody
    @PostMapping("/sys1")
    public List<Jcyd> selectAllSys1(@RequestParam(value = "academy")Integer academy){
        List<Jcyd> jcyds=jcydService.selecetAllSys1(academy);

        return jcyds ;
    }

    @ResponseBody
    @PostMapping("/sys1/by")
    public Jcyd selectSys1ById(@RequestParam(value = "id")Integer id){
        Jcyd jcyd=jcydService.selecetSys1ById(id);

        return jcyd ;
    }

    @ResponseBody
    @PostMapping("/sys1/update")
    public Integer Sys1Update(@RequestParam(value = "id")Integer id,
                              @RequestParam(value = "xuenian") String xuenian,
                              @RequestParam(value = "chubanshe") String chubanshe,
                              @RequestParam(value = "xueshengshu")Integer xueshengshu,
                              @RequestParam(value = "jiaoben")Integer jiaoben,
                              @RequestParam(value = "hejibenshu")Integer hejibenshu,
                              @RequestParam(value = "dingjia") BigDecimal dingjia,
                              @RequestParam(value = "flag")Integer flag){
        int i=0;
        i=jcydService.Sys1Update(id,xuenian,chubanshe,xueshengshu,jiaoben,hejibenshu,dingjia,flag);
        return i ;
    }

    @ResponseBody
    @PostMapping("/sys2")
    public List<Jcyd> selectAllSys2(){
        List<Jcyd> jcyds=jcydService.selecetAllSys2();
        return jcyds ;
    }

    @ResponseBody
    @PostMapping("/sys2/public")
    public List<Jcyd> selectAllSys2Public(){
        List<Jcyd> jcyds=jcydService.selecetAllSys2Public();
        return jcyds ;
    }

    @ResponseBody
    @PostMapping("/sys2/tongguo")
    public Integer Sys2TongGuo(@RequestParam(value = "id")Integer id){
        int i=0;
        i=jcydService.Sys2TongGuo(id);
        return i ;
    }

    @ResponseBody
    @PostMapping("/sys2/tongguo/public")
    public Integer Sys2TongGuoPublic(@RequestParam(value = "id")Integer id){
        int i=0;
        i=jcydService.Sys2TongGuoPublic(id);
        return i ;
    }

    @ResponseBody
    @PostMapping("/sys2/jujue")
    public Integer Sys2Jujue(@RequestParam(value = "id")Integer id){
        int i=0;
        i=jcydService.Sys2Jujue(id);
        return i ;
    }

    @ResponseBody
    @PostMapping("/add/public")
    public Integer addJc(@RequestParam(value = "xuenian")String xuenian,
                         @RequestParam(value = "kechengmingcheng")String kechengmingcheng,
                         @RequestParam(value = "zhuanyenianji")String zhuanyenianji,
                         @RequestParam(value = "beizhu")String beizhu,
                         @RequestParam(value = "username")String username,
                         @RequestParam(value = "academy")Integer academy){
        Jcyd jcyd=new Jcyd();
        jcyd.setXuenian(xuenian);
        jcyd.setKechengmingcheng(kechengmingcheng);
        jcyd.setZhuanyenianji(zhuanyenianji);
        jcyd.setBeizhu(beizhu);
        jcyd.setShuhao("");
        jcyd.setUsername(username);
        jcyd.setAcademy(academy);
        jcyd.setFlag(3);
        int  i=jcydService.insertPublic(jcyd);
        return i;
    }
    @ResponseBody
    @PostMapping("/add/public/special")
    public Integer addJcSpecial(@RequestParam(value = "xuenian")String xuenian,
                         @RequestParam(value = "kechengmingcheng")String kechengmingcheng,
                         @RequestParam(value = "zhuanyenianji")String zhuanyenianji,
                         @RequestParam(value = "xueshengshu")Integer xueshengshu,
                         @RequestParam(value = "jiaoben")Integer jiaoben,
                         @RequestParam(value = "hejibenshu")Integer hejibenshu,
                         @RequestParam(value = "beizhu")String beizhu,
                         @RequestParam(value = "username")String username,
                         @RequestParam(value = "academy")Integer academy,
                         @RequestParam(value = "flag")Integer flag){
        Jcyd jcyd=new Jcyd();
        jcyd.setXuenian(xuenian);
        jcyd.setKechengmingcheng(kechengmingcheng);
        jcyd.setZhuanyenianji(zhuanyenianji);
        jcyd.setXueshengshu(xueshengshu);
        jcyd.setJiaoben(jiaoben);
        jcyd.setShuhao("");
        jcyd.setHejibenshu(hejibenshu);
        jcyd.setBeizhu(beizhu);
        jcyd.setUsername(username);
        jcyd.setAcademy(academy);
        jcyd.setFlag(flag);
        int  i=jcydService.insertPublicSpecial(jcyd);
        return i;
    }

    @ResponseBody
    @PostMapping("/sys2/update")
    public Integer Sys2Update(@RequestParam(value = "id")Integer id,
                              @RequestParam(value = "xuenian") String xuenian,
                              @RequestParam(value = "kechengmingcheng") String kechengmingcheng,
                              @RequestParam(value = "xueshengshu")Integer xueshengshu,
                              @RequestParam(value = "jiaoben")Integer jiaoben,
                              @RequestParam(value = "hejibenshu")Integer hejibenshu,
                              @RequestParam(value = "flag")Integer flag){
        int i=0;
        i=jcydService.Sys2Update(id,xuenian,kechengmingcheng,xueshengshu,jiaoben,hejibenshu,flag);
        return i ;
    }

    @ResponseBody
    @PostMapping("/jiaocaimingcheng")
    public List<Jcyd> GetJiaocaimingcheng(@RequestParam(value = "academy")String  academy,
                                          @RequestParam(value = "xuenian")String  xuenian){
        int i=0;
        return  jcydService.GetJiaocaimingcheng(academy,xuenian);

    }

    @ResponseBody
    @PostMapping("/xuenian")
    public feiyong selectByXuenian(@RequestParam(value = "xuenian")String  xuenian,
                                   @RequestParam(value = "zhuanyenianji")String  zhuanyenianji){

        return  jcydService.selectByXuenian(xuenian,zhuanyenianji);

    }

    @ResponseBody
    @PostMapping("/sys2/selectAll")
    public List<Jcyd> selectAll(@RequestParam(value = "xuenian")String  xuenian,
                                @RequestParam(value = "academy")String  academy){
        return  jcydService.sys2SelectAll(xuenian,academy);
    }

}
