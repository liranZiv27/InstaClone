package com.liran.instaclone.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.liran.instaclone.materialcamera.internal.BaseCaptureActivity;
import com.liran.instaclone.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
