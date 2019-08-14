package com.liran.instaclone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.liran.instaclone.R;
import com.liran.instaclone.Utils.UniversalImageLoader;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Liran on 13/08/2019.
 */

public class EditProfileFragment extends Fragment{
    private static final String TAG = "EditProfileFragment";

    private ImageView mProfilePhoto;
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editprofile, container, false);
        mProfilePhoto = view.findViewById(R.id.profile_photo);

        setProfileImage();

        //back arrow for navigating back to "ProfileActivity"
        ImageView backArrow = (ImageView) view.findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating back to ProfileActivity");
                getActivity().finish();
            }
        });

        return view;
    }


    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image");
        String imgURL = "https://cdn.vox-cdn.com/thumbor/W9QjW3HynAcaotTNo45wISHluU8=/0x0:2040x1360/1200x800/filters:focal(857x517:1183x843)/cdn.vox-cdn.com/uploads/chorus_image/image/62857528/wjoel_180413_1777_android_001.0.jpg";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto, null, "");
    }
}
