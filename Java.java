
#include <stdio.h>
#include <stdlib.h>

//MACRO
#define double(x)(x *2)

//Constants (Uppercase)
const float PI = 3.14;

/*Basic data types:

    Data Types	        Memory Size	           Range     
    char	              1 byte	        −128 to 127                
    unsigned char	      1 byte	         0 to 255

    short	              2 byte	     −32,768 to 32,767
    unsigned short	      2 byte	       0 to 65,535

    int	                  2 byte	     −32,768 to 32,767
    unsigned int	      2 byte	       0 to 65,535
    long int	          4 byte -2,147,483,648 to 2,147,483,647
    unsigned long int	  4 byte	    0 to 4,294,967,295

    float	              4 byte	
    double	              8 byte	
    long double	          10 byte	

    bool                  1 byte < - need stdbool.h
*/

/*Arrays:

    -int x[5];

    -int x[] = {1,2,3}

*/

/*Matrices:

    -int x[2][2];

    -int x[][] = {
		{1,2,3},
                  {4,5,6}
                 };

*/

/*Format specifiers:

     %c    	// char
     %s    	// character array
     %f    	// float
     %lf   	// double
     %d    	// int,unsigned short,short,(bool,char,unsigned char) < - as numbers
     %u    	// unsigned int
     %lld  	// long long int
     %llu  	// unsigned long long int

     %p    	// address

     %.1~  	// decimal precision
     %-~   	// left align
     %1~   	// min field width
*/

/*Logical operators:

    && 	// and
    || 	// or
    !~ 	// not

*/

/*Bitwise operators:

    &// and
    |  	// or
    ^  	// xor
    << 1	// left shift 1 posizione, se fatta su numero unsigned è num*(2^1)
    >> 1	// right shift 1 pos., come sopra ma num/(2^1)

*/

/*Control flow:

    1) Conditions:

        - if(){}

        - if(){}
          else{}

        - if(){}
          else if{}
          else{}

        - switch()
          {
            case 'A': 
            something;
            break;

            default:
            something;           

          }

        - ternary operator (condition)? do_this_if_true : do_this_if_false ;

    2) Loops:

        - for(int i=0;i < 5;i++){}

        - while(len < 10){len++;}

        - do{}while(i%2 == 0);

        break      	// exit the loop
        continue   	// skip to next iteration
*/

/*Structs:

    struct Square
    {
        int origin_x;
        int origin_y;
        int side;
    };

struct Square x;
x.side = 4;

*/

/*Unions:

    union number
    {
        short small;
        long big;
        double really_big;
    };

Can contain all of the declared values but only one at a time
*/

/*Enums:

 enum weekday {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};

To create a set of constants
*/

/*Typedef:

    - on a struct or union

        typedef struct 
        {
            int origin_x;
            int origin_y;
            int side;
        }Square;

        Square x;

    - in general -> typedef char s25[25];

        s25 x; a string of 25 chars
*/

// Pointers: int *pX = &x;
// To access members of struct with a pointer use x->member
// An array can be accessed also as a pointer

//Function prototype
// int double(int);

//Files
void foo()
{
	/*
	    w = write
	    a = append
	    r = read

	*/
	FILE *pF = fopen("a.txt", "w");

	// check if file exist
	if (pF == NULL)
	{
		printf("Can't open file.\n");
		return;
	}

	// write into file
	fprintf(pF, "cbtrb");

	char buf[20];

	// read from file
	fgets(buf, 20, pF);

	// close file
	fclose(pF);

	return;

}

//Dynamic memory allocation (need stdlib.h)
void foo2()
{
	// array of 20 ints
	int *ptr = (int*) malloc(20* sizeof(int));

	// array of 20 ints set to 0
	int *ptr2 = (int*) calloc(20, sizeof(int));

	// reallocate memory
	ptr = realloc(ptr, 27* sizeof(int));

	// free memory after use
	free(ptr);
	free(ptr2);

}

//Memory allocated dynamically can be accessed as an array

int main()
{
	char txt[5];

	scanf("%5s", &txt);
	printf("\n%s\n", txt);

	printf("%d\n", double(4));

	return 0;
}
