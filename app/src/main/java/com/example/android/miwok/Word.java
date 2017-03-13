package com.example.android.miwok;

/**
 * Created by SHREYA on 3/12/2017.
 */
public class Word {
     private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mresource=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
public Word(String defaultTranslation,String miwokTranslation)
{
    mDefaultTranslation=defaultTranslation;
    mMiwokTranslation=miwokTranslation;
}
    public Word(String defaultTransaction,String miwokTranslation,int resource)
    {
        mDefaultTranslation=defaultTransaction;
        mMiwokTranslation=miwokTranslation;
        mresource=resource;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getResource(){return mresource;}

    public boolean hasImage(){
        return mresource!=NO_IMAGE_PROVIDED;
    }
}
