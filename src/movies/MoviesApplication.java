package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;


        do {
            System.out.println("What would you like to do?");
            System.out.println("1. View all movies");
            System.out.println("2. View moves by category");
            System.out.println("3. Exit");
            System.out.println("Please select a choice");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    displayMovies(MoviesArray.findAll());
                    break;
                case "2":
                    System.out.println("Enter the category: ");
                    String category = sc.nextLine();
                    displayMoviesByCategory(MoviesArray.findAll(), category);
                    break;
                case "3":
                    System.out.println("Exiting the application. Have a good day....I SAID GOOD DAY!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();

        } while (!choice.equals("3"));
    }

    private static void displayMovies(Movie[] movies) {
        System.out.println("Movies: ");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getCategory());
        }
    }


    private static void displayMoviesByCategory(Movie[] movies, String category) {
        if (category.equalsIgnoreCase("all")) {
            System.out.println("Movies in all categories:");
            for (Movie movie : movies) {
                System.out.println(movie.getName());
            }
        } else {
            System.out.println("Movies in the " + category + " category:");
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(movie.getName());
                }
            }
        }
    }
}




