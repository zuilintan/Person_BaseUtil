package com.lt.library.base.recyclerview.viewholder.sub;

import android.support.annotation.NonNull;
import android.view.View;

import com.lt.library.base.recyclerview.listener.OnStatusItemClickListener;
import com.lt.library.base.recyclerview.listener.OnStatusItemLongClickListener;
import com.lt.library.base.recyclerview.viewholder.BaseViewHolder;

public class StatusViewHolder extends BaseViewHolder {

    public StatusViewHolder(@NonNull View itemView, OnStatusItemClickListener onStatusItemClickListener, OnStatusItemLongClickListener onStatusItemLongClickListener) {
        super(itemView);
        itemView.setOnClickListener(view -> {
            if (onStatusItemClickListener != null) {
                onStatusItemClickListener.onStatusClick(view);
            }
        });
        itemView.setOnLongClickListener(view -> {
            boolean b = false;
            if (onStatusItemLongClickListener != null) {
                b = onStatusItemLongClickListener.onStatusLongClick(view);
            }
            return b;
        });
    }
}
