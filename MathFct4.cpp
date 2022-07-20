/*Harry Xiang
Mr. Wong
Nov. 16, 2021
Math Functions
*/

#include <stdio.h>
#include <math.h> // header files needed for Math functions
double num; //global variable
double exponent;

//Function Title
void title()
{
    printf("\n%30sMore Math Functions\n","");
}

//function spacing - creates a number of blank lines, and then a number of spaces based on calling arguements
void spacing(int numOfLines, int numOfSpaces)
{
    for(int x=0; x<numOfLines; x++)
    printf("\n");
    
    for(int x=0; x<numOfSpaces; x++)
        printf(" ");
}

//function intro
void intro()
{
    title();
    spacing(0,5);
}

//function userInput
void userInput()
{
    spacing(2,0);
    printf("Enter a real number:");
    scanf("%lf",&num);
    getchar(); //to get rid of the Enter character
    printf("Enter an exponent of the real number:");
    scanf("%lf",&exponent);
    getchar(); //to get rid of the Enter character
}

//function display
void display()
{
    double answer;
    spacing(1,30);
    answer = round(num);
    printf("round(%lg)\t= %lf\n",num,answer);
    spacing(0,30);
    printf("sqrt(%lg) \t= %lf\n",num,pow(num,0.5));
    spacing(0,30);
    printf("pow(%lg, %lg)\t= %lf\n",num,exponent,pow(num,exponent));
    spacing(0,30);
    printf("ceil(%lg) \t= %lf\n", num, ceil(num));  
}

//main program
main()
{
    intro();
    userInput();
    display();
    getchar();
}
