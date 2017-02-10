package com.bright.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author Bright on 2017/2/10
 *         描述: 城市的实体类
 */

public class City extends DataSupport {
    private int id;

    private String cityName;

    //当前市所属省份的id值
    private int provinceId;

    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
