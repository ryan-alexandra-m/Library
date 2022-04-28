package com.company;
import java.time.LocalDate;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    LocalDate publishDate = LocalDate.of(2003, 11, 1);
	Book HarryPotter= new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", publishDate, 309, Book.qualityOfBook.NEW, true);
    System.out.println(HarryPotter.getName()+ ":");
    System.out.println(HarryPotter.getName() + " is " + HarryPotter.getAge()+ " years old");
    System.out.println("It is " + HarryPotter.isLong()+ " that " + HarryPotter.getName() + " is a long book");
    System.out.println(HarryPotter.getName() + " is in " + HarryPotter.getQuality() + " condition ");
    System.out.println("It is " + HarryPotter.accordingToAlexIsAGoodBook()+ " that " + HarryPotter.getName() + " is a good book according to Alex");


    Book MyMemoir= new Book("Alex's Memoir", "Alex");
    System.out.println(MyMemoir.getName()+ ":");
    System.out.println(MyMemoir.getName() + " is " + MyMemoir.getAge()+ " years old");
    System.out.println("It is " + MyMemoir.isLong()+ " that " + MyMemoir.getName() + " is a long book");
    System.out.println(MyMemoir.getName() + " is in " + MyMemoir.getQuality() + " condition ");
    System.out.println("It is " + MyMemoir.accordingToAlexIsAGoodBook()+ " that " + MyMemoir.getName() + " is a good book according to Alex");

    }
}
