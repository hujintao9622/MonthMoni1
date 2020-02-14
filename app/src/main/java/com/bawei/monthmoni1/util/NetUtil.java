package com.bawei.monthmoni1.util;

import android.widget.ImageView;

import com.bawei.monthmoni1.R;
import com.bawei.monthmoni1.view.widget.Api;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 2:47
 */
public class NetUtil {
    private static final String baseurl="http://mobile.bwstudent.com/";
    private final Api api;

    public NetUtil() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
        Retrofit build = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseurl)
                .client(okHttpClient)
                .build();
        api = build.create(Api.class);
    }

    private static final class Sing{
        private static final NetUtil NET_UTIL=new NetUtil();
    }

    public static NetUtil getInstance() {
        return Sing.NET_UTIL;
    }

    public Api getApi() {
        return api;
    }
    public void getPhoto(String bit, ImageView img){
        Glide.with(img).load(bit)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                //.diskCacheStrategy()
                .into(img);
    }
}
