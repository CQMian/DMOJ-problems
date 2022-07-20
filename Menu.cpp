/*Harry Xiang
Dec. 3, 2021
Mr. Wong
This program tests the users math abilties
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>  // for string functions, e.g. gets()

//Declaration Section
int choice, ans, guess;

//pauseProgram
void pauseProgram()
{
    printf("\nPress Enter key to continue...");
    getchar();
}

//Function Title
void title(char * programTitle)
{
    int len = strlen(programTitle);
    system("cls"); //"clear" is used for the online compiler
    printf("\n");
    for(int i = 1; i < 40 - len/2; i++){
        printf(" ");
    }
    printf("%s\n\n", programTitle);
}

//introduction
void intro()
{
    title("Calculation Game");
    printf("This program will test your math abilities.\n");
}

//Main Menu
void mainMenu(){
    title("Calculation Game");
    printf("1. Play Game\n");
    printf("2. Exit\n");
    printf("\nEnter 1 or 2:");
    scanf("%d",&choice);
    getchar();
    while(choice!=1&&choice!=2){
        printf("Sorry, you must enter either 1 or 2! Please try again.\n");
        printf("Enter 1 or 2:");
        scanf("%d",&choice);
        getchar();
    }
    
}
//userInput
void userInput()
{
    int num1, num2;
    title("Calculation Game");
    printf("\nPlease enter positive numbers only!");
    printf("\nEnter a number\n");
    scanf("%d",&num1);
    getchar();
    while(num1<1){
        printf("Sorry, you must enter a positive value! Please try again.\n");
        printf("Enter a number\n");
        scanf("%d", &num1);
        getchar();
    }
    printf("Enter another number\n");
    scanf("%d",&num2);
    getchar();
    while(num2<1){
        printf("Sorry, you must enter a postive value! Please try again.\n");
        printf("Enter another number\n");
        scanf("%d", &num2);
        getchar();
    }
    ans = num1+num2;
    printf("What is %d + %d?\n",num1,num2);
    scanf("%d",&guess);
    getchar();
}

//Display
void display()
{
    title("Calculation Game");
    if(guess==ans)
        printf("Wow! You got the right answer!\n");
    else
        printf("Hmmm...maybe we should review this math concept again!\n");
}

//goodbye method
void goodbye(){
    title("Calculation Game");
    printf("This program is written by: Harry Xiang\n");
    printf("\nFor further information call: 1-800-123-4567");
}

//main method
int main(){
    intro();
    pauseProgram();
    while(1){
        mainMenu();
        if(choice==2)
            break;
        userInput();
        display();
        pauseProgram();
    }
    goodbye();
}

