/*Hary Xiang
Dec 16, 2021
Mr. Wong
This program prints the word so that it is centered horizontally and vertically
on the online C++ compiler
*/
#include <stdio.h> 
#include <string.h>

char word [] = "HELLO"; // [] lets computer to determine 
 // the size of array for you! 
// Using For Loops and Strings 
void display() 
{ 
printf("\n\n\n\n");
 for(int i = 0; i<strlen(word); i++){
 printf("\t\t\t\t\t\t\t    %c\n", word[i]); 
 }
} 
// Main program 
int main() 
{ 
 display(); 
 getchar(); 
} 
