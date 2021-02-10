package com.example.teacherspet;

public class QuestionBank {

    /*************************************************
     * Add questions to the question bank here :)
     * SEPARATE ORDER BY SUBJECT!
     * Use comments to delineate subject indices.
     * We can pass in random a to select from
     * specific index ranges for each subject.
     ************************************************/
    private String Questions [] = {
            "Enter first question here",
            "Enter second question here"
    };

    /*************************************************
     * Add all 4 possible answer choices here :)
     * VERY IMPORTANT!
     * The index of the answer choices has to match
     * the index of the corresponding question!
     ************************************************/
    private String Answers [][] = {
            {"Choice A", "Choice B", "Choice C", "Choice D"},
            {"Choice A", "Choice B", "Choice C", "Choice D"}
    };

    /**************************************************
     * Identify the one correct answer choice here :)
     * This choice should be one of the ones already
     * listed in Answers array!
     * VERY IMPORTANT!
     * The index of the correct answer choice should
     * match the corresponding question and choices!
     *************************************************/
    private String CorrectAnswers [] = {
            "Choice C",
            "Choice A"
    };

    /**************************************************
     * Accessor methods
     *************************************************/
    public String getQuestion(int a){
            String question = Questions[a];
            return question;
    }

    public String getChoice1(int a){
            String choice1 = Answers[a][0];
            return choice1;
    }

    public String getChoice2(int a){
        String choice2 = Answers[a][1];
        return choice2;
    }

    public String getChoice3(int a){
        String choice3 = Answers[a][2];
        return choice3;
    }

    public String getChoice4(int a){
        String choice4 = Answers[a][3];
        return choice4;
    }

    public String getCorrectAnswer(int a){
        String answer = CorrectAnswers[a];
        return answer;
    }
}
