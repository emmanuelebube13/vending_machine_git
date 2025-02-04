# Vending Machine Program

## 📌 Overview
This is a simple **Java-based vending machine program** that allows users to select a product, enter payment, and receive change accordingly. If the user's initial payment is insufficient, the program prompts for additional funds until the required amount is met.

## 🎯 Features
 1. Displays a list of available products with their prices.  
 2. Accepts user input for **product selection** and **payment amount**.  
 3. Checks if the payment is sufficient:  
   - If **sufficient**, it provides change and thanks the user.  
   - If **insufficient**, it requests additional money until the full amount is paid.  
 4. Prevents invalid product selection and ensures smooth transactions.  

## 🛠️ How It Works
1. The program displays a list of products with prices.  
2. The user selects a product by entering its number.  
3. The user inputs their payment amount.  
4. If the amount is **enough**, the machine calculates and returns the change.  
5. If the amount is **not enough**, the program prompts the user to add more money until the total price is covered.  
6. The transaction completes, and the program displays a **thank-you message** along with any remaining change.  

## 📌 Example Usage
```sh
Available Products:
Product 1 - $1.25
Product 2 - $0.75
Product 3 - $0.90
Product 4 - $0.75
Product 5 - $1.50
Product 6 - $0.75

Enter Product and price: 2 0.50
Please insert another $0.25
Insert additional amount: 0.30
Thank you for buying item 2. Your change is $0.05
