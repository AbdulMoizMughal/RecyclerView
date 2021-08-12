package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import Adapters.ReciepiesAdaptor;
import Models.Recipies;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   recyclerView=findViewById(R.id.view);
        ArrayList< Recipies > list=new ArrayList<>();
        list.add(new Recipies(R.drawable.r1,"Burger"));
        list.add(new Recipies(R.drawable.r1,"Mango"));
        list.add(new Recipies(R.drawable.r1,"Burger"));
        list.add(new Recipies(R.drawable.r1,"Burger"));
        list.add(new Recipies(R.drawable.r1,"Mango"));
        list.add(new Recipies(R.drawable.r1,"Burger"));
        list.add(new Recipies(R.drawable.r1,"Burger"));
        list.add(new Recipies(R.drawable.r1,"Mango"));
        list.add(new Recipies(R.drawable.r1,"Burger"));


        ReciepiesAdaptor adaptor=new ReciepiesAdaptor(list,this);
        recyclerView.setAdapter(adaptor);
//Linear Layout vertical
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
       recyclerView.setLayoutManager(layoutManager);
//Linear Layout Horizontal
      //  LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //recyclerView.setLayoutManager(layoutManager);
   //Grid Layout Manager
       // GridLayoutManager gridLayoutManager= new GridLayoutManager(this,2);
        //recyclerView.setLayoutManager(gridLayoutManager);
        //Staggered Layout Manager Vertical
        //StaggeredGridLayoutManager staggered= new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //recyclerView.setLayoutManager(staggered);
        //Staggered Layout Manager Horizontal
        //StaggeredGridLayoutManager staggered= new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        //recyclerView.setLayoutManager(staggered);
    }
}