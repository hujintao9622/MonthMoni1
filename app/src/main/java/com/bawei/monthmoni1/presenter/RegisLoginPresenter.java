package com.bawei.monthmoni1.presenter;

import com.bawei.monthmoni1.base.BasePresenter;
import com.bawei.monthmoni1.contract.IRegisLoginContract;
import com.bawei.monthmoni1.model.RegisterLoginModel;
import com.bawei.monthmoni1.model.bean.LoginBean;
import com.bawei.monthmoni1.model.bean.RegisterBean;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 4:04
 */
public class RegisLoginPresenter extends BasePresenter<IRegisLoginContract.IView> implements IRegisLoginContract.IPresenter {

    private RegisterLoginModel registerLoginModel;

    @Override
    protected void initModel() {
        registerLoginModel = new RegisterLoginModel();
    }

    @Override
    public void getRegisterData(String phone, String pwd) {
        registerLoginModel.getRegisterData(phone, pwd, new IRegisLoginContract.IModel.IRegisterModelCallback() {
            @Override
            public void onRegisterSuccess(RegisterBean registerBean) {
                view.onRegisterSuccess(registerBean);
            }

            @Override
            public void onRegisterFailure(Throwable throwable) {
                view.onRegisterFailure(throwable);
            }
        });
    }

    @Override
    public void getLoginData(String phone, String pwd) {
        registerLoginModel.getLoginData(phone, pwd, new IRegisLoginContract.IModel.ILoginModelCallback() {
            @Override
            public void onLoginSuccess(LoginBean loginBean) {
                view.onLoginSuccess(loginBean);
            }

            @Override
            public void onLoginFailure(Throwable throwable) {
                view.onLoginFailure(throwable);
            }
        });
    }
}
