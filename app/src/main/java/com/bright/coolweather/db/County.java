package com.bright.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author Bright on 2017/2/10
 *         描述: 县级城市的实体类
 */

public class County extends DataSupport {
    private int id;

    private String countyName;

    private int countyCode;

    //记录当前县所属市的id值
    private int cityId;

    //记录县所对应的天气id
    private int weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
