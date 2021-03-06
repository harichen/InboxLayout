package com.zzt.inboxlayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.zzt.inbox.interfaces.OnDragStateChangeListener;
import com.zzt.inbox.widget.InboxLayout;
import com.zzt.inbox.widget.InboxScrollView;


/**
 * Created by zzt on 2015/1/19.
 */
public class MainActivity extends ActionBarActivity {
    InboxLayout inboxLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        final InboxScrollView inboxScrollView = (InboxScrollView)findViewById(R.id.scroll);
        inboxLayout = (InboxLayout)findViewById(R.id.inboxlayout);
        inboxLayout.seBackgroundScrollView(inboxScrollView);
        inboxLayout.setCloseDistance(50);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xdd000000));
        inboxLayout.setOnDragStateChangeListener(new OnDragStateChangeListener() {
            @Override
            public void dragStateChange(InboxLayout.DragState state) {
                switch (state) {
                    case CANCLOSE:
                        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff5e5e5e));
                        getSupportActionBar().setTitle("back");
                        break;
                    case CANNOTCLOSE:
                        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xdd000000));
                        getSupportActionBar().setTitle("InboxLayout");
                        break;
                }
            }
        });

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 20;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = MainActivity.this.getLayoutInflater();
                View view = inflater.inflate(R.layout.item, null);
                return view;
            }
        });
        init();
    }


    private void init() {
        final LinearLayout dingdan = (LinearLayout)findViewById(R.id.ding_dan);
        dingdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inboxLayout.openWithAnim(dingdan);
                }catch (Exception e){
                }
            }
        });

        final LinearLayout yuding = (LinearLayout)findViewById(R.id.yuding);
        yuding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inboxLayout.openWithAnim(yuding);
                }catch (Exception e){
                }
            }
        });

        final LinearLayout tuijian = (LinearLayout)findViewById(R.id.tuijian);
        tuijian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inboxLayout.openWithAnim(tuijian);
                }catch (Exception e){
                }
            }
        });

        final LinearLayout member = (LinearLayout)findViewById(R.id.member);
        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inboxLayout.openWithAnim(member);
                }catch (Exception e){
                }
            }
        });

        final LinearLayout choujiang = (LinearLayout)findViewById(R.id.choujiang);
        choujiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inboxLayout.openWithAnim(choujiang);
                }catch (Exception e){
                }
            }
        });

        final LinearLayout diyongquan = (LinearLayout)findViewById(R.id.diyongquan);
        diyongquan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    inboxLayout.openWithAnim(diyongquan);
                }catch (Exception e){
                }
            }
        });
    }


}
