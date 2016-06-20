package com.example.lyw.lingxivoice;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.lyw.lingxivoice.Bean.SelectedBean;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ImageButton mImageBut_click;
    private ImageButton mImageBut_toshare;
    private ImageButton mImageBut_keybow;
    private ImageButton mImageBut_question;
    private ImageButton mImageBut_huatong;
    private ListView mListView;
    private ArrayList<SelectedBean> mData ;
    private SelectedListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }

    private void initData() {
        mData = new ArrayList<>();
//       mData.add(new SelectedBean(R.drawable.telepthone,
//                "语音打电话", "语音打电话", SelectedBean.Type.TELEPHONE));
       mData.add(new SelectedBean(R.drawable.telepthone,
                "语音发短信", "语音发短信", SelectedBean.Type.MASSAGE));
        mData.add(new SelectedBean(R.drawable.message,"语音建提醒","语音键提醒", SelectedBean.Type.ALARM));
        mData.add(new SelectedBean(R.drawable.weather,"语音查天气","语音查天气", SelectedBean.Type.WEATHER));
        mData.add(new SelectedBean(R.drawable.news,"语音听新闻","语音听新闻", SelectedBean.Type.NEWS));
        mData.add(new SelectedBean(R.drawable.novel,"语音查小说","语音查小说", SelectedBean.Type.NOVERL));
        mData.add(new SelectedBean(R.mipmap.ic_launcher,"语音讲笑话","语音讲笑话", SelectedBean.Type.JOKE));
        mData.add(new SelectedBean(R.drawable.flow,"语音查流量","语音查流量", SelectedBean.Type.FLOW));
        mData.add(new SelectedBean(R.drawable.film,"语音查影讯","语音查影讯", SelectedBean.Type.FILEM));
        mData.add(new SelectedBean(R.drawable.foods,"语音查美食","语音查美食", SelectedBean.Type.FOOD));
        mData.add(new SelectedBean(R.drawable.agent,"语音查行程","语音查行程", SelectedBean.Type.TRIP));
        mData.add(new SelectedBean(R.mipmap.ic_launcher,"语音搜应用","语音搜应用", SelectedBean.Type.APP));
        mData.add(new SelectedBean(R.mipmap.ic_launcher,"语音查股票","语音查股票", SelectedBean.Type.SHARES));
        mData.add(new SelectedBean(R.mipmap.ic_launcher,"语音翻译","语音翻译", SelectedBean.Type.TRANSFOM));
        mData.add(new SelectedBean(R.mipmap.ic_launcher,"语音导航","语音导航", SelectedBean.Type.NAVIGTION));
        mData.add(new SelectedBean(R.mipmap.ic_launcher,"语音聊天","语音聊天", SelectedBean.Type.CHEAT));
        mData.add(new SelectedBean(R.drawable.search,"语音搜索","语音搜索", SelectedBean.Type.SEARCH));
}

    private void initView() {
        mImageBut_click = (ImageButton) findViewById(R.id.id_cehua);
        mImageBut_toshare = (ImageButton) findViewById(R.id.id_toshare);
        mImageBut_keybow = (ImageButton) findViewById(R.id.id_keyboard);
        mImageBut_question = (ImageButton) findViewById(R.id.id_question);
        mImageBut_huatong = (ImageButton) findViewById(R.id.id_huatong);
        mListView = (ListView) findViewById(R.id.id_listview);
        mAdapter = new SelectedListViewAdapter(mData,this);
        mListView.setAdapter(mAdapter);
    }
}
