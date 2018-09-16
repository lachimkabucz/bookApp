package bookexeample;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;


public class Bookexample {

    public static void main(String[] args) throws IOException {

        Path inputData = Paths.get("dane.txt");
        List<String> allLines = Files.readAllLines(inputData);


        List<Book> bookList = new ArrayList<>();
        for (String dataLine : allLines) {
            String[] field = dataLine.split(";");
            Book fields = new Book(field[0], field[1], Integer.parseInt(field[2]), Integer.parseInt(field[3]), field[4], field[5], field[6]);
            bookList.add(fields);
        }

        List<Book> yearSortExample = bookList.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .collect(Collectors.toList());
        Optional<Book> maxPageExample = bookList.stream()
                .max(Comparator.comparing(Book::getNumberPage));
        List<Book> typeSortExample = bookList.stream()
                .sorted(Comparator.comparing(Book::getType))
                .collect(Collectors.toList());
        List<Book> isbnSortExample = bookList.stream()
                .sorted(Comparator.comparing(Book::getIsbn))
                .collect(Collectors.toList());
        List<Book> authorSortExample = bookList.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .collect(Collectors.toList());
        List<Book> publisherSortExample = bookList.stream()
                .sorted(Comparator.comparing(Book::getPublishing))
                .collect(Collectors.toList());
        List<Book> titleSortExample = bookList.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());

        System.out.println("-------LIBRARY------");
        System.out.println("Number of books in the library: " + allLines.size());
        System.out.println("--------------------");
        System.out.println("Select your option");
        System.out.println(
                "1.Books with the largest number of pages \n" +
                        "2.Sort by year\n" +
                        "3.Sort by type\n" +
                        "4.Sort by ISBN \n" +
                        "5.Sort by author \n" +
                        "6.Sort by title \n"+
                        "7. Sort by publisher \n"

        );


        Scanner selectOption = new Scanner(System.in);
        while (selectOption.hasNext()) {
            switch (selectOption.nextInt()) {
                case 1:
                    System.out.println(maxPageExample);
                    break;
                case 2:
                    System.out.println(yearSortExample);
                    break;
                case 3:
                    System.out.println(typeSortExample);
                    break;
                case 4:
                    System.out.println(isbnSortExample);
                    break;
                case 5:
                    System.out.println(authorSortExample);
                    break;
                case 6:
                    System.out.println(titleSortExample);
                    break;
                case 7:
                    System.out.println(publisherSortExample);

                default:
                    System.out.println("Input correctly number");
            }

        }
    }
}


