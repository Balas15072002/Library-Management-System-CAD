package com.zsgs.readify.data.dto;

import java.util.List;

public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String address;
    private String dob;
    private List<BorrowRecord> borrowedBooks;
    private List<Feedback> feedbacks;
}
