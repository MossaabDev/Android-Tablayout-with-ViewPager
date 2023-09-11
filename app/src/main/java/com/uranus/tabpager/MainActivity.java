package com.uranus.tabpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);
        adapter = new PagerViewAdapter(this.getSupportFragmentManager());
        List<Fragment> fragments = new ArrayList<>();

        adapter.addFragment(new FragmentOne(), "One");
        adapter.addFragment(new FragmnetTwo(), "Two");
        adapter.addFragment(new FragmentThree(), "Three");

        viewPager.setAdapter(adapter);

    }


}