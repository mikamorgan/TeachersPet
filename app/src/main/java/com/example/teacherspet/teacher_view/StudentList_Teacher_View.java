package com.example.teacherspet.teacher_view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.teacherspet.R;

public class StudentList_Teacher_View extends AppCompatActivity {
    String name1 = " Kelly Rogers";
    String name2 = " Bill Kendricks";
    String name3 = " Jade Wilkons";
    String name4 = " Justine Skye";
    String name5 = " Karl Singh";
    String name6 = " Reese Junix";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_studentlist_view);

        TextView student1 = (TextView) findViewById(R.id.stud1);
        student1.setText(name1);
        TextView student2 = (TextView) findViewById(R.id.stud2);
        student2.setText(name2);
        TextView student3 = (TextView) findViewById(R.id.stud3);
        student3.setText(name3);
        TextView student4 = (TextView) findViewById(R.id.stud1);
        student4.setText(name4);
        TextView student5 = (TextView) findViewById(R.id.stud1);
        student5.setText(name5);
        TextView student6 = (TextView) findViewById(R.id.stud6);
        student6.setText(name6);
    }

}
