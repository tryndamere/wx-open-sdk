package com.github.izerui.weixin.api;

import com.github.izerui.weixin.converter.ButtonListRequestConverter;
import com.github.izerui.weixin.converter.MenuListResponseConverter;
import com.github.izerui.weixin.mappings.Button;
import com.github.izerui.weixin.mappings.Menu;
import com.github.izerui.weixin.mappings.Status;
import com.github.izerui.weixin.support.Converter;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by serv on 16/4/19.
 */
public interface MenuApi {

    @POST("menu/create")
    @Converter(request = ButtonListRequestConverter.class)
    Call<Status> create(@Body List<Button> buttons, @Query("access_token")String accessToken);

    @GET("menu/get")
    @Converter(response = MenuListResponseConverter.class)
    Call<List<Menu>> get(@Query("access_token")String accessToken);

    @GET("menu/delete")
    Call<Status> delete(@Query("access_token")String accessToken);

}
