package com.appshat.health_tutor;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //toolbar actionbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_viewId);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.nav_draw_open,R.string.nav_draw_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_newbornbaby:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new NewBornbabyFragment()).commit();
                break;
            case R.id.nav_children:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ChildrenFragment()).commit();
                break;

            case R.id.nav_tika:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new TikaFragment()).commit();
                break;
            case R.id.nav_helpline:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HelplinneFragment()).commit();
                break;
            case R.id.nav_hospital:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new NearbyHospitalFragment()).commit();
                break;
            case R.id.nav_nutrition:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new RequiredNutritionFragment()).commit();
                break;
            case  R.id.nav_aboutus:
                Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.nav_location:
                Toast.makeText(this, "Meet Us", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.nav_share:
                Toast.makeText(this, "Share With", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}
