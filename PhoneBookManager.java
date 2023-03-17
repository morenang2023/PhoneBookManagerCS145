package com.phonebook;

public class PhoneBookManager {

    ListNode head;

    public PhoneBookManager() {
        head = null;
    }

    public void addContactToStart(String firstName, String lastName, String city, String address, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, city, address, phoneNumber);
        newNode.next = head;
        head = newNode;
    }

    public void addContactToMiddle(String firstName, String lastName, String city, String address, String phoneNumber, int position) {
        ListNode newNode = new ListNode(firstName, lastName, city, address, phoneNumber);
        ListNode current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void addContactToEnd(String firstName, String lastName, String city, String address, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, city, address, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteContact(String phoneNumber) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null && !current.phoneNumber.equals(phoneNumber)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Contact not found.");
        } else if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public void modifyContact(String firstName, String lastName, String newFirstName, String newLastName, String newCity, String newAddress, String newPhoneNumber) {
        ListNode current = head;
        while (current != null) {
            if (current.firstName.equals(firstName) && current.lastName.equals(lastName)) {
                current.firstName = newFirstName;
                current.lastName = newLastName;
                current.city = newCity;
                current.address = newAddress;
                current.phoneNumber = newPhoneNumber;
                break;
            }
            current = current.next;
        }
    }

    public void displayContacts() {
        ListNode current = head;
        System.out.println("First Name\tLast Name\tCity\tAddress\tPhone Number");
        while (current != null) {
            System.out.println(current.firstName + "\t\t" + current.lastName + "\t\t" + current.city + "\t" + current.address + "\t" + current.phoneNumber);
            current = current.next;
        }
    }
}
