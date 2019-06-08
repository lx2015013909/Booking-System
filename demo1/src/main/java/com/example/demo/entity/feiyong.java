package com.example.demo.entity;

import java.math.BigDecimal;

public class feiyong {
    private String xuenian;
    private String zhuanyenianji;
    private BigDecimal shuben;
    private BigDecimal earphone;
    private BigDecimal heji;

    public BigDecimal getHeji() {
        return heji;
    }

    public void setHeji(BigDecimal heji) {
        this.heji = heji;
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

    public BigDecimal getShuben() {
        return shuben;
    }

    public void setShuben(BigDecimal shuben) {
        this.shuben = shuben;
    }

    public BigDecimal getEarphone() {
        return earphone;
    }

    public void setEarphone(BigDecimal earphone) {
        this.earphone = earphone;
    }

    public BigDecimal getOtherfee() {
        return otherfee;
    }

    public void setOtherfee(BigDecimal otherfee) {
        this.otherfee = otherfee;
    }

    private BigDecimal otherfee;
}
