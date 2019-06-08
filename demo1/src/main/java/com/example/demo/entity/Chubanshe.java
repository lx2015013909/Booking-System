package com.example.demo.entity;

import java.math.BigDecimal;

public class Chubanshe {
    Integer id;
    String xuenian;
    String baoming;
    String chubanshe;
    java.math.BigDecimal zhekou;

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

    public String getBaoming() {
        return baoming;
    }

    public void setBaoming(String baoming) {
        this.baoming = baoming;
    }

    public String getChubanshe() {
        return chubanshe;
    }

    public void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }

    public BigDecimal getZhekou() {
        return zhekou;
    }

    public void setZhekou(BigDecimal zhekou) {
        this.zhekou = zhekou;
    }
}
