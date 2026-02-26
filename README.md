# 🍽️ Restaurant Management System

## Problem Statement

In small and mid-sized restaurants, billing and order tracking is often handled manually or using basic tools.

Common challenges include:

- Manual bill calculation errors
- No structured storage of order history
- Difficulty in tracking past transactions
- No easy way to manage customer feedback
- Time-consuming billing process

Result: Inefficient operations and lack of data tracking.

---

## Solution

The Restaurant Management System is a desktop-based application that:

- Calculates bills automatically
- Applies tax and service charges
- Stores order records in a database
- Displays past transaction history
- Allows record deletion
- Collects customer feedback
- Displays menu pricing

This enables restaurant staff to manage orders efficiently through a simple GUI.

---

## System Workflow

User Input → Bill Calculation → Record Storage → Display in Table → Feedback Collection

---

## Key Features

- Automated bill calculation
- Tax computation (18%)
- Service charge calculation
- Order history management
- Record deletion
- Customer feedback collection
- Menu card display
- Simple graphical interface

---

## Tech Stack

### Application Layer
- Python

### GUI
- Tkinter

### Database
- SQLite

---

## Database

The system uses a SQLite local database.

Database File: Restaurant.db

Tables Used:

Restaurantrecords – Stores order and billing details  
FEEDBACK – Stores customer feedback

---

## Billing Logic

Item Prices:

- Pizza – ₹240
- Burger – ₹125
- Ice Cream – ₹80
- Drinks – ₹60

Additional Charges:

- Tax: 18%
- Service Charge: Cost / 99

---

## Project Structure

Restaurant-Management-System/

- main.py
- Restaurant.db
- README.md

---

## Application Modules

Billing Module
- Enter order quantity
- Calculate total cost
- Store order details

Order History
- Displays stored orders
- Allows deletion of records

Feedback Module
- Collects customer experience
- Stores responses in database

Menu Card
- Displays available items with prices

---

## How to Run the Project

Step 1: Install Python

Check installation:

python --version

Step 2: Run Application

python main.py

---

## Future Enhancements

- Login authentication
- Printable bill generation
- Additional menu categories
- Payment integration

---

## Author

Saloni Patil

---

## Project Vision

The goal of this system is to simplify restaurant billing and record management through an easy-to-use desktop interface, improving efficiency and reducing manual errors.
