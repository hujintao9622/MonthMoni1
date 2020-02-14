package com.bawei.monthmoni1.contract;

import com.bawei.monthmoni1.model.bean.LoginBean;
import com.bawei.monthmoni1.model.bean.RegisterBean;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 3:50
 */
public interface IRegisLoginContract {
    interface IView{
        void onRegisterSuccess(RegisterBean registerBean);
        void onRegisterFailure(Throwable throwable);
        void onLoginSuccess(LoginBean loginBean);
        void onLoginFailure(Throwable throwable);
    }
    interface IPresenter{
        void getRegisterData(String phone,String pwd);
        void getLoginData(String phone,String pwd);
    }
    interface IModel{
        void getRegisterData(String phone,String pwd,IRegisterModelCallback iRegisterModelCallback);
        interface IRegisterModelCallback{
            void onRegisterSuccess(RegisterBean registerBean);
            void onRegisterFailure(Throwable throwable);
        }
        void getLoginData(String phone,String pwd,ILoginModelCallback iLoginModelCallback);
        interface ILoginModelCallback{
            void onLoginSuccess(LoginBean loginBean);
            void onLoginFailure(Throwable throwable);
        }

    }
}
