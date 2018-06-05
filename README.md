# Java_Learning
problem statements/ Requirements

Loops & Conditional Statements
---------------------------------
Datex Shipping Corporation uses a specific code to identify through what modes can an item be possibly shipped. The special shipment code is a string of length strictly 3 characters containing only 0's and 1's.
If the item can be shipped through only Airways, the first digit in the code will be 1 otherwise 0 --> 100
If the item can be shipped through only Waterways, the second digit in the code will be 1 otherwise 0 --> 010
If the item can be shipped through only Roadways, the third digit in the code will be 1 otherwise 0 --> 001
If the item can be shipped through Airways and Waterways, the first and second digit in the code will be 1 otherwise 0 --> 110, likewise for other modes too.
If the item can be shipped through all modes, all 3 digits will be 1 --> 111
----------------------------------

Array
---------------------------------
Given the number of Ids and the sequence of the shuffled Ids, find the next Id
---------------------------------

Exception Handling
-------------------------------
Get the number of items in container and cost of each item as input. Write a program to calculate the total cost of each item in the container. 
This program will throw a NumberFormatException when cost of a item is not a number. Use Exception handling mechanism to handle the exception.
---------------------------------


File Handling
----------------------------
read all the Users information from the file ( comma separated), stored in fixed length format and print all the User details as a list in the console.
-------------------------------

Inheritance
-------------------------
 get the Container related information and display it in the specified format.
 
 Sample input and output
 Enter the number of containers :
2
Enter the container 1 details :
FRT/LKJ/025,30,70,40,10000
Enter the container 2 details :
JHG/JTR/354,40,80,30,8000
Container details are
Container Number        Length            Width             Height            Weight
FRT/LKJ/025                30.0                70.0               40.0               10000.0
JHG/JTR/354                40.0                80.0               30.0                8000.0 

------------------------------------------------------------------

Interface
-------------------
Write a program using Comparable Interface to display the port details  sorted based on country name in ascending order.
Sample Input and Output 1:
Enter the port details
2114,Galle Port,Sri Lanka
Do you want to continue[Yes/No]
Yes
2111,Sydney Port,Australia
Do you want to continue[Yes/No]
Yes
2112,Kandla,India
Do you want to continue[Yes/No]
No
Port details in sorted order
Port Id         Name                  Country        
2111            Sydney Port      Australia      
2112            Kandla                India          
2114            Galle Port          Sri Lanka 
--------------------------------------------------------------------------

Polymorphism
-------------------------------------
Sample Input and Output 1:
Enter the total number of users
2
Enter user details
peeter,peeter,mark,9965000001
john,john,sam,9500484444
1)Search user by user name
2)Search user by first name and last name
Enter your option
1
Enter the user name to search
peeter
User details :
Username :peeter
FirstName :peeter
LastName :mark
Contact :9965000001
-------------------------------------------

