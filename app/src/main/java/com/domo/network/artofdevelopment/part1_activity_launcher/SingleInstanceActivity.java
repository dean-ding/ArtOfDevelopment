package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created: tvt on 2018/4/12 12:00
 *
 *
 * 单实例模式：
 * 继承自SingleTask，拥有它的全部特性。区别点在于该实例只单独存在于一个任务栈中。
 *
 *      Activity A创建时，会先查找有没有任务栈中存在A实例，如果没有则创建，并且单独位于一个任务栈中，后续的启动都不会重新创建A的实例。除非是这个任务栈被系统销毁。
 */
public class SingleInstanceActivity extends Part1BaseActivity
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
