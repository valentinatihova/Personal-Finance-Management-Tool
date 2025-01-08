# Personal-Finance-Management-Tool

## Overview
This is a simple Java application designed to help users manage their personal finances by allowing them to convert currencies, receive dinner advice based on their remaining funds, track daily expenses, and find the maximum expense over a week.

## Features
* Currency Conversion: Convert your remaining money from Russian Rubles (RUB) to various currencies (USD, EUR, JPY) based on predefined exchange rates.
* Dinner Advice: Get personalized dinner advice based on your remaining funds and the number of days until your next payday.
* Expense Tracking: Input and track daily expenses for each day of the week and check the total expenses.
* Max Expense Calculation: Find out the maximum amount spent on a single day over the past week.

## Requirements
Java Development Kit (JDK) 8 or higher
A terminal or command prompt to run the application

## Installation
Clone the repository (or download the source code):
`git clone <repository-url>
cd main`

Compile the Java files:
`javac Main.java Converter.java DinnerAdvisor.java ExpensesManager.java`

Run the application:
 `java Main`

## Usage

Upon running the application, you will be prompted to enter the following details:

* Your remaining money until the next payday.
* The number of days until your next payday.

You will then see a menu with the following options:

- **Convert Currency**: Enter the amount and select the currency you want to convert to (1 - USD, 2 - EUR, 3 - JPY).
- **Get Dinner Advice**: Receive a suggestion on whether to eat out or stay in based on your finances.
- **Input Expense**: Record an expense by selecting the day of the week and entering the amount spent.
- **Show Weekly Expenses**: Display a summary of the expenses recorded for the week.
- **Show Maximum Expense**: Get the maximum expense recorded during the week.
- **Exit**: Close the application.

## Code Structure

- **Main.java**: Contains the main method and the menu interface for user interactions.
- **Converter.java**: Handles currency conversion logic.
- **DinnerAdvisor.java**: Provides dinner suggestions based on financial status.
- **ExpensesManager.java**: Manages expense tracking and calculations.
