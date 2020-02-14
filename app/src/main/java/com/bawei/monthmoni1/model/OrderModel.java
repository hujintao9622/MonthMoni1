package com.bawei.monthmoni1.model;

import com.bawei.monthmoni1.contract.IOrderContract;
import com.bawei.monthmoni1.model.bean.OrderBean;
import com.bawei.monthmoni1.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 3:31
 */
public class OrderModel implements IOrderContract.IModel {
    @Override
    public void getOrderData(int status, IModelCallback iModelCallback) {
        NetUtil.getInstance().getApi().ord(27823,"158166443136227823",1,10,status)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<OrderBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(OrderBean orderBean) {
                        iModelCallback.onSuccess(orderBean);
                    }
                    @Override
                    public void onError(Throwable e) {
                        iModelCallback.onFailuer(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
