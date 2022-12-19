import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Scan {
  // Goal: Analyzing any three or more of the integer categories after the corresponding string countries (ie. highs, lows of specific consumptions, the amount of consumption in the top 10 countries, etc.)
 
  public static alcoholSet[] read() {
    alcoholSet[] alcoholInfo = new alcoholSet[189];
    try{
      
      Scanner in = new Scanner(new File("alcohol-consumption.csv"));
      for (int i = 0; i < 189; i++) {
        String country = in.nextLine();
        String total_consumption = in.nextLine();
        String recorded_consumption = in.nextLine();
        String unrecorded_consumption = in.nextLine();
        String beer_percentage = in.nextLine();
        String wine_percentage = in.nextLine();
        String spirits_percentage = in.nextLine();
        String other_percentage = in.nextLine();
        String past_projection = in.nextLine();
        String future_projection = in.nextLine();

        alcoholInfo[i] = new alcoholSet(country, total_consumption, recorded_consumption, unrecorded_consumption, beer_percentage, wine_percentage, spirits_percentage, other_percentage, past_projection, future_projection);
      }
    }
    catch(IOException e) {
      System.out.println(e.getMessage());
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
    return alcoholInfo;
  }
  ///////////////////////////////////////////////////////////////////
  public static String countryTotalConsumption() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostConsumption = "Countries with most total consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getTotalConsumption() > max) {
          max = alcoholInfo[i].getTotalConsumption();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getTotalConsumption() >= max) {
          countriesMostConsumption += alcoholInfo[i].getCountry();
          countriesMostConsumption += "\n";
        }
      }
      System.out.println(countriesMostConsumption);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastConsumption = "Countries with least total consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getTotalConsumption() < min) {
          min = alcoholInfo[i].getTotalConsumption();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getTotalConsumption() <= min) {
          countriesLeastConsumption += alcoholInfo[i].getCountry();
          countriesLeastConsumption += "\n";
        }
      }
      System.out.println(countriesLeastConsumption);
      minMax.close();
    }
    return "Wow";
  }
  ////////////////////////////////////////////////////////////////////////
  public static String countryRecordedConsumption() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostRecordedConsumption = "Countries with most recorded consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getRecordedConsumption() > max) {
          max = alcoholInfo[i].getRecordedConsumption();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getRecordedConsumption() >= max) {
          countriesMostRecordedConsumption += alcoholInfo[i].getCountry();
          countriesMostRecordedConsumption += "\n";
        }
      }
      System.out.println(countriesMostRecordedConsumption);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastRecordedConsumption = "Countries with least recorded consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getRecordedConsumption() < min) {
          min = alcoholInfo[i].getRecordedConsumption();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getRecordedConsumption() <= min) {
          countriesLeastRecordedConsumption += alcoholInfo[i].getCountry();
          countriesLeastRecordedConsumption += "\n";
        }
      }
      System.out.println(countriesLeastRecordedConsumption);
      minMax.close();
    }
    return "Wow";
  }
  ////////////////////////////////////////////////////////////////////////
  public static String countryUnrecordedConsumption() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostUnrecordedConsumption = "Countries with most unrecorded consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getUnrecordedConsumption() > max) {
          max = alcoholInfo[i].getUnrecordedConsumption();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getUnrecordedConsumption() >= max) {
          countriesMostUnrecordedConsumption += alcoholInfo[i].getCountry();
          countriesMostUnrecordedConsumption += "\n";
        }
      }
      System.out.println(countriesMostUnrecordedConsumption);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastUnrecordedConsumption = "Countries with least unrecorded consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getUnrecordedConsumption() < min) {
          min = alcoholInfo[i].getUnrecordedConsumption();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getUnrecordedConsumption() <= min) {
          countriesLeastUnrecordedConsumption += alcoholInfo[i].getCountry();
          countriesLeastUnrecordedConsumption += "\n";
        }
      }
      System.out.println(countriesLeastUnrecordedConsumption);
      minMax.close();
    }
    return "Wow";
  } 
