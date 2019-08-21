package com.liran.instaclone.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.liran.instaclone.materialcamera.internal.BaseCaptureActivity;
import com.liran.instaclone.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
