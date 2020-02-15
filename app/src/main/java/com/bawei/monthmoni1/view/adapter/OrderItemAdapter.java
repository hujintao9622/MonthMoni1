package com.bawei.monthmoni1.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.monthmoni1.R;
import com.bawei.monthmoni1.model.bean.OrderBean;
import com.bawei.monthmoni1.util.NetUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/2/15 0015 下午 12:03
 */
public class OrderItemAdapter extends RecyclerView.Adapter<OrderItemAdapter.MyViewHolder> {

    private List<OrderBean.OrderListBean.DetailListBean> list;

    public OrderItemAdapter(List<OrderBean.OrderListBean.DetailListBean> detailList) {
        list = detailList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderitemi, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OrderBean.OrderListBean.DetailListBean detailListBean = list.get(position);
        holder.itName.setText(detailListBean.getCommodityName());
        String[] split = detailListBean.getCommodityPic().split(",");
        NetUtil.getInstance().getPhoto(split[0],holder.itImg);
        holder.itPrice.setText("价格:"+detailListBean.getCommodityPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.it_img)
        ImageView itImg;
        @BindView(R.id.it_name)
        TextView itName;
        @BindView(R.id.it_price)
        TextView itPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
