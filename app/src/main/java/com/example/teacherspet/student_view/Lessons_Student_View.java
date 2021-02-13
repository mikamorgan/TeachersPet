package com.example.teacherspet.student_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.lessons.L_Algorithms;
import com.example.teacherspet.student_view.lessons.L_Binary_Trees;
import com.example.teacherspet.student_view.lessons.L_Lists;
import com.example.teacherspet.student_view.lessons.L_Pointers;
import com.example.teacherspet.student_view.lessons.L_Recursion;
import com.example.teacherspet.student_view.lessons.L_Review;
import com.example.teacherspet.student_view.lessons.L_Stacks;
import com.example.teacherspet.student_view.skills_check.SC_Algorithms;
import com.example.teacherspet.student_view.skills_check.SC_Binary_Trees;
import com.example.teacherspet.student_view.skills_check.SC_Lists;
import com.example.teacherspet.student_view.skills_check.SC_Pointers;
import com.example.teacherspet.student_view.skills_check.SC_Recursion;
import com.example.teacherspet.student_view.skills_check.SC_Review;
import com.example.teacherspet.student_view.skills_check.SC_Stacks;

public class Lessons_Student_View extends AppCompatActivity {

    public void openAlgorithms() {
        Intent intent = new Intent(this, L_Algorithms.class);
        startActivity(intent);
    }

    public void openBinary() {
        Intent intent = new Intent(this, L_Binary_Trees.class);
        startActivity(intent);
    }

    public void openLists() {
        Intent intent = new Intent(this, L_Lists.class);
        startActivity(intent);
    }

    public void openPointers() {
        Intent intent = new Intent(this, L_Pointers.class);
        startActivity(intent);
    }

    public void openRecursion() {
        Intent intent = new Intent(this, L_Recursion.class);
        startActivity(intent);
    }

    public void openReview() {
        Intent intent = new Intent(this, L_Review.class);
        startActivity(intent);
    }

    public void openStacks() {
        Intent intent = new Intent(this, L_Stacks.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_student);

        final Button algorithmButton = findViewById(R.id.algo);
        final Button binaryButton = findViewById(R.id.binary);
        final Button listButton = findViewById(R.id.lists);
        final Button pointersButton = findViewById(R.id.pointers);
        final Button recursionButton = findViewById(R.id.recursion);
        final Button reviewButton = findViewById(R.id.review);
        final Button stacksButton = findViewById(R.id.stacks);

        algorithmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlgorithms();
            }
        });

        binaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBinary();
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLists();
            }
        });

        pointersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPointers();
            }
        });

        recursionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecursion();
            }
        });

        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });

        stacksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStacks();
            }
        });

    }
}