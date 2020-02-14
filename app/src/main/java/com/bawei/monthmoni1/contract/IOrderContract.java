package com.bawei.monthmoni1.contract;

import com.bawei.monthmoni1.model.bean.OrderBean;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 3:28
 */
public interface IOrderContract {
    interface IView{
        void onSuccess(OrderBean orderBean);
        void onFailuer(Throwable throwable);
    }
    interface IPresneter{
        void getOrderData(int status);
    }
    interface IModel{
        void getOrderData(int status,IModelCallback iModelCallback);
        interface IModelCallback{
            void onSuccess(OrderBean orderBean);
            void onFailuer(Throwable throwable);
        }
    }
}
