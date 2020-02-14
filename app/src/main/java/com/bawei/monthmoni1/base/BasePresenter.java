package com.bawei.monthmoni1.base;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/13 0013 下午 2:07
 */
public abstract class BasePresenter <V>{
    protected V view;

    public void attach(V view) {
        this.view = view;
    }
    public void detach(){
        view=null;
    }

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();
}
