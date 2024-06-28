package com.garisas.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootModel {
    @SerializedName("list")
    private List<ListModel> listModelList;
    @SerializedName("city")
    private CityModel cityModel;

    public RootModel(){

    }

    public CityModel getCityModel() {
        return cityModel;
    }

    public void setCityModel(CityModel cityModel) {
        this.cityModel = cityModel;
    }

    public List<ListModel> getListModelList() {
        return listModelList;
    }

    public void setListModelList(List<ListModel> listModelList){
        this.listModelList = listModelList;
    }
}