/////////////////////////////////////////////////////////////////////////////////
  public static String countryBeerPercentage() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostBeerPercentage = "Countries with most beer percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getBeerPercentage() > max) {
          max = alcoholInfo[i].getBeerPercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getBeerPercentage() >= max) {
          countriesMostBeerPercentage += alcoholInfo[i].getCountry();
          countriesMostBeerPercentage += "\n";
        }
      }
      System.out.println(countriesMostBeerPercentage);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastBeerPercentage = "Countries with least beer percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getBeerPercentage() < min) {
          min = alcoholInfo[i].getBeerPercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getBeerPercentage() <= min) {
          countriesLeastBeerPercentage += alcoholInfo[i].getCountry();
          countriesLeastBeerPercentage += "\n";
        }
      }
      System.out.println(countriesLeastBeerPercentage);
      minMax.close();
    }
    return "Wow";
  } /////////////////////////////////////////////////////////////////////////
  public static String countryWinePercentage() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostWinePercentage = "Countries with most wine percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getWinePercentage() > max) {
          max = alcoholInfo[i].getWinePercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getWinePercentage() >= max) {
          countriesMostWinePercentage += alcoholInfo[i].getCountry();
          countriesMostWinePercentage += "\n";
        }
      }
      System.out.println(countriesMostWinePercentage);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastWinePercentage = "Countries with least Wine consumption: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getWinePercentage() < min) {
          min = alcoholInfo[i].getWinePercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getWinePercentage() <= min) {
          countriesLeastWinePercentage += alcoholInfo[i].getCountry();
          countriesLeastWinePercentage += "\n";
        }
      }
      System.out.println(countriesLeastWinePercentage);
      minMax.close();
    }
    return "Wow";
  }
  ////////////////////////////////////////////////////////////////////////////
  public static String countrySpiritsPercentage() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostSpiritsPercentage = "Countries with most spirits percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getSpiritsPercentage() > max) {
          max = alcoholInfo[i].getSpiritsPercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getSpiritsPercentage() >= max) {
          countriesMostSpiritsPercentage += alcoholInfo[i].getCountry();
          countriesMostSpiritsPercentage += "\n";
        }
      }
      System.out.println(countriesMostSpiritsPercentage);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastSpiritsPercentage = "Countries with least spirits percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getSpiritsPercentage() < min) {
          min = alcoholInfo[i].getSpiritsPercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getSpiritsPercentage() <= min) {
          countriesLeastSpiritsPercentage += alcoholInfo[i].getCountry();
          countriesLeastSpiritsPercentage += "\n";
        }
      }
      System.out.println(countriesLeastSpiritsPercentage);
      minMax.close();
    }
    return "Wow";
  }
////////////////////////////////////////////////////////////////////////////////
  public static String countryOtherPercentage() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostOtherPercentage = "Countries with most other percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getOtherPercentage() > max) {
          max = alcoholInfo[i].getOtherPercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getOtherPercentage() >= max) {
          countriesMostOtherPercentage += alcoholInfo[i].getCountry();
          countriesMostOtherPercentage += "\n";
        }
      }
      System.out.println(countriesMostOtherPercentage);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastOtherPercentage = "Countries with least other percentage: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getOtherPercentage() < min) {
          min = alcoholInfo[i].getOtherPercentage();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getOtherPercentage() <= min) {
          countriesLeastOtherPercentage += alcoholInfo[i].getCountry();
          countriesLeastOtherPercentage += "\n";
        }
      }
      System.out.println(countriesLeastOtherPercentage);
      minMax.close();
    }
    return "Wow";
  }
//////////////////////////////////////////////////////////////////////////////
    public static String countryPastProjection() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostPastProjection = "Countries with most past projection: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getPastProjection() > max) {
          max = alcoholInfo[i].getPastProjection();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getPastProjection() >= max) {
          countriesMostPastProjection += alcoholInfo[i].getCountry();
          countriesMostPastProjection += "\n";
        }
      }
      System.out.println(countriesMostPastProjection);
    }
    else {
      double min = 9999.99;
      
      String countriesLeastPastProjection = "Countries with least past projection: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getPastProjection() < min) {
          min = alcoholInfo[i].getPastProjection();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getPastProjection() <= min) {
          countriesLeastPastProjection += alcoholInfo[i].getCountry();
          countriesLeastPastProjection += "\n";
        }
      }
      System.out.println(countriesLeastPastProjection);
      minMax.close();
    }
    return "Wow";
  }
////////////////////////////////////////////////////////////////////////////////
  public static String countryFutureProjection() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();
    
    alcoholSet alcoholInfo[] = Scan.read();
    if (minOrMax.equals("max")) {
      double max = 0.0;
      
      String countriesMostFutureProjection = "Countries with most Future Projection: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getFutureProjection() > max) {
          max = alcoholInfo[i].getFutureProjection();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getFutureProjection() >= max) {
          countriesMostFutureProjection += alcoholInfo[i].getCountry();
          countriesMostFutureProjection += "\n";
        }
      }
      System.out.println(countriesMostFutureProjection);
    }
    else {
      double min = 9999.99;
      String countriesLeastFutureProjection = "Countries with least Future projection: \n";
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getFutureProjection() < min) {
          min = alcoholInfo[i].getFutureProjection();
        }
      }

      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getFutureProjection() <= min) {
          countriesLeastFutureProjection += alcoholInfo[i].getCountry();
          countriesLeastFutureProjection += "\n";
        }
      }
      System.out.println(countriesLeastFutureProjection);
      minMax.close();
    }
    return "Wow";
  }
}