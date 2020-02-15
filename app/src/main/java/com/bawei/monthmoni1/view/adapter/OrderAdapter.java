package com.bawei.monthmoni1.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.monthmoni1.R;
import com.bawei.monthmoni1.model.bean.OrderBean;

import java.text.SimpleDateFormat;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/14 0014 下午 3:52
 */
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder> {
    private List<OrderBean.OrderListBean> list;

    public OrderAdapter(List<OrderBean.OrderListBean> orderList) {

        list = orderList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OrderBean.OrderListBean orderListBean = list.get(position);
        holder.orIteHao.setText("订单号:"+orderListBean.getOrderId());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long orderTime = orderListBean.getOrderTime();
        String format = simpleDateFormat.format(orderTime);
        holder.orIteTime.setText(format);
        int orderStatus = orderListBean.getOrderStatus();

        if (orderStatus==1){
            holder.orItBt.setText("去支付");
        }else if (orderStatus==2){
            holder.orItBt.setText("确认收货");
        }else if (orderStatus==3){
            holder.orItBt.setText("待评价");
        }else if (orderStatus==9){
           holder.orItBt.setVisibility(View.GONE);
        }
        holder.orIteLv.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.orIteLv.setAdapter(new OrderItemAdapter(orderListBean.getDetailList()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.or_ite_hao)
        TextView orIteHao;
        @BindView(R.id.or_ite_lv)
        RecyclerView orIteLv;
        @BindView(R.id.or_ite_time)
        TextView orIteTime;
        @BindView(R.id.or_ite_bt)
        Button orItBt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
