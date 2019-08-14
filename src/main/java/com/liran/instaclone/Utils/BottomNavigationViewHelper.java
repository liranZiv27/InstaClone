package com.liran.instaclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.liran.instaclone.Likes.LikesActivity;
import com.liran.instaclone.Main.MainActivity;
import com.liran.instaclone.Profile.ProfileActivity;
import com.liran.instaclone.R;
import com.liran.instaclone.Search.SearchActivity;
import com.liran.instaclone.Share.ShareActivity;
import android.app.Activity;

/**
 * Created by Liran on 13/08/2019.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: ");
        Log.d(TAG, "setting navigation parameters ");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
        Log.d(TAG, "finished setting navigation parameters ");
    }
    public static void enableNavigation(final Context context, final Activity callingActivity, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent mainIntent = new Intent(context, MainActivity.class);//ACTIVITY_NUM 0
                        context.startActivity(mainIntent);
                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                    case R.id.ic_search:
                        Intent searchIntent = new Intent(context, SearchActivity.class);//ACTIVITY_NUM 1
                        context.startActivity(searchIntent);
                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                    case R.id.ic_circle:
                        Intent circleIntent = new Intent(context, ShareActivity.class);//ACTIVITY_NUM 2
                        context.startActivity(circleIntent);
                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                    case R.id.ic_heart:
                        Intent likesIntent = new Intent(context, LikesActivity.class);//ACTIVITY_NUM 3
                        context.startActivity(likesIntent);
                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                    case R.id.ic_user:
                        Intent profileIntent = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM 4
                        context.startActivity(profileIntent);
                        callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        break;
                }
                return false;
            }
        });
    }
}
