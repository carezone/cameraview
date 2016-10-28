package com.google.android.cameraview;

import java.util.Collections;
import java.util.Set;


/**
 * Used when viewing CameraView in layout editor
 * This allows the CameraView to be rendered properly without crashing
 */
public class NoCameraImpl
    extends CameraViewImpl {

  private int mFlash = Constants.FLASH_AUTO;
  private int mFacing = Constants.FACING_BACK;
  private boolean mAutoFocus = true;
  private AspectRatio mAspectRatio = Constants.DEFAULT_ASPECT_RATIO;

  NoCameraImpl(
      final Callback callback,
      final PreviewImpl preview) {
    super(callback, preview);
  }

  @Override boolean start() {
    return true;
  }

  @Override void stop() {

  }

  @Override boolean isCameraOpened() {
    return false;
  }

  @Override void setFacing(final int facing) {
    mFacing = facing;
  }

  @Override int getFacing() {
    return mFacing;
  }

  @Override Set<AspectRatio> getSupportedAspectRatios() {
    return Collections.singleton(mAspectRatio);
  }

  @Override
  boolean setAspectRatio(final AspectRatio ratio) {
    mAspectRatio = ratio;
    return false;
  }

  @Override AspectRatio getAspectRatio() {
    return mAspectRatio;
  }

  @Override void setAutoFocus(final boolean autoFocus) {
    mAutoFocus = autoFocus;
  }

  @Override boolean getAutoFocus() {
    return mAutoFocus;
  }

  @Override void setFlash(final int flash) {
    mFlash = flash;
  }

  @Override int getFlash() {
    return mFlash;
  }

  @Override void takePicture() {

  }

  @Override void setDisplayOrientation(final int displayOrientation) {

  }
}
