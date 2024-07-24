package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<TvShow> tvShows = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        // Adding objects using overloaded constructors
        animals.add(new Animal("Buddy", true));
        animals.add(new Animal("Max"));
        animals.add(new Animal());

        tvShows.add(new TvShow("Friends", 236, "Comedy"));
        tvShows.add(new TvShow("Breaking Bad", 62));
        tvShows.add(new TvShow("Unknown Show"));

        books.add(new Book("To Kill a Mockingbird", 281, 1960));
        books.add(new Book("A Brief History of Time", 256));
        books.add(new Book());

        // Collecting additional user input for animals
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.println("Please enter a name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Is it a dog? Yes or no:");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        // Collecting additional user input for TV shows
        System.out.println("TV Show Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.println("Name of the show:");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        // Collecting additional user input for books
        System.out.println("Book Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.println("Title of the book:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Number of pages:");
            int numberOfPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.println("What information will be printed? (everything/name)");
        String infoToPrint = scanner.nextLine();

        System.out.println("\nAnimals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nTV Shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\nBooks:");
        if (infoToPrint.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (infoToPrint.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        // Demonstrating the Counter class
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        System.out.println("\nCounter 1 initial value: " + counter1.value());
        System.out.println("Counter 2 initial value: " + counter2.value());

        counter1.increase();
        counter1.increase(5);
        counter2.decrease();
        counter2.decrease(3);

        System.out.println("Counter 1 value after increments: " + counter1.value());
        System.out.println("Counter 2 value after decrements: " + counter2.value());

        scanner.close();
    }
}

