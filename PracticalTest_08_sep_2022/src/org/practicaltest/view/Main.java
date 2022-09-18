package org.practicaltest.view;

import org.practical.model.QuestionAnswer;


public class Main {
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionAnswer[] questionAnswerArray = new QuestionAnswer[10];
		QuestionAnswer questionAnswer1= new QuestionAnswer("what is the capital of India?","mumbai","delhi","banglore","chennai","delhi");
		QuestionAnswer questionAnswer2= new QuestionAnswer("what is the financial capital of India?","delhi","banglore","mumbai","chennai","mumbai");
		QuestionAnswer questionAnswer3= new QuestionAnswer("what is the capital of maharashtra","nagpur","mumbai","pune","nashik","mumbai");
		
		questionAnswerArray[0]=questionAnswer1;
		questionAnswerArray[1]= questionAnswer2;
		questionAnswerArray[2]=questionAnswer3;
		displayQuestion(questionAnswerArray);
		}
		
		
		public static void displayQuestion(QuestionAnswer[] questionAnswerArray) {
		for (int i=0;i<questionAnswerArray.length;i++) {
			if(questionAnswerArray[i]==null) {
				break;
			}
			else {
				System.out.println("que"+(i+1)+":"+questionAnswerArray[i].getQuestion1());
				System.out.println(questionAnswerArray[i].getOption1());
				System.out.println(questionAnswerArray[i].getOption2());
				System.out.println(questionAnswerArray[i].getOption3());
				System.out.println(questionAnswerArray[i].getOption4());
				
				
			}
		}
		
	}
}
