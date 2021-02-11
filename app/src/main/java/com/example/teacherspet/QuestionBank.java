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
            //1044 Review Questions
            "What is the last index of an array with 5 items?",         //0
            "Enter second question here",       //1

            //Binary Tree Questions
            "How many children can a binary tree node have?",           //10
            "What is the first node in a binary tree called?",          //11
            "What are the final nodes in a binary tree called?",        //12
            "Smaller values are inserted to the _______ in a BST.",//13
            "Root -> Left -> Right is what kind of traversal?",         //14
            "Left -> Root -> Right is what kind of traversal?",         //15
            "Left -> Right -> Root is what kind of traversal?",         //16
            "For n nodes, what is the max height of a binary tree?",    //17
            "To be useful, binary trees should be _________.",          //18
            "A binary tree where every node has 0 or 2 children.",      //19
            "Every node has 2 children and all leaves on same level.",  //20
            "A binary tree where every node has 1 child.",              //21
            "All levels are full except last; leaves are left leaning", //22
            "Total number of leaves in a full binary tree with n nodes",//23
            "What kind of binary tree is used to implement heaps?",     //24
            "What is the worst case complexity of Binary Search Tree?", //25
            "What is the best case complexity of Binary Search Tree?",  //26
            "Which of the following is not a self-balancing tree?",     //27


            //Search & Sort Algorithms Questions
            "Enter second question here",       //4
            "Enter second question here",       //5

            //Pointers Questions
            "Enter second question here",       //6
            "Enter second question here",       //7

            //Recursion Questions
            "Enter second question here",       //8
            "Enter second question here",       //9

            //Linked Lists Questions
            "Enter second question here",       //10
            "Enter second question here",       //11

            //Stacks/Queues Questions
            "Enter second question here",       //12
            "Enter second question here",       //13
    };

    /*************************************************
     * Add all 4 possible answer choices here :)
     * VERY IMPORTANT!
     * The index of the answer choices has to match
     * the index of the corresponding question!
     ************************************************/
    private String Answers [][] = {
            //1044 Review Answers
            {"0", "4", "5", "6"},       //0
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //1

            //Binary Tree Answers
            {"2", "1", "0", "Any #"},                               //10
            {"First", "Root", "Leaf", "Child"},                     //11
            {"Parents", "Roots", "Right", "Leaves"},                //12
            {"Front", "Right", "Left", "Back"},                     //13
            {"Inorder", "Postorder", "Preorder", "Natural"},        //14
            {"Inorder", "Postorder", "Preorder", "Natural"},        //15
            {"Inorder", "Postorder", "Preorder", "Natural"},        //16
            {"n", "n^2", "n/2", "log2(n)"},                         //17
            {"Balanced", "Alphabetical", "Random", "Skewed"},       //18
            {"Complete", "Full", "Perfect", "Degenerate"},          //19
            {"Complete", "Full", "Perfect", "Degenerate"},          //20
            {"Complete", "Full", "Perfect", "Degenerate"},          //21
            {"Complete", "Full", "Perfect", "Degenerate"},          //22
            {"n", "n/2", "(n+1)/2", "log2(n)"},                     //23
            {"Complete", "Full", "Perfect", "Degenerate"},          //24
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},       //25
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},       //26
            {"AVL", "B-Tree", "Red-Black", "BST"},                  //27


            //Search & Sort Algorithms Answers
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //4
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //5

            //Pointers Answers
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //6
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //7

            //Recursion Answers
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //8
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //9

            //Linked Lists Answers
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //10
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //11

            //Stacks/Queues Answers
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //12
            {"Choice A", "Choice B", "Choice C", "Choice D"}        //13
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
            //1044 Review Correct Answers
            "4",       //0
            "Choice D",       //1

            //Binary Tree Correct Answers
            "2",            //10
            "Root",         //11
            "Leaves",       //12
            "Left",         //13
            "Preorder",     //14
            "Inorder",      //15
            "Postorder",    //16
            "log2(n)",      //17
            "Balanced",     //18
            "Full",         //19
            "Perfect",      //20
            "Degenerate",   //21
            "Complete",     //22
            "(n+1)/2",      //23
            "Complete",     //24
            "O(n)",         //25
            "O(log(n))",    //26
            "BST",          //27

            //Search & Sort Algorithms Correct Answers
            "Choice C",       //4
            "Choice A",       //5

            //Pointers Correct Answers
            "Choice D",       //6
            "Choice C",       //7

            //Recursion Correct Answers
            "Choice C",       //8
            "Choice A",       //9

            //Linked Lists Correct Answers
            "Choice B",       //10
            "Choice B",       //11

            //Stacks/Queues Correct Answers
            "Choice D",       //12
            "Choice A"        //13
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
