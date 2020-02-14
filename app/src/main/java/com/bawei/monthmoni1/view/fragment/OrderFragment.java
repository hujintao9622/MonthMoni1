package com.bawei.monthmoni1.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.monthmoni1.R;
import com.bawei.monthmoni1.base.BaseFragment;
import com.bawei.monthmoni1.contract.IOrderContract;
import com.bawei.monthmoni1.model.bean.OrderBean;
import com.bawei.monthmoni1.presenter.OrderPresenter;
import com.bawei.monthmoni1.view.adapter.OrderAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 2:42
 */
public class OrderFragment extends BaseFragment<OrderPresenter> implements IOrderContract.IView {
    @BindView(R.id.or_it_lv)
    RecyclerView orItLv;
    private int key = 0;
    List<OrderBean.OrderListBean> list=new ArrayList<>();
    @Override
    protected void initView(View view) {

    }

    @Override
    protected OrderPresenter providePresenter() {
        return new OrderPresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.order;
    }

    @Override
    protected void initData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            key = arguments.getInt("key");
        }
        mPresenter.getOrderData(key);
    }

    public static OrderFragment getInstance(int value) {
        OrderFragment orderFragment = new OrderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("key", value);
        orderFragment.setArguments(bundle);
        return orderFragment;
    }

    @Override
    public void onSuccess(OrderBean orderBean) {
        List<OrderBean.OrderListBean> orderList = orderBean.getOrderList();
        list.addAll(orderList);
        orItLv.setLayoutManager(new LinearLayoutManager(getContext()));
        OrderAdapter orderAdapter = new OrderAdapter(list);
        orItLv.setAdapter(orderAdapter);
    }

    @Override
    public void onFailuer(Throwable throwable) {
        Log.e("tag",throwable.getMessage());
    }
}
