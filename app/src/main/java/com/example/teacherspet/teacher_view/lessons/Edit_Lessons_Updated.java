package com.example.teacherspet.teacher_view.lessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.teacherspet.R;

public class Edit_Lessons_Updated extends AppCompatActivity {
    //ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_edit__lessons__updated);
        //scrollView = findViewById(R.id.rl);

        ScrollView scrollView = new ScrollView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        ConstraintLayout.LayoutParams layoutParams1 = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        scrollView.setLayoutParams(layoutParams1);

        ConstraintLayout linearLayout = new ConstraintLayout(this);

        scrollView.addView(linearLayout);

        ImageView imageView = new ImageView(this);
        ConstraintLayout.LayoutParams params1 = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params1.setMargins(100, 220, 100, 100);
        imageView.setLayoutParams(params1);
        imageView.setImageResource(R.drawable.msu);

        setContentView(scrollView);


        String lesson = getIntent().getStringExtra("lesson");
        String email = getIntent().getStringExtra("email");
        String position = getIntent().getStringExtra("position");
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String link = getIntent().getStringExtra("link");

        //Set background to match layout of lesson passed in
        switch(lesson){
            case "algo":
                scrollView.setBackgroundResource(R.drawable.lessons_algorithms_studentview);
                break;
            case "BT":
                scrollView.setBackgroundResource(R.drawable.lessons_binary_studentview);
                break;
            case "lis":
                scrollView.setBackgroundResource(R.drawable.lessons_lists_studentview);
                break;
            case "poi":
                scrollView.setBackgroundResource(R.drawable.lessons_pointers_studentview);
                break;
            case "rec":
                scrollView.setBackgroundResource(R.drawable.lessons_recursion_studentview);
                break;
            case "rev":
                scrollView.setBackgroundResource(R.drawable.lessons_review_studentview);
                break;
            case "sta":
                scrollView.setBackgroundResource(R.drawable.lessons_stacks_studentview);
                break;
        }
        switch (position){
            case "1":
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                linearLayout.addView(imageView);
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "10":
                break;
        }
    }
}