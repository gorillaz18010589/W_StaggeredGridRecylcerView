package com.example.w_staggeredgridrecylcerview;
//1.加入API
//roundedimageview
//implementation  'com.makeramen:roundedimageview:2.3.0'

//2.RecylceView設定在xml

//3.itemView設定

//4.itemView裡 最外圍用RoudedImageView包起來

//5.寫一個PostItem,這邊依你的屬性需求去要,主要是load imagView圖片

//6.RecycleView處理

//7.在ViewHolder裡面寫一個  setPostImage方法

//8.回到MainActivy處理調變器,這邊主要設定 new StaggeredGridLayoutManager
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ItemImag> imgList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }
//    StaggeredGridLayoutManager(int spanCount, int orientation):建構式產生瀑布式經理人畫面(1.要產生的view數,如果垂直是烈數,如果水平是行數 2.畫面要調整的屬性垂直或水平等)
    private void init() {
        recyclerView = findViewById(R.id.recview);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));//StaggeredGridLayoutManager(int spanCount, int orientation):(1.要產生的view數,如果垂直是烈數,如果水平是行數 2.畫面要調整的屬性垂直或水平等)

        imgList = new ArrayList<>();
        imgList.add(new ItemImag(R.drawable.a));
        imgList.add(new ItemImag(R.drawable.b));
        imgList.add(new ItemImag(R.drawable.c));
        imgList.add(new ItemImag(R.drawable.d));
        imgList.add(new ItemImag(R.drawable.e));
        imgList.add(new ItemImag(R.drawable.f));

        StaggeredRecyclerViewAdapter recyclerViewAdapter = new StaggeredRecyclerViewAdapter(imgList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
