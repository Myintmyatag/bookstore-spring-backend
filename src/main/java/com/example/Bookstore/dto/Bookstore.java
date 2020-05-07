package com.example.Bookstore.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Bookstore {

    @Id
    @Indexed(direction = IndexDirection.ASCENDING)
    private String id;
    private String surname;
    private String firstName;
    private String title;
    private int price;
    private int onSale;
    private int calendarYear;
    private String description;
    private int inventory;

    public Bookstore() {
    }

    public Bookstore(String surname, String firstName, String title, int price, int onSale, int calendarYear, String description, int inventory) {
        this.surname = surname;
        this.firstName = firstName;
        this.title = title;
        this.price = price;
        this.onSale = onSale;
        this.calendarYear = calendarYear;
        this.description = description;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOnSale() {
        return onSale;
    }

    public void setOnSale(int onSale) {
        this.onSale = onSale;
    }

    public int getCalendarYear() {
        return calendarYear;
    }

    public void setCalendarYear(int calendarYear) {
        this.calendarYear = calendarYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}



//
//`id` int(11) not null auto_increment,
//        `surname` varchar(24) DEFAULT NULL,
//        `first_name` varchar(24) DEFAULT NULL,
//        `title` varchar(96) DEFAULT NULL,
//        `price` float DEFAULT NULL,
//        `onSale` smallint(6) DEFAULT NULL,
//        `calendar_year` int(11) DEFAULT NULL,
//        `description` varchar(30) DEFAULT NULL,
//        `inventory` int(11) DEFAULT NULL,
//        primary key(`id`)