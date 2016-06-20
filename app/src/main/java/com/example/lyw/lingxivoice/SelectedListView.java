package com.example.lyw.lingxivoice;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by LYW on 2016/6/20.
 */
public class SelectedListView extends ListView {


    public SelectedListView(Context context) {
        super(context);
    }

    public SelectedListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SelectedListView(Context context, AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }
}
