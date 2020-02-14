package com.bawei.monthmoni1.view.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawei.monthmoni1.R;
import com.bawei.monthmoni1.base.BaseActivity;
import com.bawei.monthmoni1.contract.IRegisLoginContract;
import com.bawei.monthmoni1.model.bean.LoginBean;
import com.bawei.monthmoni1.model.bean.RegisterBean;
import com.bawei.monthmoni1.presenter.RegisLoginPresenter;
import com.blankj.utilcode.util.EncryptUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<RegisLoginPresenter> implements IRegisLoginContract.IView {
    @BindView(R.id.ma_phone)
    EditText maPhone;
    @BindView(R.id.ma_pwd)
    EditText maPwd;
    @BindView(R.id.ma_register)
    Button maRegister;
    @BindView(R.id.ma_login)
    Button maLogin;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected RegisLoginPresenter providePresenter() {
        return new RegisLoginPresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onRegisterSuccess(RegisterBean registerBean) {
        Toast.makeText(this, registerBean.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRegisterFailure(Throwable throwable) {
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginSuccess(LoginBean loginBean) {
        Toast.makeText(this, loginBean.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailure(Throwable throwable) {
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.ma_register, R.id.ma_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ma_register:
                String phone = maPhone.getText().toString().trim();
                if (TextUtils.isEmpty(phone)){
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String pwd = maPwd.getText().toString().trim();
                if (TextUtils.isEmpty(pwd)){
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String pwd1 = EncryptUtils.encryptMD5ToString(pwd);
                String substring = pwd1.substring(0, 6);
                mPresenter.getRegisterData(phone,substring);
                break;
            case R.id.ma_login:
                String phon = maPhone.getText().toString().trim();
                if (TextUtils.isEmpty(phon)){
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String pw = maPwd.getText().toString().trim();
                if (TextUtils.isEmpty(pw)){
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String pwd2 = EncryptUtils.encryptMD5ToString(pw);
                String substring1 = pwd2.substring(0, 6);
                mPresenter.getLoginData(phon,substring1);
                break;
        }
    }
}
