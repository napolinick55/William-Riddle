# William-Riddle
This is a repository for project code for CS304.

The sample code provided is from a class project in Java using the NetBeans IDE.


In the main class, the program creates an array of random numbers between 10 and 99.

The size of the array is 20, and is set bye the variable "sortSize" 
The range of 10 to 99 was to keep all the numbers at 2 digits each to more easily see the sorting pattern.

After the array is created, the class bubbleSort is called using the argument "sorter", which is the array created in main.

bubbleSort then creats a false boolean variable "cleanrun" which will be the control for the sorting loop.

Starting with array index 0 and array index idex 1 the values stored in the two are compared and are swapped if the values are out of order.

At the start of each loop, the "cleanrun" is set to true, and bill be set back to false again if a swap of values occurs.

For the purpose of displaying the sorting action, the original array of values is printed in a single line along with the pass number starting with zero.  This output allows the numbers to be viewd "bubbling up" to their correct position in the sort.

The program terminates when no further swaps are required.  A sample of the output is:

| 35 | 92 | 20 | 25 | 72 | 22 | 61 | 36 | 86 | 32 | 64 | 34 | 45 | 46 | 70 | 43 | 91 | 32 | 91 | 85 |  - Pass #0

| 35 | 20 | 25 | 72 | 22 | 61 | 36 | 86 | 32 | 64 | 34 | 45 | 46 | 70 | 43 | 91 | 32 | 91 | 85 | 92 |  - Pass #1

| 20 | 25 | 35 | 22 | 61 | 36 | 72 | 32 | 64 | 34 | 45 | 46 | 70 | 43 | 86 | 32 | 91 | 85 | 91 | 92 |  - Pass #2

| 20 | 25 | 22 | 35 | 36 | 61 | 32 | 64 | 34 | 45 | 46 | 70 | 43 | 72 | 32 | 86 | 85 | 91 | 91 | 92 |  - Pass #3

| 20 | 22 | 25 | 35 | 36 | 32 | 61 | 34 | 45 | 46 | 64 | 43 | 70 | 32 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #4

| 20 | 22 | 25 | 35 | 32 | 36 | 34 | 45 | 46 | 61 | 43 | 64 | 32 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #5

| 20 | 22 | 25 | 32 | 35 | 34 | 36 | 45 | 46 | 43 | 61 | 32 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #6

| 20 | 22 | 25 | 32 | 34 | 35 | 36 | 45 | 43 | 46 | 32 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #7

| 20 | 22 | 25 | 32 | 34 | 35 | 36 | 43 | 45 | 32 | 46 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #8

| 20 | 22 | 25 | 32 | 34 | 35 | 36 | 43 | 32 | 45 | 46 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #9

| 20 | 22 | 25 | 32 | 34 | 35 | 36 | 32 | 43 | 45 | 46 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #10

| 20 | 22 | 25 | 32 | 34 | 35 | 32 | 36 | 43 | 45 | 46 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #11

| 20 | 22 | 25 | 32 | 34 | 32 | 35 | 36 | 43 | 45 | 46 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #12

| 20 | 22 | 25 | 32 | 32 | 34 | 35 | 36 | 43 | 45 | 46 | 61 | 64 | 70 | 72 | 85 | 86 | 91 | 91 | 92 |  - Pass #13
