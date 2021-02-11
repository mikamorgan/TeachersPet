package com.example.teacherspet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Self_Study_Student_View extends AppCompatActivity {

    public void openAlgorithms() {
        Intent intent = new Intent(this, SC_Algorithms.class);
        startActivity(intent);
    }

    public void openBinary() {
        Intent intent = new Intent(this, SC_Binary_Trees.class);
        startActivity(intent);
    }

    public void openLists() {
        Intent intent = new Intent(this, SC_Lists.class);
        startActivity(intent);
    }

    public void openPointers() {
        Intent intent = new Intent(this, SC_Pointers.class);
        startActivity(intent);
    }

    public void openRecursion() {
        Intent intent = new Intent(this, SC_Recursion.class);
        startActivity(intent);
    }

    public void openReview() {
        Intent intent = new Intent(this, SC_Review.class);
        startActivity(intent);
    }

    public void openStacks() {
        Intent intent = new Intent(this, SC_Stacks.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self__study_student);

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