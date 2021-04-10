package com.example.teacherspet.student_view.skills_check;

public class QuestionBank {

    /************************************************
     * TODO: Add more questions to bank
     * Update index comments are more are added
     * TODO: Randomize question selection
     * (right now they load in order every time)
     * TODO: Randomize choice locations
     * (right now they load in order every time)
     ************************************************/

    /*************************************************
     * Add questions to the question bank here :)
     * SEPARATE ORDER BY SUBJECT!
     * Use comments to delineate subject indices.
     * We can pass in random "a" to select from
     * specific index ranges for each subject.
     ************************************************/

    /**************************************************************
     * Each subject is separated and labeled with a comment at top
     * In-line comments at the end show the index of each question
     * Indices of each corresponding question, answer choices, and
     * correct answer should match
     ****************************************************************/

    private String Questions [] = {

            /**************************************************************
            * Since questions are stored in a string array, put each
            * question in quotation marks and separate with commas
            ***************************************************************/

            //1044 Review Questions
            "What is the last index of an array with 5 items?",             //0
            "What should the return type be of a print function?",          //1
            "How do you check equality between two variables?",             //2
            "What is the largest value you can hold in a byte?",            //3
            "What could cause a run time error?",                           //4
            "What is 14 % 3?",                                              //5
            "How do you access the first element in an array?",             //6
            "What data type should you use to hold a name?",                //7
            "What should you use to repeat code 10 times?",                 //8
            "What is A && !A for any boolean A?",                           //9
            "What should you use to traverse an array?",                    //10
            "What is T ^ T?",                                               //11
            "How do you pass an argument to not change the original?",      //12
            "What does a floating point data type contain?",                //13
            "How do you print \"Hello World!\" in C++?",                    //14
            "How do you make single line comments in C++?",                 //15
            "How do you create a variable to hold a 6?",                    //16
            "Which header file lets us work with input and output objects?",//17
            "How do you create a function in C++?",                         //18
            "What statement is used to stop a loop?",                       //19

            //Binary Tree Questions
            "How many children can a binary tree node have?",               //20
            "What is the first node in a binary tree called?",              //21
            "What are the final nodes in a binary tree called?",            //22
            "Smaller values are inserted to the _______ in a BST.",         //23
            "Root -> Left -> Right is what kind of traversal?",             //24
            "Left -> Root -> Right is what kind of traversal?",             //25
            "Left -> Right -> Root is what kind of traversal?",             //26
            "For n nodes, what is the max height of a binary tree?",        //27
            "To be useful, binary trees should be _________.",              //28
            "A binary tree where every node has 0 or 2 children.",          //29
            "Every node has 2 children and all leaves on same level.",      //30
            "A binary tree where every node has 1 child.",                  //31
            "All levels are full except last; leaves are left leaning",     //32
            "Total number of leaves in a full binary tree with n nodes",    //33
            "What kind of binary tree is used to implement heaps?",         //34
            "What is the worst case complexity of Binary Search Tree?",     //35
            "What is the best case complexity of Binary Search Tree?",      //36
            "Which of the following is not a self-balancing tree?",         //37

            //Search & Sort Algorithms Questions
            "What is O(n) of linear search?",                               //38
            "What is O(n) of merge sort?",                                  //39
            "What is O(n) of binary search?",                               //40
            "Which of these sort algorithms is not stable?",                //41
            "Which sort moves the largest item to the far right each pass?",//42
            "What must be true for binary search to work?",                 //43
            "Which of these sorts does not have O(n^2) time complexity?",   //44
            "Which of these sorts makes the least amount of swaps?",        //45
            "Which of these sorts partitions data around a pivot?",         //46
            "What is the best time complexity of bubble sort?",             //47
            "Search algorithms typically return the:",                      //48
            "What does a search typically return if the value was not found?",//49
            "Why might you use an O(n^2) sort?",                            //50
            "Which algorithm can sort data dynamically as it comes in?",    //51
            "What is a disadvantage of insertion sort?",                    //52
            "What is needed to perform a data swap?",                       //53
            "[2, 8, 4, 1, 3] What is result after Bubble sort first pass?", //54
            "What does Big O tell us about an algorithm?",                  //55
            "What does the n in Big O notation represent?",                 //56
            "Order these complexities from least to greatest:",             //57

            //Pointers Questions
            "Why do we use pointers in C++?",                               //58
            "How do you get the value stored in a pointer?",                //59
            "\"int * number;\" means: ",                                    //60
            "What is not a correct way to create a pointer?",               //61
            "&name would return:",                                          //62
            "\"int **num;\" would mean:",                                   //63
            "Pointers operate the same as what data structure?",            //64
            "Which is equivalent to a[5]?",                                 //65
            "What does \"int * a, b, c;\" create?",                         //66
            "What happens if you dereference a pointer without a valid target?",//67
            "What is the only integer literal you can assign a pointer?",   //68
            "You can assign one pointer to another only if:",               //69
            "\"const int * num;\" is a:",                                   //70
            "\"int const * num;\" is a:",                                   //71
            "\"int * const num;\" is a:",                                   //72

            //Recursion Questions
            "A recursive function:",                                        //73
            "What terminates recursion?",                                   //74
            "Tail recursion:",                                              //75
            "How do you avoid infinite recursion?",                         //76
            "Which is true about recursion compared to iteration?",         //77
            "What is a common application of recursion?",                   //78
            "Common programming tool used in recursive functions:",         //79
            "Which data structure is used to perform recursion?",           //80

            //Linked Lists Questions
            "What is an advantage of linked lists over arrays?",            //81
            "What is an advantage of arrays over linked lists?",            //82
            "Which sort algorithm is impossible to sort a random linked list?",//83
            "Which of these is not a type of linked list?",                 //84
            "How are the elements in a list linked?",                       //85
            "Can you create a doubly linked list using only one pointer with every node?",//86
            "What data structure does a circular linked list implement?",   //87
            "Which is not a disadvantage of linked lists?",                 //88
            "How can a linked list be implemented?",                        //89

            //Stacks/Queues Questions
            "Inserts into a stack:",                                       //90
            "Removes from a stack:",                                       //91
            "If you try to remove from empty stack:",                      //92
            "If you try to push to full stack:",                           //93
    };

