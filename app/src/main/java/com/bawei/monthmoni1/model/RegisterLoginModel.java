package com.bawei.monthmoni1.model;

import com.bawei.monthmoni1.contract.IRegisLoginContract;
import com.bawei.monthmoni1.model.bean.LoginBean;
import com.bawei.monthmoni1.model.bean.RegisterBean;
import com.bawei.monthmoni1.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 3:40
 */
public class RegisterLoginModel implements IRegisLoginContract.IModel {

    @Override
    public void getRegisterData(String phone, String pwd, IRegisterModelCallback iRegisterModelCallback) {
        NetUtil.getInstance().getApi().regis(phone,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RegisterBean registerBean) {
                            iRegisterModelCallback.onRegisterSuccess(registerBean);


                    }

                    @Override
                    public void onError(Throwable e) {
                        iRegisterModelCallback.onRegisterFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getLoginData(String phone, String pwd, ILoginModelCallback iLoginModelCallback) {
        NetUtil.getInstance().getApi().login(phone,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                            iLoginModelCallback.onLoginSuccess(loginBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iLoginModelCallback.onLoginFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
