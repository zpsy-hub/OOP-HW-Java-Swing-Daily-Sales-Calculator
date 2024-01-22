# Java Swing Daily Sales Calculator

## Overview
This Java Swing program is designed to facilitate the tracking and calculation of sales for two types of items: phones and repair services. Users can input details such as item name, price, and quantity sold (for phones) or price per hour and number of hours (for repair services). The program then calculates and displays the total sales for each item.

## Features
• User-Friendly Interface: Utilizes Java Swing for a graphical user interface that is easy to navigate.

• Sales Calculation: Automatically computes and displays the total sales for phones and repair services based on user input.

## Usage
1. **Enter Item Details**

   • For Phones sold:
   
        • Item name: Phone
        • Price: ₱500.0
        • Quantity sold: 10x
   
   • For Repair Services:
   
        • Item name: Phone
        • Price: ₱500.0
        • Quantity sold: 10
3. **Calculate Total Sales**

   • The program will automatically calculate and display the total sales for each item.
5. **Abstraction Implementation**

    • The program utilizes an abstract class Item to represent common characteristics and behaviors for both phones and repair services.

    • The calculateTotalSales() abstract method ensures that each subclass provides its own logic for total sales calculation.
7. **Benefits of Abstraction**

    • Code Organization: Separation of general concepts from specific implementations promotes clean code organization.

    • Extensibility: Easily add new item types without modifying existing code.
 
    • Consistency: Enforces a shared behavior for calculating total sales across different item types.

## User-Interface
![image](https://github.com/zpsy-hub/Term-2-Group-1-A2101-OOP/assets/125028278/be5c7d51-12b0-4112-979b-20990a571fb3)

## Technologies
The Daily Sales Calculator was built with the following technologies:

Java: The primary programming language used in the system

## Authors (MO-IT110 - Group Carpo)
Jogine Novillas | Shane Mishael Abrasaldo | Zyra Camille Hachero

## Acknowledgements
Armando Sta. Cruz III | Mapúa Malayan Digital College

   
