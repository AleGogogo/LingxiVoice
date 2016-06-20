package com.example.lyw.lingxivoice.Bean;



/**
 * Created by LYW on 2016/6/20.
 */
public class SelectedBean {
    public int mImageId;
    public String mTitle;
    public  String mContent;
     public Type mType;

    public SelectedBean(int mImageId, String mTitle, String mContent,
                        Type mType) {
        this.mImageId = mImageId;
        this.mTitle = mTitle;
        this.mContent = mContent;
        this.mType = mType;
    }

    public enum Type{
      TELEPHONE,MASSAGE,CHEAT,ALARM,WEATHER,NEWS,NOVERL,JOKE,FLOW,
        FOOD,TRIP,FILEM,SHARES,TRANSFOM,SEARCH,APP,NAVIGTION,
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Type getmType() {
        return mType;
    }

    public void setmType(Type mType) {
        this.mType = mType;
    }
}
