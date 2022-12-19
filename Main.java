import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scan.read();
    Scanner userwants = new Scanner(System.in);
    System.out.println("What would you like to analyze in this worldwide Beer Consumption data?: ");
  
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
    else {
      System.out.println("Please restart and try again with a valid input!");
      System.out.println("Your options for the input are:");
      System.out.println("total_country_info \n country_info \n total_consumption \nrecorded_consumption \nunrecorded_consumption \nbeer_percentage \nwine_percentage \nspirtis_percentage \nother_percentage \npast_projection \nfuture_projection");
    }
    userwants.close();
  }
}