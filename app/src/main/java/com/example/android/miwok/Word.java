package com.example.android.miwok;

/**
 * Created by SHREYA on 3/12/2017.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mresource = NO_IMAGE_PROVIDED;
    private int mAudio;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation,int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio=audio;
    }

    public Word(String defaultTransaction, String miwokTranslation, int resource,int audio) {
        mDefaultTranslation = defaultTransaction;
        mMiwokTranslation = miwokTranslation;
        mresource = resource;
        mAudio=audio;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getResource() {
        return mresource;
    }
    public int getAudio(){
        return mAudio;
    }

    public boolean hasImage() {
        return mresource != NO_IMAGE_PROVIDED;
    }
}
