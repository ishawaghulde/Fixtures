package com.example.fixruresui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    RecyclerView NewsRecyclerview;
//    NewsAdapter newsAdapter;
//    List<NewsItem> mData;
    ArrayList<String> sportList = new ArrayList<>();
    TextAdapter textAdapter;
    RecyclerView recyclerView;

    private View.OnClickListener onItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            navigate();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        NewsRecyclerview = findViewById(R.id.news_rv);
//        mData = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        textAdapter = new TextAdapter();
        recyclerView.setAdapter(textAdapter);
        textAdapter.setItemClickListener(onItemClickListener);
        sportList.add(("Athletics").toUpperCase());
        sportList.add(("Badminton(Mixed)").toUpperCase());
        sportList.add(("Basketball(Boys)").toUpperCase());
        sportList.add(("Basketball(Girls)").toUpperCase());
        sportList.add(("Carrom").toUpperCase());
        sportList.add(("Chess").toUpperCase());
        sportList.add(("Cricket(Boys)").toUpperCase());
        sportList.add(("Cricket(Girls)").toUpperCase());
        sportList.add(("Football(Boys)").toUpperCase());
        sportList.add(("Handball(Boys)").toUpperCase());
        sportList.add(("Handball(Girls)").toUpperCase());
        sportList.add(("Hockey(Boys)").toUpperCase());
        sportList.add(("Kabaddi").toUpperCase());
        sportList.add(("Kho Kho(Boys)").toUpperCase());
        sportList.add(("Kho Kho(Girls)").toUpperCase());
        sportList.add(("Marathon").toUpperCase());
        sportList.add(("Powerlifting").toUpperCase());
        sportList.add(("Swimming").toUpperCase());
        sportList.add(("Table Tennis(Mixed)").toUpperCase());
        sportList.add(("Tennis(Boys)").toUpperCase());
        sportList.add(("Throwball").toUpperCase());
        sportList.add(("Volleyball(Boys)").toUpperCase());
        sportList.add(("Volleyball(Girls)").toUpperCase());
        sportList.add(("SportsQuiz").toUpperCase());
        makeList();

//        mData.add(new NewsItem("OnePlus 6T Camera Review:","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("I love Programming And Design","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("My first trip to Thailand story ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("After Facebook Messenger, Viber now gets...","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("Isometric Design Grid Concept","lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("Android R Design Concept 4K","lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit ","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("OnePlus 6T Camera Review:","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("I love Programming And Design","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("My first trip to Thailand story ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("After Facebook Messenger, Viber now gets...","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("Isometric Design Grid Concept","lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("Android R Design Concept 4K","lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit ","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("OnePlus 6T Camera Review:","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("I love Programming And Design","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("My first trip to Thailand story ","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("After Facebook Messenger, Viber now gets...","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("Isometric Design Grid Concept","lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit","6 july 1994",R.drawable.search));
//        mData.add(new NewsItem("Android R Design Concept 4K","lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit ","6 july 1994",R.drawable.search));
//
//
//        newsAdapter = new NewsAdapter(this,mData);
//        NewsRecyclerview.setLayoutManager(new LinearLayoutManager(this));
//        NewsRecyclerview.setAdapter(newsAdapter);

    }

    private void makeList(){
        textAdapter.setItems(sportList);
    }

    private void navigate(){

        Intent intent = new Intent(MainActivity.this, FixturesActivity.class);
        startActivity(intent);
        startActivity(intent);
    }
}
