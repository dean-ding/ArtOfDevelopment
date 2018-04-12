package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created: tvt on 2018/4/12 11:59
 *
 *
 * 标准模式：每次打开这个Activity时，都会初始化一个新的实例对象，不管它是否已经存在。
 * 生命周期：每次都按照Activity的标准调用每个函数。
 *      Activity A -> StandardActivity
 *          Activity A: onPause
 *          StandardActivity: onCreate -> onStart -> onResume
 *          Activity A: onStop onDestroy(视情况而定)
 * 任务栈：在启动这个Activity的栈中。比如Activity A启动了它，则它在Activity A所在的栈内。
 */
public class StandardActivity extends Part1BaseActivity
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
