package com.example.teacherspet.teacher_view.lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teacherspet.R;
import com.example.teacherspet.student_view.Attendance_Student_View;
import com.example.teacherspet.student_view.skills_check.QuestionBank;

public class Edit_Lessons extends AppCompatActivity {

    public void openEditLessonsUpdated(String title, String description, String link) {
        Intent intent = new Intent(this, Edit_Lessons_Updated.class);
        String email = getIntent().getStringExtra("email");
        String position = getIntent().getStringExtra("position");
        String lesson = getIntent().getStringExtra("lesson");
        intent.putExtra("email", email);
        intent.putExtra("position", position);
        intent.putExtra("lesson", lesson);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("link", link);


        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__lessons);

        final EditText title = findViewById(R.id.title);
        final EditText description = findViewById(R.id.description);
        final EditText link = findViewById(R.id.link);

        final Button save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String title_text       = title.getText().toString();
                String description_text = description.getText().toString();
                String link_text        = link.getText().toString();

                openEditLessonsUpdated(title_text, description_text, link_text);
            }
        });
    }
}