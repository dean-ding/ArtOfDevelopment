package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created: tvt on 2018/4/12 12:01
 *
 *
 * 栈内复用模式：
 * 在任务栈中，只要该Activity存在，则不会重新创建，会回调onNewIntent函数。
 *  创建实例过程：查找当前需要存放Activity A的栈中是否有实例，
 *      1）栈内没有A的实例：创建A并放入栈中。
 *      2）栈内有A的实例：将A调入栈顶，回调onNewIntent函数。
 *          a）如果当前A不在栈顶，当前栈的情况为D/C/A/B,将在A调入栈顶，并将A上面的Activity全部出栈。结果为D/C/A。
 *  TaskAffinity：指定任务栈名称，配合SingleTask使用，新启动的Activity会运行在TaskAffinity指定的名称的任务栈上。
 */
public class SingleTaskActivity extends Part1BaseActivity
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
