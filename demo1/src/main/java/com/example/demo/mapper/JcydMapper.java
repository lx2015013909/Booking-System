package com.example.demo.mapper;

import com.example.demo.entity.Jcyd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface JcydMapper {

    List<Jcyd> selectAll(String username);
    int insert(Jcyd record);
    List<Jcyd> selectAllSys(Integer academy);
    List<Jcyd> selectAllSys1(Integer academy);
    Jcyd selectSys1ById(Integer id);
    Integer SysTongGuo(Integer id);
    Integer SysJujue(Integer id);
    Integer Sys1Update(Integer id,Integer xueshengshu, Integer jiaoben, Integer hejibenshu, BigDecimal dingjia, BigDecimal danjia,Integer flag);
    List<Jcyd>  selecetAllSys2();
    List<Jcyd>  selecetAllSys2Public();
    Integer Sys2TongGuo(Integer id);
    Integer Sys2Jujue(Integer id);
    int insertPublic(Jcyd record);
    int insertPublicSpecial(Jcyd record);
    List <Jcyd> selectByKechengmingcheng(String kechengmingcheng,String xuenian);
    Integer Sys2Update(Jcyd record);
    Integer Sys2TongGuoPublic(Jcyd record);
    Integer updateByAdmin(String xuenian,String jiaocaimingcheng,BigDecimal dingjia,BigDecimal danjia);
    List <Jcyd> selectByJiaocaimingcheng(String xuenian,String jiaocaimingcheng);
    List <Jcyd> GetJiaocaimingcheng(String academy,String xuenian);
    List <Jcyd> selectByXuenian(String xuenian,String zhuanyenianji);
    List <Jcyd> sys2SelectAll(String xuenian,String academy);
}
