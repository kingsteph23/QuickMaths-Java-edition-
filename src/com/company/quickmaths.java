package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class quickmaths {
    public static void main(String[] args) {
// controls and scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("    *---------------------------------------------------------------------*   " +
                "\n                    CONTROLS/INSTRUCTIONS" +
                "\n   *This is a typing game so use your keyboards(whether on phone or laptop*" +
                "\n   *When answering questions, only chose whats inside (), so choose either a,b,c, or d*" +
                "\n  *With the exception of your name, type the answer of your choice in lower case*" +
                "\n    *-------------------------------------------------------------------*");
        System.out.println();
        //Asking user if they want to start game
        System.out.println("Hello and welcome to my game. Do you wish to begin(yes/no):");
        String nochoice = scan.nextLine();
        //still starting regardless of user choice
        if (nochoice.equals("yes".toLowerCase()) || nochoice.equals("no".toLowerCase())) {
            System.out.println("We still starting regardless\uD83D\uDE08\uD83D\uDE08\uD83D\uDC7A" +
                    "\nYour math skills needs improvement. Lets do some practice");
            System.out.println();
        }
        // displaying name info
        System.out.println("Whats yo name?:");
        String nom = scan.nextLine();
        System.out.println();
        //game info
        System.out.println("Welcome " + nom + " to QUICK MATHS(Java Edition). We are going to practice decimals through addition,subtraction,multiplication, and division." +
                "\nThere will be three levels. You start for easy, and eventually go to hard questions." +
                "\n5 questions per level" +
                "\nAnswer to the  of your best ability." +
                "\nAnd if you really wanna improve your skills, i suggest you practice of paper, and not just rush" +
                "\nto the calculator. This is simple, so good luck!!! ");
        scan.nextLine();
        System.out.println();
        // Questions

        //q1 5*2.5
        String[] q1 = {"Question 1:" +
                "\nWhat is 5*2.5" +
                "\n5.4" +
                "\n2.5" +
                "\n12.5" +
                "\n:"};
        //q2  0.3*7
        String[] q2 = {"Question 2:" +
                "\nOnto the next question. What is 0.3*7" +
                "\n2.1" +
                "\n4.1" +
                "\n21.1" +
                "\n:"};
        //q3  1.5*4?
        String[] q3 = {"Question 3:" +
                "Next question.  What is 1.5*4? " +
                "\n6" +
                "\n9" +
                "\n420)" +
                "\n:"};
        //q4  1.5*4?
        String[] q4 = {"Question 4:" +
                "\nWhat is  3.14/1??" +
                "\n3.14" +
                "\n2.14" +
                "\n1" +
                "\n:"};
        //q5 7,285/10
        String[] q5 = {"Question 5:" +
                "\nWhat is 7,285/10?" +
                "\n72.9" +
                "\n728.5" +
                "\n72.69" +
                "\n:"};
        //q6 87.2*5.0
        String[] q6 = {"Question 6:" +
                "\nWhat is 87.2*5.0" +
                "\n436.0" +
                "\n435.0" +
                "\n429.0" +
                "\n:"};
        //q7 69.420*4
        String[] q7 = {"Question 7:" +
                "What is 69.420*4?" +
                "\n278.98" +
                "\n277.68" +
                "\n276.38 :"};
        //q8 4.76*1.56
        String[] q8 = {"Question 8:" +
                "What is 4.76*1.56" +
                "\n7.4259" +
                "\n4.7246" +
                "\n7.4256" +
                "\n:"};
        //q9 4.24*6.2
        String[] q9 = {"Question 9:" +
                "\nNext question..What is 4.24*6.2" +
                "\n 28.688" +
                "\n26.288" +
                "\n25.788" +
                "\n:"};
        //q10 1.82/1.3
        String[] q10 = {"Question 10:" +
                "What is 1.82/1.3" +
                "\n1.5" +
                "\n2.4" +
                "\n1.4" +
                "\n:"};
        //q11  638.92/90(Simplified)
        String[] q11 = {"Question 11:" +
                "What is 638.92/90(Simplified)." +
                "\n7.0991" +
                "\n8.0991" +
                "\n7.10991" +
                "\n: "};
        //q12 2306.2/51(Round to the nearest hundredths place)
        String[] q12 = {"Question 12:" +
                "Next question.... What is 2306.2/51(Round to nearest hundredths place)" +
                "\n46.52" +
                "\n45.22" +
                "\n44.32" +
                "\n:"};
        //q13 33/0.4?
        String[] q13 = {"Question 13:" +
                "\nWhat is 33/0.4?" +
                "\n74.5" +
                "\n82.5" +
                "\n86.5" +
                "\n:"};
        //q14 0.5*0.7
        String[] q14 = {"Question 14:" +
                "\nWhat is 0.5*0.7" +
                "\n0.35" +
                "\n0.42" +
                "\n0.49" +
                "\n:?"};
        //q15 0.8*0.5?
        String[] q15 = {"Question 15:" +
                "Last question, what is 0.8*0.5?" +
                "\n0.48" +
                "\n0.32" +
                "\n0.4" +
                "\n:"};
        //q16 87.0-55.6?
        String[] q16 = {"Question 16:" +
                "\nWhat is 87.0-55.6?" +
                "\n32.4" +
                "\n31.4" +
                "\n40.4" +
                "\n:"};
        //q17 96.243+4.733?
        String[] q17 = {"What is 96.243+4.733?" +
                "\n105.976" +
                "\n100.976" +
                "\n110.976" +
                "\n:"};
        //q18  7.3-0.05?
        String[] q18 = {"What is 7.3-0.05?" +
                "\n7.35" +
                "\n7.15" +
                "\n7.25" +
                "\n:"};
        //q19 23.2+7.04?
        String[] q19 = {"Question 19:" +
                "\nWhat is 23.2+7.04?" +
                "\n30.24" +
                "\n35.24" +
                "\n28.54" +
                "\n:"};
        //q20 20.41-11.51
        String[] q20 = {"Last question B, you got this. What is 20.41-11.51" +
                "\n8.5" +
                "\n8.9" +
                "\n9.8 " +
                "\n:"};

        // array consists of questions from this.question & answers from this.answers
        // regular questions from 1-20
        question[] NotreQuestion = {
                new question(q1, "12.5"),
                new question(q2, "2.1"),
                new question(q3, "6"),
                new question(q4, "3.14"),
                new question(q5, "728.5"),
                new question(q6, "436.0"),
                new question(q7, "277.68"),
                new question(q8, "7.4256"),
                new question(q9, "26.288"),
                new question(q10, "1.4"),
                new question(q11, "7.0991"),
                new question(q12, "45.22"),
                new question(q13, "82.5"),
                new question(q14, "0.35"),
                new question(q15, "0.4"),
                new question(q16, "31.4"),
                new question(q17, "100.976"),
                new question(q18, "7.25"),
                new question(q19, "28.54"),
                new question(q20, "8.9")};
        quickmathsoffical(NotreQuestion);
    }

        //public quickmathsoffical runs questions. Displays questions via forloop(increases by 1)
        public static void quickmathsoffical(question[] NotreQuestion){
            Scanner scan = new Scanner(System.in);
            // score starts at 0(if user gets score right, their score will increment by 1
            int score = 0;
            for(int i = 0;i<NotreQuestion.length;i++){
                // loops through questions(1-20)
                System.out.println(Arrays.toString(NotreQuestion[i].questions));
               String correctanswer = scan.nextLine();
               System.out.println();
// Checking to see if user input is correct or in correct
               if(correctanswer.equals(NotreQuestion[i].answers)){
                   System.out.println("That is indeed.....CORRECTTT");
                   score++;
               }else{
                   System.out.println("That is indeed.....WRONG");
               }

            }
            //  calculating score and rewarding user if they got over 80
            System.out.println("Total score: " + score + "/20 questions CORRECT");
            System.out.println();

       int overall = score;
       // if score is greater than or = to 80, user gets choccy milk and cookies
       if(overall >= 16){
           System.out.println("You got over a 80%.......Here's some choocy milk;\uD83E\uDD5B\uD83C\uDF6A ");
           System.out.println();

           // if score is  NOT greater than or = to 80, user gets choccy milk and cookies
       }else if(!((overall >= 16))){
           System.out.println("You got under a 80%.......No choccy milk for you\uD83D\uDE10\uD83D\uDE36");
            System.out.println();

            }
       // end message
            System.out.println("Thank you for playing my game. Whether, you got the grade you wanted or not" +
                    "\nRemember, practice makes perfect!!" +
                    "\nKeep on practicing, and don't lose hope!!");
        }

    }

