package com.example.teacherspet.teacher_view.lessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teacherspet.R;

public class Edit_Lessons_Updated extends AppCompatActivity {
    //ScrollView scrollView;

    public void openLink5(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__lessons__updated);
        //scrollView = findViewById(R.id.rl);

        //Create the 10 lesson buttons and 1 back button
        final ImageButton link1Button = findViewById(R.id.button4);
        final ImageButton link2Button = findViewById(R.id.button5);
        final ImageButton link3Button = findViewById(R.id.button6);
        final ImageButton link4Button = findViewById(R.id.button7);
        final ImageButton link5Button = findViewById(R.id.button8);
        final ImageButton link6Button = findViewById(R.id.button9);
        final ImageButton link7Button = findViewById(R.id.button10);
        final ImageButton link8Button = findViewById(R.id.button11);
        final ImageButton link9Button = findViewById(R.id.button12);
        final ImageButton link10Button = findViewById(R.id.button13);
        final ImageButton backButton = findViewById(R.id.button14);

        final TextView title_text = findViewById(R.id.textView);
        final TextView description_text = findViewById(R.id.textView2);

        String lesson = getIntent().getStringExtra("lesson");
        String email = getIntent().getStringExtra("email");
        String position = getIntent().getStringExtra("position");
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String link = getIntent().getStringExtra("link");

        title_text.setText(title);
        description_text.setText(description);

        //Set background to match layout of lesson passed in
        /*switch(lesson){
            case "algo":
                scrollView.setBackgroundResource(R.drawable.lessons_algorithms_studentview);
                setContentView(scrollView);
                break;
            case "BT":
                scrollView.setBackgroundResource(R.drawable.lessons_binary_studentview);
                setContentView(scrollView);
                break;
            case "lis":
                scrollView.setBackgroundResource(R.drawable.lessons_lists_studentview);
                setContentView(scrollView);
                break;
            case "poi":
                scrollView.setBackgroundResource(R.drawable.lessons_pointers_studentview);
                setContentView(scrollView);
                break;
            case "rec":
                scrollView.setBackgroundResource(R.drawable.lessons_recursion_studentview);
                setContentView(scrollView);
                break;
            case "rev":
                scrollView.setBackgroundResource(R.drawable.lessons_review_studentview);
                setContentView(scrollView);
                break;
            case "sta":
                scrollView.setBackgroundResource(R.drawable.lessons_stacks_studentview);
                setContentView(scrollView);
                break;
        }*/

        switch (position){
            case "1":
                link1Button.setBackgroundResource(R.drawable.msu);
                link1Button.getBackground().setAlpha(255);
                link1Button.setImageAlpha(255);
                break;
            case "2":
                Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                link2Button.setBackgroundResource(R.drawable.msu);
                link2Button.getBackground().setAlpha(255);
                link2Button.setImageAlpha(255);
                break;
            case "3":
                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                link3Button.setImageResource(R.drawable.msu);
                link3Button.getBackground().setAlpha(255);
                break;
            case "4":
                Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
                break;
            case "5":
                Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_SHORT).show();
                link5Button.getBackground().setAlpha(255);
                link5Button.setImageAlpha(255);
                break;
            case "6":
                Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                link6Button.getBackground().setAlpha(255);
                link6Button.setImageAlpha(255);
                break;
            case "7":
                Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_SHORT).show();
                break;
            case "8":
                Toast.makeText(getApplicationContext(), "8", Toast.LENGTH_SHORT).show();
                break;
            case "9":
                Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_SHORT).show();
                break;
            case "10":
                Toast.makeText(getApplicationContext(), "10", Toast.LENGTH_SHORT).show();
                break;
        }

        link5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink5(link);
            }
        });

    }
}





























//First attempt
/*
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
 */