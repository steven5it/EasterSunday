package org.EasterSunday;

/*
File: EasterSunday.java

Description: prompt for a year to display the month and date Easter falls on for that year

Student Name: Steven Lee

Date Created: 2/7/12

Date Last Modified: 2/7/12

*/

import java.util.*;

public class EasterSunday
{
public static void main (String args[])
{
  //prompt user for year
  Scanner sc = new Scanner (System.in);
  System.out.print ("Enter Year: ");
  int y = sc.nextInt();
  
  //calculate date
  int a = y%19;
  int b = y/100;
  int c = y%100;
  int d = b/4;
  int e = b%4;
  int g = (8*b+13)/25;
  int h = (19*a+b-d-g+15)%30;
  int j = c/4;
  int k = c%4;
  int m = (a+11*h)/319;
  int r = (2*e+2*j-k-h+m+32)%7;
  int n = (h-m+r+90)/25;
  int p = (h-m+r+n+19)%32;
  
  //display month as String
  String month = (n == 3)? "March": "April";
  
  //output result
  System.out.print ("In " + y + ", Easter Sunday is on " + p + " " + month);

}
}