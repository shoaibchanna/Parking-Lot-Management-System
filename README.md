## &#x20;Parking Lot Management System

// Submitted By: Muhammad Shoaib (023-25-0106)

//  Code compilation guide:
//  Set path -> then ->  javac Main.java vehicle\*.java model\*.java
//  Run Main ->  Main.java
//  the demo video is in the zipped folder. ss

\---



### Project Purpose



The Parking Lot Management System is a Java-based application designed to manage parking 

activities in a simple and organized way.



It allows users such as parking attendants or small parking area managers to:



\* Park vehicles (Car, Bike, Truck)

\* Assign available parking spots automatically

\* Unpark vehicles

\* Calculate parking fees based on entered hours

\* View the current status of the parking lot



This system is mainly intended for \*\*small-scale parking areas\*\*, 

where a simple and efficient solution is needed instead of complex automated systems.



\---



### Why This Project



This project was developed to solve the common problem of \*\*unorganized parking management\*\*, 

where vehicles are often parked randomly, causing confusion and inefficiency.



The learning goals of this project include:



\* Applying core \*\*Object-Oriented Programming (OOP)\*\* concepts

\* Understanding how to design a system using classes and objects

\* Practicing real-world problem solving using Java



The project focuses on simplicity so that the logic and OOP concepts are easy to understand and implement.



\---



### Main Core Modules and Functionality



The system is divided into multiple modules (classes), each responsible for a specific task.



\---

##### 

##### Vehicle Module (`vehicle` package)



\* \*\*Vehicle (Abstract Class)\*\*



&#x20; \* Stores common data like owner name and license plate

&#x20; \* Defines abstract method `getType()`



\* \*\*Car, Bike, Truck\*\*



&#x20; \* Inherit from Vehicle

&#x20; \* Provide specific vehicle types

&#x20; \* Demonstrate \*\*Inheritance and Polymorphism\*\*



\---



##### ParkingSpot Module (`ParkingSpot` class)



\* Represents a single parking space

\* Maintains:



&#x20; \* Spot ID

&#x20; \* Occupied status

&#x20; \* Parked vehicle

\* Functions:



&#x20; \* Park a vehicle

&#x20; \* Remove a vehicle

&#x20; \* Display spot status



\---



##### ParkingLot Module (`ParkingLot` class)



\* Manages all parking spots using an array



\* Main functionalities:



&#x20; \* Assign parking spots

&#x20; \* Remove vehicles

&#x20; \* Calculate parking fees based on hours entered

&#x20; \* Display parking status



\* Uses \*\*Polymorphism\*\* to handle different vehicle types through a common interface



\---



##### Main Module (`Main.java`)



\* Provides a \*\*menu-driven interface\*\*

\* Takes input from the user

\* Connects all modules and controls program flow



Menu options include:



1\. Park a vehicle

2\. Unpark a vehicle

3\. View parking status

4\. Exit



\---



System Flow (Basic Overview)



User → Menu Input → ParkingLot → ParkingSpot → Output Display



\---



#### Summary



This project demonstrates how Object-Oriented Programming concepts can be used to 

build a simple and practical parking management system. 

It is easy to use, easy to understand, and can be extended with advanced features in the future.



\---




