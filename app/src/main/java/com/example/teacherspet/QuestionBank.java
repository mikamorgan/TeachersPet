package com.example.teacherspet;

public class QuestionBank {
    private String Questions [] = {
            "Enter first question here",
            "Enter second question here"
    };

    private String Answers [][] = {
            {"Choice A", "Choice B", "Choice C"},
            {"Choice A", "Choice B", "Choice C"}
    };

    private String CorrectAnswers [] = {
            "Choice B",
            "Choice A"
    };

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

    public String getCorrectAnswer(int a){
        String answer = CorrectAnswers[a];
        return answer;
    }
}
