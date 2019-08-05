package com.appshat.health_tutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GridView_Activity extends AppCompatActivity {
    List<Book> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_);
        String name = getIntent().getStringExtra("name");
        lstBook = new ArrayList<>();
        if (name.equals(String.valueOf("babytika"))){
            lstBook.add(new Book("h²v","Categorie Book","Description book",R.drawable.ht3));
            lstBook.add(new Book("wWd‡_wiqv, ûwcsKvwk\nabyósKvi, †ncvUvBwUm-we,\nwn‡gvdvBjvm Bbd¬y‡qÄv-we","Categorie Book","Description book",R.drawable.ht3));
            lstBook.add(new Book("wbD‡gvK°vj wbD‡gvwbqv","Categorie Book","Description book",R.drawable.ht3));
            lstBook.add(new Book("†cvwjI gvBjvBUm","Categorie Book","Description book",R.drawable.ht3));
            lstBook.add(new Book("nvg I iæ‡ejv","Categorie Book","Description book",R.drawable.ht3));
            lstBook.add(new Book("nvg","Categorie Book","Description book",R.drawable.ht3));

            selectAdapter();
        }
       else if(name.equals(String.valueOf("womentika"))){
            lstBook.add(new Book("nvg I iæ‡ejv","Categorie Book","Description book",R.drawable.ht3));
            lstBook.add(new Book("abyósKvi","Categorie Book","Description book",R.drawable.ht3));

            selectAdapter();
        }
    }

    private void selectAdapter() {
        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
