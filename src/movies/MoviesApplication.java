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
                    displayCategories();
                    int categoryOption = Integer.parseInt(sc.nextLine());
                    String category;

                    switch (categoryOption){
                        case 1:
                            category = "all";
                            break;
                        case 2:
                            category = "animated";
                            break;
                        case 3:
                            category = "drama";
                            break;
                        case 4:
                            category = "horror";
                            break;
                        case 5:
                            category = "sifi";
                            break;
                        default:
                            System.out.println("Invalid category option. Showing all movies.");
                            category = "all";
                            break;
                    }

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


        private static void displayCategories() {
            System.out.println("Categories:");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - View movies in the Animated category");
            System.out.println("3 - View movies in the Drama category");
            System.out.println("4 - View movies in the Horror category");
            System.out.println("5 - View movies in the Sci-Fi category");
        }

    }





