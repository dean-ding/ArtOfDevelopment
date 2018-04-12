package com.domo.network.artofdevelopment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.domo.network.artofdevelopment.part1_activity_launcher.Part1Activity;

public class MainActivity extends AppCompatActivity
{
    private ListView mListView;

    private Class[] mActivities;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initData()
    {
        int count = 15;
        mActivities = new Class[count];
        for (int i = 0; i < count; i++)
        {
            mActivities[i] = Part1Activity.class;
        }
    }

    private void initView()
    {
        mListView = findViewById(R.id.main_list);

        mListView.setAdapter(new BaseAdapter()
        {
            @Override
            public int getCount()
            {
                return mActivities.length;
            }

            @Override
            public Object getItem(int position)
            {
                return mActivities[position];
            }

            @Override
            public long getItemId(int position)
            {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent)
            {
                ViewHolder viewHolder = null;
                if (convertView == null)
                {
                    convertView = MainActivity.this.getLayoutInflater().inflate(R.layout.layout_main_list_item, null);
                    viewHolder = new ViewHolder();
                    viewHolder.mItemView = convertView.findViewById(R.id.main_list_item_text);

                    convertView.setTag(viewHolder);
                }
                viewHolder = (ViewHolder) convertView.getTag();
                viewHolder.mItemView.setText(mActivities[position].getSimpleName());

                return convertView;
            }

            class ViewHolder
            {
                TextView mItemView;
            }
        });
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                startActivity(new Intent(MainActivity.this, mActivities[position]));
            }
        });
    }
}
