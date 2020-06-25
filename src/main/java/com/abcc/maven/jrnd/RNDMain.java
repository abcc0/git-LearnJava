package com.abcc.maven.jrnd;

import java.lang.annotation.Repeatable;

//import com.abcc.maven.jrnd.JavaRandD;

public class RNDMain {

	public static void main(String[] args) {
		
		//Testing Relational Operators
		int Zero = 0, One = 1, Twoo = 2, Three = 3;
		boolean bResult1 = One > Zero && Twoo < Three;
		System.out.println("\nOne is greater than Two: " + bResult1);
		
		//Testing Logical Operator
		boolean bTrue = true;
		boolean bFalse = false;
		System.out.println("\nCheck if both the boolean variables are true : " + (bTrue && bFalse));
		System.out.println("Check if even one of the boolean varibale is true : " + (bTrue || bFalse));
		System.out.println("Change the state of the bTrue to false : " + (!bTrue));

		//Testing Conditional Operator
		boolean bResult2; 
		int Ten = 10, Two = 2;
		bResult2 = (Ten > Two)? true : false;
		
		System.out.println("\nConditional Operator Test result is: " + bResult2);
		
		//Testing if then else statement
		int val1 = 10000, val2 = 5000;
		String sText = "Continue";	
		boolean bCheck = (val1 > val2)? true: false;
		
		if (bCheck && sText.equalsIgnoreCase("true")) {
			
			System.out.println("Lenght of sText is: " + sText.length());
			System.out.println("\nThis is TRUE!");
			
		} else if (sText.equals("Continue")) {

			System.out.println("\nThis is FALSE!");
			
			}
		
		//Testing switch...case...default
		int iNumber = 10000000;
		String sWord;
		
		switch (iNumber) {
		
		case 100:
			sWord = "One Hundred";
			break;
		case 1000:
			sWord = "One Thousand";
			break;
		case 10000:
			sWord = "Ten Thousands";
			break;
		case 100000:
			sWord = "One Lakh";
			break;
		case 1000000:
			sWord = "Ten Lakhs";
			break;
		case 10000000:
			sWord = "One Crore";
			break;
		default:
			sWord = "You have selected a wrong number!";
			break;
		}
		
		System.out.println("\nSelected value is " +"'" + sWord + "'.");
		
		//Testing arrays
		//Array style 1
		String[] aMonth = new String[13];
		aMonth[0] = "None";
		aMonth[1] = "January";
		aMonth[2] = "February";
		aMonth[3] = "March";
		aMonth[4] = "April";
		aMonth[5] = "May";
		aMonth[6] = "June";
		aMonth[7] = "July";
		aMonth[8] = "August";
		aMonth[9] = "September";
		aMonth[10] = "October";
		aMonth[11] = "November";
		aMonth[12] = "December";
		
		System.out.println("\nMonths are: ");
		for (int i=1; i< 13; i++) {
			System.out.println(i +". "+ aMonth[i]);
		}
		
		//Array style 2
		String[] aDay = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		System.out.println("\nWeek Days are: ");
		for (int i=0; i< 7; i++) {
			System.out.println(i+1 +". "+ aDay[i]);
		}
		
		//Integer array
		int[] iDay = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		String sList="";
		System.out.println("\nNumber of Days:");
		for (int i=0; i< 31; i++) {
			sList = sList + iDay[i] + ", "  ;
		}
		System.out.println(sList);
		
		//Testing while loop
		int iCount=0;
		
		System.out.println("_".repeat(100));
		System.out.println("\nCounting starts here...");
		System.out.println("-".repeat(100));
		while (iCount < 15) {
			++iCount;
			System.out.println("Count-"+iCount);
			if (iCount == 10){
				iCount++;
				System.out.println("Skipping Count-"+iCount);
			}
		}
		
		//Testing do{...}while (expression) loop
		int Count = 0;
		 // This will print -- 5,10,15,20,25
		 do{
		 Count = Count + 5;
		 System.out.println("Count is ==> "+ Count);
		 }while(Count < 25);
		 
		 int CountOnce = 25;
		 System.out.println("<==== Next Count ====>");
		 // This will just print once 
		 do{
		 CountOnce = CountOnce + 5; 
		 System.out.println("Count is ==> "+ CountOnce);
		 }while(CountOnce < 25);
		 
		//Add here
		}
	}
