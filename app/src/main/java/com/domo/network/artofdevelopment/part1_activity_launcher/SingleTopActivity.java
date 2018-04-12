package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created: tvt on 2018/4/12 11:45
 *
 *
 * 栈顶复用模式：
 * 1、如果该Activity已经存在于任务栈的栈顶，不会被重新创建，回调onNewIntent函数，可以从此函数中拿到想要的数据。
 *      Activity A、B、C、D,如果D启动D：
 *          1）D为SingleTop则栈的情况为：A/B/C/D。
 *          2）D为Standard则栈的情况为：A/B/C/D/D。
 *      note> 此情况下onCreate，onStart都不会被执行。
 * 2、如果该Activity已经存在但不在任务栈的栈顶，则会被重新创建。
 */
public class SingleTopActivity extends Part1BaseActivity
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

    @Override
    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);

        Log.i(TAG, "onNewIntent----->");
    }
}
