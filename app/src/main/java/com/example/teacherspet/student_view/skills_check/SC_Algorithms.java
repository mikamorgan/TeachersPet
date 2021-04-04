package com.example.teacherspet.student_view.skills_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teacherspet.R;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class SC_Algorithms extends AppCompatActivity {

/************************************************************************
 * TODO: Randomize question selection
 * (right now they load in order every time)
 * TODO: Randomize choice locations
 * (right now they load in order every time)
 * TODO: Remove button drop shadow
 * So all that is displayed is the background button image
 *
 * OPTIONAL EXTRAS:
 * TODO: Mark questions as "complete" once the user gets them correct
 * Will need this to determine student "progress"/completion
 * This information will need to be stored in the database by user
 * TODO: Collect information about question correct/incorrect ratio
 * This information will need to be stored in the database by question
 * This data could be displayed to professors, to show potential areas
 * of student weakness to address ("commonly missed questions")
 * TODO: Add timer bar at top of screen
 * Once time "runs out" the question would be marked wrong and
 * question/answers could update
 * TODO: Add positive reinforcement sound effect or animation
 * To play when a student gets the answer correct
 * TODO: Make questions update after each answer, right or wrong
 * (right now students can click as many choices as needed until
 * the get it correct)
 ************************************************************************/

    /************************************************************************
     * This class creates the Skills Check page for the
     * Algorithm topic. It has an instance of the
     * QuestionBank class, which this class accesses
     * to get the questions, answer choices, and correct
     * answers at a given index. These items are populated in the
     * question text field and the four answer choice buttons.
     *
     * Questions and answers update when the user gets the question
     * correct. A running score is kept and displayed in the top right.
     *
     * The background image and page layout are determined
     * in the sc_algorithms XML file, in the layout package
     ************************************************************************/

    //Create an instance of QuestionBank class to access quiz material
    //This is an example of aggregation
    private QuestionBank questionBank = new QuestionBank();

    //Create text fields to display question and score
    private TextView mscoreView;
    private TextView mquestionView;

    //Create 4 buttons to hold each answer choice
    private Button mchoice1;
    private Button mchoice2;
    private Button mchoice3;
    private Button mchoice4;

    //Save the correct answer to match with selected button string
    private String answer;

    //Initialize score to zero (should we change this if we "save" old progress?)
    private int mscore = 0;

    //Current algorithm material are in QuestionBank indices 38-57
    private int questionIndex = 38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Lines 84-91 link the page content with the layout XML file
        setContentView(R.layout.activity_s_c__algorithms);

        mscoreView = (TextView) findViewById(R.id.score);
        mquestionView = (TextView) findViewById(R.id.question);
        mchoice1 = (Button) findViewById(R.id.choice1);
        mchoice2 = (Button) findViewById(R.id.choice2);
        mchoice3 = (Button) findViewById(R.id.choice3);
        mchoice4 = (Button) findViewById(R.id.choice4);

        //Method to update the question and button text to populate algorithm info
        updateQuestions();

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  Check the text of button one; if it matches string of correct answer,
         *  the student got the question right. (Capitalization matters)
         *  Increment their score and call the updateQuestions method to
         *  repopulate screen with new question and answer choices
         *  (still in algorithm section- determined by index passed in).
         ***************************************************************************/

        mchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice1.getText() == answer) {
                    mscore++;
                    updateScore(mscore);
                    Toast.makeText(SC_Algorithms.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  Check the text of button two; if it matches string of correct answer,
         *  the student got the question right. (Capitalization matters)
         *  Increment their score and call the updateQuestions method to
         *  repopulate screen with new question and answer choices
         *  (still in algorithm section- determined by index passed in).
         ***************************************************************************/

        mchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice2.getText() == answer) {
                    mscore++;
                    updateScore(mscore);
                    Toast.makeText(SC_Algorithms.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  Check the text of button three; if it matches string of correct answer,
         *  the student got the question right. (Capitalization matters)
         *  Increment their score and call the updateQuestions method to
         *  repopulate screen with new question and answer choices
         *  (still in algorithms section- determined by index passed in).
         ***************************************************************************/

        mchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice3.getText() == answer) {
                    mscore++;
                    updateScore(mscore);
                    Toast.makeText(SC_Algorithms.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

        /****************************************************************************
         *  OnClickListener checks to see if a button is pressed
         *
         *  Check the text of button four; if it matches string of correct answer,
         *  the student got the question right. (Capitalization matters)
         *  Increment their score and call the updateQuestions method to
         *  repopulate screen with new question and answer choices
         *  (still in algorithms section- determined by index passed in).
         ***************************************************************************/

        mchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mchoice4.getText() == answer) {
                    mscore++;
                    updateScore(mscore);
                    Toast.makeText(SC_Algorithms.this, "CORRECT!", Toast.LENGTH_SHORT);
                    updateQuestions();
                }
            }
        });

    }

    //Method to update the score text displayed on the screen
    private void updateScore(int point){

        //Must use concatenation because "setText" expects a string,
        //but score variable is an int
        mscoreView.setText("" + point);

        fetchDB();
    }

    private void fetchDB(){
        String email = getIntent().getStringExtra("email");
        String result = "";
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[1];
                field[0] = "email";
                //Creating array for data
                String[] data = new String[1];
                data[0] = email;

                PutData putData = new PutData("http://192.168.1.138/LoginRegister/fetchdata.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        updateDB(result);
                    }
                }
            }
        });

    }

    private void updateDB(String quizCount){
        String email = getIntent().getStringExtra("email");
        Toast.makeText(getApplicationContext(), quizCount, Toast.LENGTH_SHORT).show();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                int quiz = Integer.parseInt(quizCount);
                quiz++;
                String updatedQuizCount = "" + quiz;
                Toast.makeText(getApplicationContext(), updatedQuizCount, Toast.LENGTH_SHORT).show();
                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[2];
                field[0] = "email";
                field[1] = "quizzes";
                //Creating array for data
                String[] data = new String[2];
                data[0] = email;
                data[1] = updatedQuizCount;

                PutData putData = new PutData("http://192.168.1.138/LoginRegister/updatequiz.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        if(result.equals("Updated"))
                        {
                            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }

    /******************************************************************
     * These method is used to repopulate the question text field
     * and four buttons for answer choices, by getting the strings
     * from the QuestionBank class. It gets the information at
     * "questionIndex", which is incremented after each call so it
     * will get the next question and answer choices on the next call.
     ******************************************************************/
    private void updateQuestions(){
        mquestionView.setText(questionBank.getQuestion(questionIndex));
        mchoice1.setText(questionBank.getChoice1(questionIndex));
        mchoice2.setText(questionBank.getChoice2(questionIndex));
        mchoice3.setText(questionBank.getChoice3(questionIndex));
        mchoice4.setText(questionBank.getChoice4(questionIndex));

        answer = questionBank.getCorrectAnswer(questionIndex);
        questionIndex++;

        //If you reach the end of algorithm questions, start over
        if(questionIndex > 57) {
            questionIndex = 38;
        }
    }
}