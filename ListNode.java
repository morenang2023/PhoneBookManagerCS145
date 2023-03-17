package com.phonebook;

public class ListNode {

    String firstName;
    String lastName;
    String city;
    String address;
    String phoneNumber;
    ListNode next;
  
    public ListNode(String firstName, String lastName, String city, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