    /*************************************************
     * Add all 4 possible answer choices here :)
     * VERY IMPORTANT!
     * The index of the answer choices has to match
     * the index of the corresponding question!
     ************************************************/

    private String Answers [][] = {

            /**********************************************************************
             * Since answer choices are stored in a two-dimensional string array,
             * put each group of 4 answer choices in curly braces to show the row,
             * put each answer choice in quotation marks, and separate with commas
             **********************************************************************/

            //1044 Review Answers
            {"0", "4", "5", "6"},                                                               //0
            {"int", "String", "cout", "void"},                                                  //1
            {"==", "equals", "=", "check name"},                                                //2
            {"8", "1", "255", "127"},                                                           //3
            {"forget semicolon", "forget curly brace", "divide by 0", "use wrong name"},        //4
            {"2", "3", "4", "0"},                                                               //5
            {"arr[1]", "arr.first", "arr[0]", "arr.1"},                                         //6
            {"variable", "int", "char", "string"},                                              //7
            {"for", "while", "if", "switch"},                                                   //8
            {"true", "A", "false", "!A"},                                                       //9
            {"while", "arr.next", "for", "pointers"},                                           //10
            {"true", "false", "input", "not enough info"},                                      //11
            {"pass by value", "pass by reference", "pointer", "alias"},                         //12
            {"whole part only", "decimal part only", "whole and decimal", "negatives only"},    //13
            {"print(\"Hello World\");", "Console.WriteLine(\"Hello World\");", "cout << \"Hello World\";", "System.out.print(\"Hello World\");"},
            {"//", "/* */", "#", "!"},                                                          //15
            {"int x = 6", "num x = 6", "double x = 6", "int x == 6"},                           //16
            {"#include<iostring>", "#include<stream>", "#include<inputstr>", "#include<iostream>"},//17
            {"functionName()", "functionName.", "functionName = ", "functionName[]"},           //18
            {"exit", "stop", "break", "return"},                                                //19

            //Binary Tree Answers
            {"2", "1", "0", "Any #"},                                                           //20
            {"First", "Root", "Leaf", "Child"},                                                 //21
            {"Parents", "Roots", "Right", "Leaves"},                                            //22
            {"Front", "Right", "Left", "Back"},                                                 //23
            {"Inorder", "Postorder", "Preorder", "Natural"},                                    //24
            {"Inorder", "Postorder", "Preorder", "Natural"},                                    //25
            {"Inorder", "Postorder", "Preorder", "Natural"},                                    //26
            {"n", "n^2", "n/2", "log2(n)"},                                                     //27
            {"Balanced", "Alphabetical", "Random", "Skewed"},                                   //28
            {"Complete", "Full", "Perfect", "Degenerate"},                                      //29
            {"Complete", "Full", "Perfect", "Degenerate"},                                      //30
            {"Complete", "Full", "Perfect", "Degenerate"},                                      //31
            {"Complete", "Full", "Perfect", "Degenerate"},                                      //32
            {"n", "n/2", "(n+1)/2", "log2(n)"},                                                 //33
            {"Complete", "Full", "Perfect", "Degenerate"},                                      //34
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},                                   //35
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},                                   //36
            {"AVL", "B-Tree", "Red-Black", "BST"},                                              //37

            //Search & Sort Algorithms Answers
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},                                   //38
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},                                   //39
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},                                   //40
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},                      //41
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},                      //42
            {"Cannot have over 100 items", "Data must be sorted", "Data must be stored in a stack", "Cannot have over 1000 items"},//43
            {"Bubble sort", "Selection sort", "Insertion sort", "Quick sort"},                  //44
            {"Heap sort", "Selection sort", "Insertion sort", "Merge sort"},                    //45
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},                      //46
            {"O(log2(n))", "O(n^2)", "O(n)", "O(n log2(n))"},                                   //47
            {"Data found", "Data found index", "True or False if found", "No return"},          //48
            {"-1", "False", "Error", "0"},                                                      //49
            {"Fastest sorts", "Use least memory", "Small data set", "You will use data repeatedly"},//50
            {"Insertion sort", "Merge sort", "Quick sort", "Bubble sort"},                      //51
            {"Choosing a bad partition", "Most inefficient sort", "Lots of data shuffling", "Most complicated to write"},//52
            {"Pointer", "Linked list", "Temp variable", "Binary tree"},                         //53
            {"[1, 2, 8, 4, 3]", "[2, 8, 4, 1, 3]", "[1, 2, 3, 4, 8]", "[2, 4, 1, 3, 8]"},       //54
            {"Number of operations made", "Time in seconds to sort data", "Address where data is in memory", "Difficulty to code"},//55
            {"Notation", "Time in seconds", "Input size", "Number of swaps made"},              //56
            {"O(n), O(n^2), O(1), O(log(n))", "O(1), O(n^2), O(n), O(log(n))", "O(n), O(log(n), O(n^2), O(1))", "O(1), O(log(n)), O(n), O(n^2)"},//57

            //Pointers Answers
            {"Allows functions to share variables", "To pass large structures", "To implement linked lists/binary trees", "All of the above"},         //58
            {"Dereference Operator- *", "Dereference Operator- &", "Address Operator- *", "Address Operator- &"},//59
            {"number holds an int", "number points to an int", "int is a pointer", "int is a number"},//60
            {"int *num", "int* num", "int*num", "int num*"},                                    //61
            {"The value in name", "Boolean AND with name", "The address of name", "If name is a pointer"}, //62
            {"num is a pointer to a pointer", "num is a pointer to an int", "int points to num", "This would error"}, //63
            {"Priority Queue", "Heap", "Array", "Stack"},                                       //64
            {"a* 5", "a* + 5", "*(a+5)", "a(* 5)"},                                             //65
            {"3 int pointers", "3 ints", "1 int pointer, 2 ints", "This would error"},          //66
            {"Segmentation fault", "Program will crash", "Tries to access out of bounds memory", "All of the above"},//67
            {"You can't assign any integers", "You can assign any integer you want", "0", "Only positive integers"},//68
            {"They are the same data type", "They are in the same function", "They are both null", "Anytime"},//69
            {"Non constant pointer to constant int", "Constant pointer to constant int", "Constant pointer to non constant int", "All of the above"},//70
            {"Non constant pointer to constant int", "Constant pointer to constant int", "Constant pointer to non constant int", "All of the above"},//71
            {"Non constant pointer to constant int", "Constant pointer to constant int", "Constant pointer to non constant int", "All of the above"},//72

            //Recursion Answers
            {"Loops forever", "Needs a for loop", "Calls itself", "Should be avoided"},         //60
            {"Base case", "Divide and conquer", "Last line of code", "Becomes negative"},       //61
            {"Void result", "Feeds back up", "Same as non-tail", "Returns directly"},           //62
            {"Use for loop", "Approach base case", "Break statements", "Default case"},         //63
            {"Recursion is slower", "Recursion uses more memory", "Both true", "Neither true"}, //64
            {"Graph and tree traversal", "Multiplication", "Linked lists", "Embedded systems"}, //65
            {"While loops", "For loops", "If-else statements", "Switch cases"},                 //66
            {"Queue", "Stack", "Linked List", "Tree"},                                          //67

            //Linked Lists Answers
            {"It is faster to access elements in arrays", "Linked lists can change size", "It is faster to access elements in linked lists", "Arrays can change size"},  //67
            {"It is faster to access elements in arrays", "Linked lists can change size", "It is faster to access elements in linked lists", "Arrays can change size"},  //68
            {"Insertion Sort", "Quick Sort", "Heap Sort", "Merge Sort"},                        //69
            {"Priority", "Singly", "Doubly", "Circular"},                                       //70
            {"Contiguous memory", "Boolean operations", "Offsets", "Pointers"},                 //71
            {"Not possible", "Yes, XOR current and next nodes", "Yes, XOR current and previous nodes", "Yes, XOR previous and next nodes"},//72
            {"Stack", "Queue", "Array", "Struct"},                                              //73
            {"Random access is not allowed", "Extra memory needed for pointer", "Not cache friendly", "Fixed size"},//74
            {"Class", "Struct", "Both of these", "Neither of these"},                           //75

            //Stacks/Queues Answers
            {"Create", "Push", "Evaluation", "Pop"},                                   //69
            {"Create", "Push", "Evaluation", "Pop"},
            {"Underflow", "Empty Creation", "Overflow", "Garbage Collection"},         //70
            {"Overflow", "Crash", "Underflow", "User flow"}
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

            /**************************************************************
             * Since correct answers are stored in a string array, put each
             * correct answer in quotation marks and separate with commas
             ***************************************************************/

            //1044 Review Correct Answers
            "4",                                        //0
            "void",                                     //1
            "==",                                       //2
            "255",                                      //3
            "divide by 0",                              //4
            "2",                                        //5
            "arr[0]",                                   //6
            "string",                                   //7
            "for",                                      //8
            "false",                                    //9
            "for",                                      //10
            "false",                                    //11
            "pass by value",                            //12
            "whole and decimal",                        //13
            "cout << \"Hello World\";",                 //14
            "//",                                       //15
            "int x = 6",                                //16
            "#include<iostream>",                       //17
            "functionName()",                           //18
            "break",                                    //19

            //Binary Tree Correct Answers
            "2",                                        //20
            "Root",                                     //21
            "Leaves",                                   //22
            "Left",                                     //23
            "Preorder",                                 //24
            "Inorder",                                  //25
            "Postorder",                                //26
            "log2(n)",                                  //27
            "Balanced",                                 //28
            "Full",                                     //29
            "Perfect",                                  //30
            "Degenerate",                               //31
            "Complete",                                 //32
            "(n+1)/2",                                  //33
            "Complete",                                 //34
            "O(n)",                                     //35
            "O(log2(n))",                               //36
            "BST",                                      //37

            //Search & Sort Algorithms Correct Answers
            "O(n)",                                     //38
            "O(n log2(n))",                             //39
            "O(log2(n))",                               //40
            "Quick sort",                               //41
            "Bubble sort",                              //42
            "Data must be sorted",                      //43
            "Quick sort",                               //44
            "Selection sort",                           //45
            "Quick sort",                               //46
            "O(n)",                                     //47
            "Data found index",                         //48
            "-1",                                       //49
            "Small data set",                           //50
            "Insertion sort",                           //51
            "Lots of data shuffling",                   //52
            "Temp variable",                            //53
            "[2, 4, 1, 3, 8]",                          //54
            "Number of operations made",                //55
            "Input size",                               //56
            "O(1), O(log(n)), O(n), O(n^2)",            //57

            //Pointers Correct Answers
            "All of the above",                         //58
            "Dereference Operator- *",                  //59
            "number points to an int",                  //60
            "int num*",                                 //61
            "The address of name",                      //62
            "num is a pointer to a pointer",            //63
            "Array",                                    //64
            "*(a+5)",                                   //65
            "1 int pointer, 2 ints",                    //66
            "All of the above",                         //67
            "0",                                        //68
            "They are the same data type",              //69
            "Non constant pointer to constant int",     //70
            "Non constant pointer to constant int",     //71
            "Constant pointer to non constant int",     //72

            //Recursion Correct Answers
            "Calls itself",                             //60
            "Base case",                                //61
            "Returns directly",                         //62
            "Approach base case",                       //63
            "Both true",                                //64
            "Graph and tree traversal",                 //65
            "If-else statements",                       //66
            "stack",                                    //67

            //Linked Lists Correct Answers
            "Linked lists can change size",             //67
            "It is faster to access elements in arrays",//68
            "Heap Sort",                                //69
            "Priority",                                 //70
            "Pointers",                                 //71
            "Yes, XOR previous and next nodes",         //72
            "Queue",                                    //73
            "Fixed size",                               //74
            "Both of these",                            //75

            //Stacks/Queues Correct Answers
            "Push",                                 //69
            "Pop",                                  //70
            "Underflow",                            //71
            "Overflow"
    };

    /**************************************************
     * Accessor methods
     * These are used to get questions, answer choices,
     * and correct answers into each skills check
     * activity page (load them into template)
     *************************************************/

    //Method to return question from question array at given index
    public String getQuestion(int a){
            String question = Questions[a];
            return question;
    }

    //Four methods to return four answer choices from answer choice array
    //at row of given index. Will return answer choices in order
    //(Choice 1 is index 0, choice 2 is index 2, etc.)
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

    //Method to return correct answer from correct answer array at given index
    public String getCorrectAnswer(int a){
        String answer = CorrectAnswers[a];
        return answer;
    }

    //Method to set question in array at given index
    public void setQuestion(int a, String question){
        Questions[a] = question;
    }

    //Method to set answer choices in array at given index
    public void setChoice1(int a, String choice){
        Answers[a][0] = choice;
    }

    //Method to set answer choices in array at given index
    public void setChoice2(int a, String choice){
        Answers[a][1] = choice;
    }

    //Method to set answer choices in array at given index
    public void setChoice3(int a, String choice){
        Answers[a][2] = choice;
    }

    //Method to set answer choices in array at given index
    public void setChoice4(int a, String choice){
        Answers[a][3] = choice;
    }
}
