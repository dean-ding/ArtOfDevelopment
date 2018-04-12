package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created: tvt on 2018/4/12 11:45
 */
public class SingleTopActivity extends Activity
{
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        Log.i(TAG, "onStart----->");
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        Log.i(TAG, "onResume----->");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();

        Log.i(TAG, "onRestart----->");
    }

    @Override
    protected void onPause()
    {
        super.onPause();

        Log.i(TAG, "onPause----->");
    }

    @Override
    protected void onStop()
    {
        super.onStop();

        Log.i(TAG, "onStop----->");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        Log.i(TAG, "onDestroy----->");
    }
}
