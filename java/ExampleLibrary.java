import java.util.Scanner;

public class ExampleLibrary {
  public static void main(String[] args) {
    // First, we collect a url from users:
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter the URL you'd like to clean up:");
    String url = reader.nextLine().trim();

    System.out.println("Should we remove query strings (y/n/yes/no)?");
    String removeQueryStrings = reader.nextLine().trim();

    boolean removeQS;
    if (removeQueryStrings == "y" || removeQueryStrings == "yes") {
      removeQS = true;
    } else {
      removeQS = false;
    }

    // Remove query strings
    if (removeQS) {
      url = url.split("?")[0];
    }

    System.out.println(url.substring(0, 3));
    System.out.println(url.substring(0, 3).equals("www"));
    System.out.println(url.substring(0, 3) == "www");

    // Extend URL
    if (url.substring(0, 3).equals("www")) {
      // Example: "www.andover.edu"
      url = "https://" + url;
    } else if (url.substring(0, 4).equals("http")) {
      // Example: "andover.edu"
      url = "https://www." + url;
    }

    System.out.println("\nThe result is: " + url);
  }
}
