package com.selimcinar.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  goTofirst(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();
        //Add direkt üzerine ekler ikiside durur replace üzerine ekler en son eklenen sayfada kalır
       // fragmentTransaction.add(R.id.frame_layout,firstFragment).commit();
       fragmentTransaction.replace(R.id.frame_layout,firstFragment).commit();

    }

    public void   goTotwo(View view){
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    SecondFragment secondFragment = new SecondFragment();
    //Add direkt üzerine ekler ikiside durur replace üzerine ekler en son eklenen sayfada kalır
    //fragmentTransaction.add(R.id.frame_layout,secondFragment).commit();
    fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();

    }
}