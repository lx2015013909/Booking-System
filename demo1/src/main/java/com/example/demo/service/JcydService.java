package com.example.demo.service;

import com.example.demo.entity.Chubanshe;
import com.example.demo.entity.Jcyd;
import com.example.demo.entity.feiyong;
import com.example.demo.mapper.JcydMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class JcydService {

    @Autowired
    private JcydMapper jcydMapper;

    @Autowired
    private ChubansheService chubansheService;

    @Autowired
    private EarphoneService earphoneService;

    @Autowired
    private OtherfeeService otherfeeService;

    public List<Jcyd> selecetAll(String username){
        return jcydMapper.selectAll(username);
    }

    public int insert(Jcyd record){
        if("".equals(record.getBeizhu()))
        {
            record.setBeizhu(null);
        }
        List<Chubanshe> chubanshe =chubansheService.selectZheKou(record.getXuenian(),record.getChubanshe());
        if(chubanshe.size()==1)
        {
            Chubanshe chubanshe1=chubanshe.get(0);
            record.setZhekou(chubanshe1.getZhekou());
            return jcydMapper.insert(record);
        }
        else
            return 0;
    }

    public List<Jcyd> selecetAllSys(Integer academy){
        return jcydMapper.selectAllSys(academy);
    }
    public List<Jcyd> selecetAllSys1(Integer academy){
        return jcydMapper.selectAllSys1(academy);
    }
    public Jcyd selecetSys1ById(Integer id){
        return jcydMapper.selectSys1ById(id);
    }
    public Integer SysTongGuo(Integer id){
        return jcydMapper.SysTongGuo(id);
    }
    public Integer SysJujue(Integer id){
        return jcydMapper.SysJujue(id);
    }
    public Integer Sys1Update(Integer id,String xuenian,String chubanshe,Integer xueshengshu, Integer jiaoben, Integer hejibenshu, BigDecimal dingjia,Integer flag){
        List<Chubanshe> chubanshe1 =chubansheService.selectZheKou(xuenian,chubanshe);
        if(chubanshe1.size()==1) {
           Chubanshe chubanshe2=chubanshe1.get(0);
            BigDecimal danjia = dingjia.multiply(chubanshe2.getZhekou());
            return jcydMapper.Sys1Update(id, xueshengshu, jiaoben, hejibenshu, dingjia, danjia, flag);
        }
        else
            return  0;
    }

    public List<Jcyd>  selecetAllSys2(){
        return jcydMapper.selecetAllSys2();
    }

    public List<Jcyd>  selecetAllSys2Public(){
        return jcydMapper.selecetAllSys2Public();
    }

    public Integer Sys2TongGuo(Integer id){
        return jcydMapper.Sys2TongGuo(id);
    }

    public Integer Sys2TongGuoPublic(Integer id){
        Jcyd jcyd=jcydMapper.selectSys1ById(id);
        List<Jcyd> jcyd1=jcydMapper.selectByKechengmingcheng(jcyd.getKechengmingcheng(),jcyd.getXuenian());
        if(jcyd1.size()==1) {
            Jcyd jcyd2=jcyd1.get(0);
            jcyd.setJiaocaimingcheng((String) jcyd2.getJiaocaimingcheng());
            jcyd.setZuozhe(jcyd2.getZuozhe());
            jcyd.setChubanshe(jcyd2.getChubanshe());
            jcyd.setChubanshijian(jcyd2.getChubanshijian());
            jcyd.setJiaocaileibie(jcyd2.getJiaocaileibie());
            jcyd.setDingjia(jcyd2.getDingjia());
            jcyd.setZhekou(jcyd2.getZhekou());
            jcyd.setDanjia(jcyd2.getDanjia());
            jcyd.setShuhao("");
            jcyd.setFlag(4);
            return jcydMapper.Sys2TongGuoPublic(jcyd);
        }
        else
            return 0;
    }
    public Integer Sys2Jujue(Integer id){
        return jcydMapper.Sys2Jujue(id);
    }

    public int insertPublic(Jcyd record){

        return jcydMapper.insertPublic(record);
    }
    public int insertPublicSpecial(Jcyd record){

        return jcydMapper.insertPublicSpecial(record);
    }

    public Integer Sys2Update(Integer id,String xuenian,String kechengmingcheng,Integer xueshengshu, Integer jiaoben, Integer hejibenshu,Integer flag){

        List<Jcyd> jcyd1=jcydMapper.selectByKechengmingcheng(kechengmingcheng,xuenian);
        if(jcyd1.size()==1){
            Jcyd jcyd=jcyd1.get(0);
            jcyd.setId(id);
            jcyd.setXueshengshu(xueshengshu);
            jcyd.setJiaoben(jiaoben);
            jcyd.setHejibenshu(hejibenshu);
            jcyd.setShuhao("");
            jcyd.setFlag(flag);
            return jcydMapper.Sys2Update(jcyd);
        }
        else
            return  0;
    }

    public  Integer updateByAdmin(String xuenian,String jiaocaimingcheng,BigDecimal dingjia){
        List<Jcyd> jcyd1=jcydMapper.selectByJiaocaimingcheng(xuenian,jiaocaimingcheng);
        Jcyd jcyd=jcyd1.get(0);
        jcydMapper.updateByAdmin(xuenian,jiaocaimingcheng,dingjia,dingjia.multiply(jcyd.getZhekou()));
        return 1;
    }

    public  List<Jcyd> GetJiaocaimingcheng(String academy,String xuenian){

        return jcydMapper.GetJiaocaimingcheng(academy,xuenian);
    }

    public  feiyong selectByXuenian(String xuenian,String zhuanyenianji){
        int i;
        BigDecimal count=new BigDecimal("0");
        feiyong feiyong=new feiyong();
        List<Jcyd> jcyd1=jcydMapper.selectByXuenian(xuenian,zhuanyenianji);
        for (i=0;i<jcyd1.size();i++){
        count=count.add(jcyd1.get(i).getDanjia());
        }
        feiyong.setXuenian(xuenian);
        feiyong.setZhuanyenianji(zhuanyenianji);
        feiyong.setShuben(count);
        feiyong.setEarphone(earphoneService.selecetByXuenian(xuenian,zhuanyenianji).getDanjia());
        feiyong.setOtherfee(otherfeeService.selecetByXuenian(xuenian,zhuanyenianji).getDanjia());
        feiyong.setHeji(count.add(feiyong.getEarphone().add(feiyong.getOtherfee())));
        return  feiyong;
    }

    public  List<Jcyd> sys2SelectAll(String xuenian,String academy){
        return  jcydMapper.sys2SelectAll(xuenian,academy);
    }
}
