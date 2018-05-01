package com.example.android.miwok;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation of the word */
    private String mMiwokTranslation;

    /** Image Resource */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio reource ID for the word */
    private int mAudioResourceId;

    /**
     * Contructor with 4 inputs
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructor with 3 inputs
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
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
     * Get the Audio Resource Id
     */

    public int getAudioResourceId() { return mAudioResourceId; }

    /**
     * Returns whether or not there is an image for this word
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
