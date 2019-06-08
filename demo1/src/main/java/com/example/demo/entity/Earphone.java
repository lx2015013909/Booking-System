package com.example.demo.entity;

import java.math.BigDecimal;

public class Earphone {
    Integer id;
    String xuenian;
    String zhuanyenianji;
    BigDecimal danjia;

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

    public String getZhuanyenianji() {
        return zhuanyenianji;
    }

    public void setZhuanyenianji(String zhuanyenianji) {
        this.zhuanyenianji = zhuanyenianji;
    }

    public BigDecimal getDanjia() {
        return danjia;
    }

    public void setDanjia(BigDecimal danjia) {
        this.danjia = danjia;
    }
}
