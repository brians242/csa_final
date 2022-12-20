import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scan.read();
    Scanner userwants = new Scanner(System.in);
    System.out.println("What would you like to analyze in this worldwide Alcohol Consumption data?: ");
    // the next conditionals check for the user's first input and runs the methods that the user wants
    String userWants = userwants.nextLine();
    if (userWants.equals("specific_country_info")) {
      Scan.specificCountryInfo();
    }
    else if (userWants.equals("country_info")) {
      Scan.countryInfo();
    }
    else if (userWants.equals("total_consumption")) {
      Scan.countryTotalConsumption();
    } 
    else if (userWants.equals("recorded_consumption")) {
      Scan.countryRecordedConsumption();
    }
    else if (userWants.equals("unrecorded_consumption")) {
      Scan.countryUnrecordedConsumption();
    }
    else if (userWants.equals("beer_percentage")) {
      Scan.countryBeerPercentage();
    }
    else if (userWants.equals("wine_percentage")) {
      Scan.countryWinePercentage();
    }
    else if (userWants.equals("spirits_percentage")) {
      Scan.countrySpiritsPercentage();
    }
    else if (userWants.equals("other_percentage")) {
      Scan.countryOtherPercentage();
    }
    else if (userWants.equals("past_projection")) {
      Scan.countryPastProjection();
    }
    else if (userWants.equals("future_projection")) {
      Scan.countryFutureProjection();
    }
    // the else is for in case the user inputs an incorrect input and asks them to restart correctly
    else {
      System.out.println("\nPlease restart and try again with a valid input!");
      System.out.println("Your options for the input are:");
      System.out.println("specific_country_info \ncountry_info \ntotal_country_info \ntotal_consumption \nrecorded_consumption \nunrecorded_consumption \nbeer_percentage \nwine_percentage \nspirts_percentage \nother_percentage \npast_projection \nfuture_projection");
    }
    userwants.close();
  }
}