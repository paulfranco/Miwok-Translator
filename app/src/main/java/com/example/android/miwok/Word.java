package com.example.android.miwok;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation of the word */
    private String mMiwokTranslation;

    /** Image Resource */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Contructor with 3 inputs
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Constructor with 2 inputs
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word .
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Image Resource Id
     */

    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this word
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
