package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.domo.network.artofdevelopment.R;

/**
 * Created: tvt on 2018/4/12 11:45
 */
public class Part1Activity extends Part1BaseActivity
{
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // 此函数为第一个调用的函数，表示Activity正在被创建，可设置布局的显示以及一些初始化工作

        Log.i(TAG, "onCreate----->");

        setContentView(R.layout.activity_part1);
        initView();
    }

    private void initView()
    {
        findViewById(R.id.part1_standard_activity).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Part1Activity.this, StandardActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.part1_singleTop_activity).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Part1Activity.this, SingleTopActivity.class));
            }
        });
        findViewById(R.id.part1_singleTask_activity).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Part1Activity.this, SingleTaskActivity.class));
            }
        });
        findViewById(R.id.part1_singleInstance_activity).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Part1Activity.this, SingleInstanceActivity.class));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        // APP遇到异常退出时，会调用此函数，在这里可备份数据
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        // APP遇到异常退出后，再打开时，会调用此函数，可从此函数的savedInstanceState读取在onSaveInstanceState备份的数据。
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        // Activity正在启动，Activity可见，但是还处理后台，但是用户还不能进行交互
        Log.i(TAG, "onStart----->");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        // Activity可见，已经在前台，用户可进行交互
        Log.i(TAG, "onResume----->");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        // Activity正在重新启动，如果当前Activity从不可见状态变成可见状态时，会调用此函数
        // note> 点击Home键，或者跳转到另外一个Activity中，且执行了onPause或者onStop函数时，然后返回到这个Activity中。
        Log.i(TAG, "onRestart----->");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        // Activity正在停止，此时可以进行一些不耗时的的操作，例如停止动画，存储数据。
        // note> 如果在此函数执行耗时操作，会影响新的Activity的显示速度，执行完此函数之后才会执行新的Activity的生命周期。
        Log.i(TAG, "onPause----->");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        // Activity即将停止，此时可以进行一些比onPause中稍微重量级一些的操作，但是还是不能太耗时
        Log.i(TAG, "onStop----->");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        // Activity即将销毁，此时需要释放所有资源
        Log.i(TAG, "onDestroy----->");
    }
}
