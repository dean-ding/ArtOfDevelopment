package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.domo.network.artofdevelopment.R;

/**
 * Created: tvt on 2018/4/12 11:45
 */
public class Part1Activity extends Activity
{
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

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
