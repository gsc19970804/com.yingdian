package com.yingdian.myproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ${耿世聪} on 2018/3/31.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHloder> {


    private List<GSc> list;
    private Context context;

    public Adapter(List<GSc> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHloder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHloder(View.inflate(context, R.layout.item, null));
    }

    @Override
    public void onBindViewHolder(ViewHloder holder, int position) {

        holder.textView.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHloder extends RecyclerView.ViewHolder {

        private TextView textView;


        public ViewHloder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.gsc);
        }
    }

}
