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

/**
 * Created by Liran on 13/08/2019.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: ");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent mainIntent = new Intent(context, MainActivity.class);//ACTIVITY_NUM 0
                        context.startActivity(mainIntent);
                        break;
                    case R.id.ic_search:
                        Intent searchIntent = new Intent(context, SearchActivity.class);//ACTIVITY_NUM 1
                        context.startActivity(searchIntent);
                        break;
                    case R.id.ic_circle:
                        Intent circleIntent = new Intent(context, ShareActivity.class);//ACTIVITY_NUM 2
                        context.startActivity(circleIntent);
                        break;
                    case R.id.ic_user:
                        Intent profileIntent = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM 3
                        context.startActivity(profileIntent);
                        break;
                    case R.id.ic_heart:
                        Intent likesIntent = new Intent(context, LikesActivity.class);//ACTIVITY_NUM 4
                        context.startActivity(likesIntent);
                        break;
                }
                return false;
            }
        });
    }
}
