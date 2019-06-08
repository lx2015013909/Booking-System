package com.example.demo.entity;

import java.math.BigDecimal;

public class DingJia {
    Integer id;
    String xuenian;
    String jiaocaimingcheng;
    BigDecimal dingjia;
    String beizhu;
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXuenian() {
        return xuenian;
    }

    public void setXuenian(String xuenian) {
        this.xuenian = xuenian;
    }

    public String getJiaocaimingcheng() {
        return jiaocaimingcheng;
    }

    public void setJiaocaimingcheng(String jiaocaimingcheng) {
        this.jiaocaimingcheng = jiaocaimingcheng;
    }

    public BigDecimal getDingjia() {
        return dingjia;
    }

    public void setDingjia(BigDecimal dingjia) {
        this.dingjia = dingjia;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
