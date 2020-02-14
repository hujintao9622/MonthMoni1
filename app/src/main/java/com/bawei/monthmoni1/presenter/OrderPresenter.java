package com.bawei.monthmoni1.presenter;

import com.bawei.monthmoni1.base.BasePresenter;
import com.bawei.monthmoni1.contract.IOrderContract;
import com.bawei.monthmoni1.model.OrderModel;
import com.bawei.monthmoni1.model.bean.OrderBean;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 3:37
 */
public class OrderPresenter extends BasePresenter<IOrderContract.IView> implements IOrderContract.IPresneter {

    private OrderModel orderModel;

    @Override
    protected void initModel() {
        orderModel = new OrderModel();
    }

    @Override
    public void getOrderData(int status) {
        orderModel.getOrderData(status, new IOrderContract.IModel.IModelCallback() {
            @Override
            public void onSuccess(OrderBean orderBean) {
                view.onSuccess(orderBean);
            }

            @Override
            public void onFailuer(Throwable throwable) {
                view.onFailuer(throwable);
            }
        });
    }
}
