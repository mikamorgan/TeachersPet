package com.example.teacherspet.student_view.skills_check;

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
            "What should the return type be of a print function?",      //1
            "How do you check equality between two variables?",         //2
            "What is the largest value you can hold in a byte?",        //3
            "What could cause a run time error?",                       //4
            "What is 14 % 3?",                                          //5
            "How do you access the first element in an array?",         //6
            "What data type should you use to hold a name?",            //7
            "What should you use to repeat code 10 times?",             //8
            "What is A && !A for any boolean A?",                       //9
            "What should you use to traverse an array?",                //10
            "What is T ^ T?",                                           //11
            "How do you pass an argument to not change the original?",  //12
            "What does a floating point data type contain?",            //13
            "How do you print \"Hello World!\" in C++?",                //14
            "How do you make single line comments in C++?",             //15
            "How do you create a variable to hold a 6?",                //16
            "Which header file lets us work with input and output objects?",//17
            "How do you create a function in C++?",                     //18
            "What statement is used to stop a loop?",                   //19

            //Binary Tree Questions
            "How many children can a binary tree node have?",           //20
            "What is the first node in a binary tree called?",          //21
            "What are the final nodes in a binary tree called?",        //22
            "Smaller values are inserted to the _______ in a BST.",     //23
            "Root -> Left -> Right is what kind of traversal?",         //24
            "Left -> Root -> Right is what kind of traversal?",         //25
            "Left -> Right -> Root is what kind of traversal?",         //26
            "For n nodes, what is the max height of a binary tree?",    //27
            "To be useful, binary trees should be _________.",          //28
            "A binary tree where every node has 0 or 2 children.",      //29
            "Every node has 2 children and all leaves on same level.",  //30
            "A binary tree where every node has 1 child.",              //31
            "All levels are full except last; leaves are left leaning", //32
            "Total number of leaves in a full binary tree with n nodes",//33
            "What kind of binary tree is used to implement heaps?",     //34
            "What is the worst case complexity of Binary Search Tree?", //35
            "What is the best case complexity of Binary Search Tree?",  //36
            "Which of the following is not a self-balancing tree?",     //37


            //Search & Sort Algorithms Questions
            "What is O(n) of linear search?",                           //38
            "What is O(n) of merge sort?",                              //39
            "What is O(n) of binary search?",                           //40
            "Which of these sort algorithms is not stable?",            //41
            "Which sort moves the largest item to the far right each pass?",//42
            "What must be true for binary search to work?",             //43
            "Which of these sorts does not have O(n^2) time complexity?",//44
            "Which of these sorts makes the least amount of swaps?",    //45
            "Which of these sorts partitions data around a pivot?",     //46
            "What is the best time complexity of bubble sort?",         //47
            "Search algorithms typically return the:",                  //48
            "What does a search typically return if the value was not found?",//49
            "Why might you use an O(n^2) sort?",                        //50
            "Which algorithm can sort data dynamically as it comes in?",//51
            "What is a disadvantage of insertion sort?",                //52
            "What is needed to perform a data swap?",                   //53
            "[2, 8, 4, 1, 3] What is result after Bubble sort first pass?",//54
            "What does Big O tell us about an algorithm?",              //55
            "What does the n in Big O notation represent?",             //56
            "Order these complexities from least to greatest:",         //57

            //Pointers Questions
            "Enter second question here",       //6
            "Enter second question here",       //7

            //Recursion Questions
            "A recursive function:",       //8
            "What terminates recursion?",       //9
            "Tail recursion:",
            "How do you avoid infinite recursion?",
            "Which is true about recursion compared to iteration?",
            "What is a common application of recursion?",
            "Common programming tool used in recursive functions:",

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
            {"0", "4", "5", "6"},                                   //0
            {"int", "String", "cout", "void"},                      //1
            {"==", "equals", "=", "check name"},                    //2
            {"8", "1", "255", "127"},                               //3
            {"forget semicolon", "forget curly brace", "divide by 0", "use wrong name"}, //4
            {"2", "3", "4", "0"},                                   //5
            {"arr[1]", "arr.first", "arr[0]", "arr.1"},             //6
            {"variable", "int", "char", "string"},                  //7
            {"for", "while", "if", "switch"},                       //8
            {"true", "A", "false", "!A"},                           //9
            {"while", "arr.next", "for", "pointers"},               //10
            {"true", "false", "input", "not enough info"},          //11
            {"pass by value", "pass by reference", "pointer", "alias"}, //12
            {"whole part only", "decimal part only", "whole and decimal", "negatives only"}, //13
            {"print(\"Hello World\");", "Console.WriteLine(\"Hello World\");", "cout << \"Hello World\";", "System.out.print(\"Hello World\");"},
            {"//", "/* */", "#", "!"},                              //15
            {"int x = 6", "num x = 6", "double x = 6", "int x == 6"},//16
            {"#include<iostring>", "#include<stream>", "#include<inputstr>", "#include<iostream>"},//17
            {"functionName()", "functionName.", "functionName = ", "functionName[]"},//18
            {"exit", "stop", "break", "return"},                    //19

            //Binary Tree Answers
            {"2", "1", "0", "Any #"},                               //20
            {"First", "Root", "Leaf", "Child"},                     //21
            {"Parents", "Roots", "Right", "Leaves"},                //22
            {"Front", "Right", "Left", "Back"},                     //23
            {"Inorder", "Postorder", "Preorder", "Natural"},        //24
            {"Inorder", "Postorder", "Preorder", "Natural"},        //25
            {"Inorder", "Postorder", "Preorder", "Natural"},        //26
            {"n", "n^2", "n/2", "log2(n)"},                         //27
            {"Balanced", "Alphabetical", "Random", "Skewed"},       //28
            {"Complete", "Full", "Perfect", "Degenerate"},          //29
            {"Complete", "Full", "Perfect", "Degenerate"},          //30
            {"Complete", "Full", "Perfect", "Degenerate"},          //31
            {"Complete", "Full", "Perfect", "Degenerate"},          //32
            {"n", "n/2", "(n+1)/2", "log2(n)"},                     //33
            {"Complete", "Full", "Perfect", "Degenerate"},          //34
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},       //35
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},       //36
            {"AVL", "B-Tree", "Red-Black", "BST"},                  //37


            //Search & Sort Algorithms Answers
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},       //5
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},
            {"Cannot have over 100 items", "Data must be sorted", "Data must be stored in a stack", "Cannot have over 1000 items"},
            {"Bubble sort", "Selection sort", "Insertion sort", "Quick sort"},
            {"Heap sort", "Selection sort", "Insertion sort", "Merge sort"},
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},
            {"Data found", "Data found index", "True or False if found", "No return"},
            {"-1", "False", "Error", "0"},
            {"Fastest sorts", "Use least memory", "Small data set", "You will use data repeatedly"},
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},
            {"Choosing a bad partition", "Most inefficient sort", "Lots of data shuffling", "Most complicated to write"},
            {"Pointer", "Linked list", "Temp variable", "Binary tree"},
            {"[1, 2, 8, 4, 3]", "[2, 8, 4, 1, 3]", "[1, 2, 3, 4, 8]", "[2, 4, 1, 3, 8]"},
            {"Number of operations made", "Time in seconds to sort data", "Address where data is in memory", "Difficulty to code"},
            {"Notation", "Time in seconds", "Input size", "Number of swaps made"},
            {"O(n), O(n^2), O(1), O(log(n))", "O(1), O(n^2), O(n), O(log(n))", "O(n), O(log(n), O(n^2), O(1))", "O(1), O(log(n)), O(n), O(n^2)"},

            //Pointers Answers
            {"Loops forever", "Needs a for loop", "Calls itself", "Should be avoided"},       //6
            {"Choice A", "Choice B", "Choice C", "Choice D"},       //7

            //Recursion Answers
            {"Loops forever", "Needs a for loop", "Calls itself", "Should be avoided"},       //8
            {"Base case", "Divide and conquer", "Last line of code", "Becomes negative"},       //9
            {"Void result", "Feeds back up", "Same as non-tail", "Returns directly"},
            {"Use for loop", "Approach base case", "Break statements", "Default case"},
            {"Recursion is slower", "Recursion uses more memory", "Both true", "Neither true"},
            {"Graph and tree traversal", "Multiplication", "Linked lists", "Embedded systems"},
            {"While loops", "For loops", "If-else statements", "Switch cases"},

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
            "4",            //0
            "void",         //1
            "==",           //2
            "255",          //3
            "divide by 0",  //4
            "2",            //5
            "arr[0]",       //6
            "string",       //7
            "for",          //8
            "false",        //9
            "for",          //10
            "false",        //11
            "pass by value",//12
            "whole and decimal",//13
            "cout << \"Hello World\";",//14
            "//",           //15
            "int x = 6",    //16
            "#include<iostream>",//17
            "functionName()",//18
            "break",        //19

            //Binary Tree Correct Answers
            "2",            //20
            "Root",         //21
            "Leaves",       //22
            "Left",         //23
            "Preorder",     //24
            "Inorder",      //25
            "Postorder",    //26
            "log2(n)",      //27
            "Balanced",     //28
            "Full",         //29
            "Perfect",      //30
            "Degenerate",   //31
            "Complete",     //32
            "(n+1)/2",      //33
            "Complete",     //34
            "O(n)",         //35
            "O(log2(n))",   //36
            "BST",          //37

            //Search & Sort Algorithms Correct Answers
            "O(n)",       //4
            "O(n log2(n))",
            "O(log2(n))", //5
            "Quick sort",
            "Bubble sort",
            "Data must be sorted",
            "Quick sort",
            "Selection sort",
            "Quick sort",
            "O(n)",
            "Data found index",
            "-1",
            "Small data set",
            "Insertion sort",
            "Lots of data shuffling",
            "Temp variable",
            "[2, 4, 1, 3, 8]",
            "Number of operations made",
            "O(1), O(log(n)), O(n), O(n^2)",

            //Pointers Correct Answers
            "Choice D",       //6
            "Choice C",       //7

            //Recursion Correct Answers
            "Calls itself",       //8
            "Base case",       //9
            "Returns directly",
            "Approach base case",
            "Both true",
            "Graph and tree traversal",
            "If-else statements",

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
