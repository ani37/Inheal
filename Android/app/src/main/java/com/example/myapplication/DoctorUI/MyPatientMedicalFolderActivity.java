package com.example.myapplication.DoctorUI;

import android.os.Bundle;

import com.example.myapplication.DoctorUI.ui.main.SectionsPagerAdapterMyPatientMF;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MyPatientMedicalFolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_patient_medical_folder);
        SectionsPagerAdapterMyPatientMF sectionsPagerAdapter = new SectionsPagerAdapterMyPatientMF(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}