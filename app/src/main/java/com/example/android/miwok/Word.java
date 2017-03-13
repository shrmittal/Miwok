package com.example.android.miwok;

/**
 * Created by SHREYA on 3/12/2017.
 */
public class Word {
     private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTransaction,String miwokTranslation)
    {
        mDefaultTranslation=defaultTransaction;
        mMiwokTranslation=miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
