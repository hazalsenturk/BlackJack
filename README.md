```
 _     _            _     _            _    
| |__ | | __ _  ___| | __(_) __ _  ___| | __
| '_ \| |/ _` |/ __| |/ /| |/ _` |/ __| |/ /
| |_) | | (_| | (__|   < | | (_| | (__|   < 
|_.__/|_|\__,_|\___|_|\_\/ |\__,_|\___|_|\_\
                       |__/                 
```

# BlackJack

## Requirements
(To locally run the code without .jar file)
Java 8
Maven -  Install https://maven.apache.org/install.html
JUnit

## How to run

1- .jar file is shared along with the source code. Get the .jar file to a local directory. 
Get the directory of the .jar file.  Run the following command in terminal to run the game:

java -jar "path to the .jar file"

OR 

2- Clone the repository to a local directory. Get the directory of the project.  Run the following command in terminal 
to run the game:

mvn clean install
java -jar "path to the .jar file"

## Comments on the instructions

The instructions were clear regarding the scale of the project. I have implemented the game as per instructions. 
I overall followed a brute force approach due to time limitations. At this scale, edge cases, error 
handling, and creating CLI was quite straightforward.

## Plus points of my approach and rationale behind them
I did well creating the simple design by mainly dividing tasks into 4 main classes including the driver class which is 
the main class to run the game. And using the map data structure for the card desks was a good approach to keep track 
of the cards drawn form the deck. Also it was helpful to collect different suits in simple unit.
// Todo: talk about why map, what are the classes and why created them



## Improvements can be made
However, the code is not very clean. There are plenty of conditionals and repetitions. In broader time, there can be 
refactored based on design patterns.
The assumptions in the instructions can be bypassed and lets the program to be more flexible for further improvements.
For instance desk creation can be done via factory design pattern so that new types of desks can be added easily.
Also, the game can be extended to other games such as poker, etc.

There can be a nice UI to make the game more interactive. And also multiplayers could be added.

Also in order to test the code thoroughly and make it more robust, I would have used TDD approach and integrate 
automated tests. I would have used Mockito to mock the user input and test the code. 

I can also modularize the code more and create more classes to make it more readable and clean.

## Tradeoffs
 
The tradeoffs for this project are mainly the time and the quality of the code. I have tried to keep the code as simple 
as possible. Since the game is simplified in this current structure, I have not used any design patterns or since there
are no splittings or so. I did not pick a complex algorithm for the game.


## Manual Testing
I have tested the game manually by running the game and playing it. I have also tested the game by running the test 
cases in JUnit. I considered the invalid inputs from the user and rather than ending the game I preferred prompting user 
for the input again.

I have also tested the game by running the game with different inputs and checking the output. 

Although, it is still not extensively tested. More test could be added to drawing cards (e.g if picked the cards more 
then 4 times, etc) and also for the game winner (e.g if the game is a draw, etc) and the user input. 

Automated testing can also be done using Spring Boot.
