package com.example.administrator.cc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private JSONArray data;
    List<String> list=new ArrayList<String>();
    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewById = findViewById(R.id.tv);
        Intent intent=new Intent(this,LocalService.class);
        bindService(intent, new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LocalService.LocalBinder localBinder = (LocalService.LocalBinder) iBinder;
                LocalService localService = localBinder.getLocalService();
                viewById.setText(localService.getRundomNumber());
            }

            //sdsfdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
            @Override
            public void onServiceDisconnected(ComponentName componentName) {

            }
        }, Context.BIND_AUTO_CREATE);

//
//        int[] a=new int[]{8,9,6,3,7,2,5,1,4};
//
//        Sort sort=new Sort();
//        sort.quickSort(a,0,a.length-1);
//        TextView viewById = findViewById(R.id.tv);
//        StringBuffer stringBuffer=new StringBuffer();
//        for (int i=0;i<a.length;i++){
//            stringBuffer.append(a[i]);
//        }
//        Toast.makeText(this,stringBuffer,Toast.LENGTH_LONG).show();
//        viewById.setText(a[2]);
//        Intent intent=new Intent(this,TService.class);
//        startService(intent);
//        listView = findViewById(R.id.images);
//
//
//        try {
//            JSONObject jsonObject=new JSONObject("{\n" +
//                    "\t\"data\": [\"http://www.logofree.cn/uploads/image/20170614/11/27_2079.jpg\",\n" +
//                    "\t\t\"http://www.logofree.cn/uploads/image/20171110/17/4-01_2564.jpg\",\n" +
//                    "\t\t\"http://www.logofree.cn/uploads/image/20170731/10/52_2504.jpg\",\n" +
//                    "\t\t\"http://www.logofree.cn/uploads/image/20170508/16/143_446.jpg\",\n" +
//                    "\t\t\"http://www.logofree.cn/uploads/image/20170524/11/279_1561.jpg\",\n" +
//                    "\t\t\"http://www.logofree.cn/uploads/image/20170524/11/250_1509.jpg\",\n" +
//                    "\t\t\"http://www.logofree.cn/uploads/image/20170512/14/xw87_933.jpg\"\n" +
//                    "\t       ]\n" +
//                    "}");
//            data = jsonObject.getJSONArray("data");
//            for (int i=0;i<data.length();i++){
//                list.add((String) data.get(i));
//            }
//            listView.setAdapter(new BaseAdapter() {
//                @Override
//                public int getCount() {
//                    return list.size();
//                }
//
//                @Override
//                public Object getItem(int i) {
//                    return null;
//                }
//
//                @Override
//                public long getItemId(int i) {
//                    return 0;
//                }
//
//                @Override
//                public View getView(int i, View view, ViewGroup viewGroup) {
//
//                    ImageView  imageView=new ImageView(MainActivity.this);
//
//                    Picasso.with(MainActivity.this).load(list.get(i)).into(imageView);
//
//                    return imageView;
//                }
//            });
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }in


    }



}
