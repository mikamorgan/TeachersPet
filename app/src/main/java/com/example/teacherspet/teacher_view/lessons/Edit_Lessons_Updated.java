package com.example.teacherspet.teacher_view.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.teacherspet.R;

public class Edit_Lessons_Updated extends AppCompatActivity {
    ScrollView scrollView;
    String lesson = getIntent().getStringExtra("lesson");
    String email = getIntent().getStringExtra("email");
    String position = getIntent().getStringExtra("position");
    String title = getIntent().getStringExtra("title");
    String description = getIntent().getStringExtra("description");
    String link = getIntent().getStringExtra("link");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__lessons__updated);
        scrollView = findViewById(R.id.rl);

        Toast.makeText(getApplicationContext(), "pos" + position, Toast.LENGTH_SHORT).show();

        //ImageView Setup
        ImageView imageView = new ImageView(this);
        //setting image resource
        imageView.setImageResource(R.drawable.msu);

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
                imageView.layout(100, 220, 100, 100);
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                scrollView.addView(imageView);
                setContentView(scrollView);
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