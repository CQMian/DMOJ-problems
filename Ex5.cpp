/*Harry Xiang
Mr. Wong
Nov. 16, 2021
This program implements the pause function
*/
#include <stdio.h>
#include <string.h>  // for string functions, e.g. gets()

//Declaration Section
char word[21]; //Assume maximum of 20 characters entered
int len, pos;
bool correctValue = false;

//pauseProgram
void pauseProgram()
{
    printf("\nPress Enter key to continue...");
    getchar();
}

//introduction
void intro()
{
    printf("This program implements the pause function\n");
}

//userInput
void userInput()
{
    printf("\nType any word with a length from 1 to 20:\n");
    gets(word);
    len = strlen(word); //find the length (number of characters of string word)
    if(len>=1&&len<=20){
        correctValue = true;
    }
    else{
        printf("Incorrect input, please try again!");
    }
}

void display()
{
    printf("length of the input is %d\n", len);
    if(len<5){
        printf("%s is less than 5 characters long.\n", word);
    }
    else if(len%2!=0){
        printf("%s has an odd number of letters.\n",word);
        pos = len/2+1; 
        printf("The middle letter is at the position %d\n", pos);
    }
    else{
        printf("%s has an even number of letters.\n",word);
    }
    
}

//main method
int main(){
    intro();
    userInput();
    while(!correctValue){
        pauseProgram();
        userInput();
    }
    display();
    getchar();
}
