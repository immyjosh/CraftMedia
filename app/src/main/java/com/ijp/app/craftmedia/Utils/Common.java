package com.ijp.app.craftmedia.Utils;

import com.ijp.app.craftmedia.Model.InfiniteListItem;
import com.ijp.app.craftmedia.Retrofit.ICraftsMediaApi;
import com.ijp.app.craftmedia.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static List<InfiniteListItem> infiniteListItems=new ArrayList<>();

    //10.0.2.2 - Emulator localhost
    //http://www.thingspeakapi.tk/DrinkShop/
    public static final String BASE_URL = "http://www.thingspeakapi.tk/DrinkShop/";

    public static ICraftsMediaApi getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(ICraftsMediaApi.class);
    }
}