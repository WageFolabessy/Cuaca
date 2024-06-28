package com.garisas.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListModel {
    @SerializedName("main")
    private MainModel mainModel;
    @SerializedName("weather")
    private List<WeatherModel> weatherModelsList;
    private String dt_txt;

    public ListModel(){}

    public MainModel getMainModel() {
        return mainModel;
    }

    public void setMainModel(MainModel mainModel) {
        this.mainModel = mainModel;
    }

    public List<WeatherModel> getWeatherModelsList() {
        return weatherModelsList;
    }

    public void setWeatherModelsList(List<WeatherModel> weatherModelsList) {
        this.weatherModelsList = weatherModelsList;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
