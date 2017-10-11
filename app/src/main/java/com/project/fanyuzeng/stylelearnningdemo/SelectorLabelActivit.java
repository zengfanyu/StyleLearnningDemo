package com.project.fanyuzeng.stylelearnningdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanyuzeng on 2017/10/11.
 * Function:
 */

public class SelectorLabelActivit extends Activity {
    private static final String TAG = "SelectorLabelActivit";
    private List<String> datas = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector_label);
        mContext = this;
        ListView listView = (ListView) findViewById(R.id.id_list_view);
        for (int i = 0; i < 10; i++) {
            datas.add(String.valueOf(i));
        }
        listView.setAdapter(new MyAdapter(datas, mContext));

    }

    static class MyAdapter extends BaseAdapter {
        private List<String> datas;
        private Context mContext;
        LayoutInflater mInflater;

        public MyAdapter(List<String> datas, Context context) {
            this.datas = datas;
            mContext = context;
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return datas.size();
        }

        @Override
        public String getItem(int position) {
            return datas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = mInflater.inflate(R.layout.item_selector_list_view, parent, false);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG,"onClick " + "ItemView clicked!!");
                }
            });

            TextView button = (TextView) view.findViewById(R.id.id_item_tv);

            button.setText(getItem(position));


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            return view;
        }
    }
}
