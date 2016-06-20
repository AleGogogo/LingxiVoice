package com.example.lyw.lingxivoice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lyw.lingxivoice.Bean.SelectedBean;

import java.util.ArrayList;

/**
 * Created by LYW on 2016/6/20.
 */
public class SelectedListViewAdapter extends BaseAdapter {
    private ArrayList<SelectedBean> mData;
    private Context mConext;
    private LayoutInflater mInflater;

    public SelectedListViewAdapter(ArrayList<SelectedBean> data, Context context) {
         mData = data;
        mConext = context;
        mInflater = LayoutInflater.from(mConext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public SelectedBean getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.d("TAG","getview is-----");
        SelectedBean bean = mData.get(i);
        if (view == null){
            view= mInflater.inflate(R.layout.listview_item,null);
        }
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.mImageView = (ImageView) view.findViewById(R.id.id_item_img);
        viewHolder.mTextTitle = (TextView) view.findViewById(R.id.id_item_title);
        viewHolder.mContentText = (TextView) view.findViewById(R.id.id_item_content);
        viewHolder.mImageView.setImageResource(bean.getmImageId());
        viewHolder.mTextTitle.setText(bean.getmTitle());
        viewHolder.mContentText.setText(bean.getmContent());
        return view;
    }

    class ViewHolder {
        ImageView mImageView;
        TextView mTextTitle;
        TextView mContentText;

    }
}
