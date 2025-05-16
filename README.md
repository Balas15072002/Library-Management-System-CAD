# Readify – Library Management System

## Project Type  
**B2B (Business-to-Business)**

## Target Audience  
- Librarians  

## Timeline  
2 Weeks  

## Budget  
₹1,00,000 (1 Lakh) 

## Team Size  
1 Member  

---

## Key Features

- The librarian can **register and log in** using a secure username and password.
- The system allows managing **library details and book storage setup**.
- The librarian can **add new books** with full metadata:
  - Name  
  - Genre  
  - Volume  
  - Author  
  - Year  
  - Copies info  
- The librarian can **add and manage users/members** with personal details.
- The system supports **searching and filtering books** by:
  - Name  
  - Author  
  - Genre  
  - Year  
  - Availability  
- Each book has a **detailed page** showing complete information.
- Registered users can **borrow books**, with:
  - Borrow date  
  - Due date tracking  
- Users can **return books** and optionally provide **feedback or ratings**.
- Librarians can **manage library users** and view their borrowing history.
- The system calculates **fines for overdue books** and stores **fine payment details**.

---

## 🔹 Model Classes

### 🔹 RegistrationInfo
* `Integer librarianId`  
* `String firstName`  
* `String lastName`  
* `String mobileNo`  
* `String emailId`  
* `String password`  
* `String confirmPassword`  
* `String userName`  
* `String dob`  

### 🔹 Login
* `String userName`  
* `String password`  

### 🔹 Library
* `Integer id`  
* `String name`  
* `String incharge`  
* `Integer capacity`  
* `StorageStructure storageStructure`  
* `String address`  
* `String phoneNo`  
* `String wifiPassword`  
* `String emailId`  
* `Long openingTime`  
* `Long closingTime`  
* `Integer noAvailableDays`  

### 🔹 StorageStructure
* *(Details to be filled as per implementation)*

### 🔹 Book
* `String id`  
* `String name`  
* `String genre`  
* `byte volume`  
* `Integer publishedYear`  
* `String author`  
* `byte noOfCopy`  
* `byte availableCount`  

### 🔹 User
* `String userId`  
* `String firstName`  
* `String lastName`  
* `String email`  
* `String mobileNumber`  
* `String address`  
* `String dob`  
* `List<BorrowRecord> borrowedBooks`  
* `List<Feedback> feedbacks`  

### 🔹 BorrowRecord
* `String recordId`  
* `String userId`  
* `String bookId`  
* `Long borrowDate`  
* `Long dueDate`  
* `String returnId`  
* `Double fineAmount`  

### 🔹 ReturnDetails
* `String returnId`  
* `String borrowRecordId`  
* `Long returnDate`  
* `Feedback feedback`  
* `Double finePaid`  

### 🔹 Feedback
* `String feedbackId`  
* `String userId`  
* `String bookId`  
* `String comments`  
* `Integer rating` (1–5)  

### 🔹 FinePayment
* `String paymentId`  
* `String recordId`  
* `String userId`  
* `Double amount`  
* `Long paymentDate`  
* `String paymentMethod` (e.g., "Card", "UPI", "Cash")  

### 🔹 SearchFilter
* `String name`  
* `String author`  
* `String genre`  
* `Integer publishedYearFrom`  
* `Integer publishedYearTo`  
* `Boolean availableOnly`  

---
