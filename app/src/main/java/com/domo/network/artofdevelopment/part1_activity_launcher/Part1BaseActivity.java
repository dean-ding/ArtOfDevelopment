package com.domo.network.artofdevelopment.part1_activity_launcher;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

/**
 * Created: tvt on 2018/4/12 15:18
 */
public class Part1BaseActivity extends Activity
{
    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        getTask();
    }

    private void getTask()
    {
        // 获取activity任务栈
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        if (manager == null)
        {
            return;
        }
        List<ActivityManager.RunningTaskInfo> taskInfoList = manager.getRunningTasks(10);
        for (ActivityManager.RunningTaskInfo info : taskInfoList)
        {
            // 类名 .ui.mobile.activity.WebsiteLoginActivity
            String shortClassName = info.topActivity.getShortClassName();
            // 完整类名 com.haofang.testapp.ui.mobile.activity.WebsiteLoginActivity
            String className = info.topActivity.getClassName();
            // 包名  com.haofang.testapp
            String packageName = info.topActivity.getPackageName();
            Log.i(TAG, "shortClassName = " + shortClassName + ", className = " + className + ", packageName = " + packageName);
        }
    }
}
