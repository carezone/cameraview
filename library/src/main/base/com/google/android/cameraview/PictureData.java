package com.google.android.cameraview;

import java.nio.ByteBuffer;


public class PictureData {

    private final ByteBuffer mData;
    private final int mRowStride;
    private final int mWidth;
    private final int mHeight;

    public PictureData(
            final ByteBuffer data,
            final int rowStride,
            final int width,
            final int height) {
        mData = data;
        mRowStride = rowStride;
        mWidth = width;
        mHeight = height;
    }

    public ByteBuffer getData() {
        return mData;
    }

    public int getRowStride() {
        return mRowStride;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getHeight() {
        return mHeight;
    }
}
