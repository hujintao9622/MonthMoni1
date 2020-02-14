package com.bawei.monthmoni1.view.widget;

import com.bawei.monthmoni1.model.bean.LoginBean;
import com.bawei.monthmoni1.model.bean.OrderBean;
import com.bawei.monthmoni1.model.bean.RegisterBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 2:57
 */
public interface Api {
    @FormUrlEncoded
    @POST("small/user/v1/register")
    Observable<RegisterBean> regis(@Field("phone")String phone,@Field("pwd")String pwd);
    @FormUrlEncoded
    @POST("small/user/v1/login")
    Observable<LoginBean> login(@Field("phone")String phone, @Field("pwd")String pwd);
    @GET("small/order/verify/v1/findOrderListByStatus")
    Observable<OrderBean> ord(@Header("userId")int uid,@Header("sessionId")String sid,
                              @Query("page")int page,@Query("count")int count,@Query("status")int statu);
}
