package com.bawei.monthmoni1.view.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bawei.monthmoni1.R;
import com.bawei.monthmoni1.base.BaseActivity;
import com.bawei.monthmoni1.base.BasePresenter;
import com.bawei.monthmoni1.view.fragment.OrderFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 2:34
 */
public class OrderActivity extends BaseActivity {
    @BindView(R.id.or_tb)
    TabLayout orTb;
    @BindView(R.id.or_vp)
    ViewPager orVp;
    private List<Fragment> list=new ArrayList<>();
    private List<String> stringList=new ArrayList<>();
    @Override
    protected void initData() {
        OrderFragment o1 = OrderFragment.getInstance(0);
        OrderFragment o2 = OrderFragment.getInstance(1);
        OrderFragment o3 = OrderFragment.getInstance(2);
        OrderFragment o4 = OrderFragment.getInstance(3);
        OrderFragment o5 = OrderFragment.getInstance(9);
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        stringList.add("全部订单");
        stringList.add("待支付");
        stringList.add("待收货");
        stringList.add("待评价");
        stringList.add("全部完成");
        orVp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return stringList.get(position);
            }
        });
        orTb.setupWithViewPager(orVp);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected int layoutId() {
        return R.layout.orderactivity;
    }
}
