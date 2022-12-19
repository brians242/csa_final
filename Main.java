import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scan.read();
    Scanner userwants = new Scanner(System.in);
    System.out.println("What would you like to analyze?: ");
  
    String userWants = userwants.nextLine();
    if (userWants.equals("total_consumption")) {
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
    userwants.close();
  }
}