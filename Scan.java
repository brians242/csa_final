import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Scan {
  // Goal: Analyzing any three or more of the integer categories after the
  // corresponding string countries (ie. highs, lows of specific consumptions, the
  // amount of consumption in the top 10 countries, etc.)

  public static alcoholSet[] read() {
    alcoholSet[] alcoholInfo = new alcoholSet[189]; // uses the alcoholSet to store the data for each country, since we have data for 189 countries
    try {

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
      // we have set each country's values since they are separated by lines which we scan, we use .nextLine() to store the values
    } 
    catch (IOException e) {
      System.out.println(e.getMessage());
    } 
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return alcoholInfo;
    // we return the alcoholInfo so we can use it in our following methods, and we have the catch exception above in case try, except...
  }

  //////////
  public static String specificCountryInfo() {
    Scanner user = new Scanner(System.in);
    System.out.println("What country?");
    String country = user.nextLine();
    System.out.println("\nWhat category would you like to find of your country?");
    System.out.println("Your options for the input are:");
    System.out.println("\ntotal_consumption \nrecorded_consumption \nunrecorded_consumption \nbeer_percentage \nwine_percentage \nspirts_percentage \nother_percentage \npast_projection \nfuture_projection \n\n");
    String category = user.nextLine();
    alcoholSet alcoholInfo[] = read();

    // we get the input of which country and which info they want and get the alcoholInfo of all the countries which we returned in read
    
    String country_placeholder = country;
    // in the next lines of code, we check to see if we matched up the country and then add whatever data value they wanted based on their input
    String allOfTheCountries = ("\n" + country_placeholder + "'s");
      for (int i = 0; i < alcoholInfo.length; i++) {
        if (alcoholInfo[i].getCountry().equals(country)) {
          country_placeholder = country;
          if (category.equals("total_consumption")) {
            allOfTheCountries += " Total consumption percentage: ";
            allOfTheCountries += alcoholInfo[i].getTotalConsumption() + "%";
          }
          else if (category.equals("recorded_consumption")) {
            allOfTheCountries += " Recorded consumption percentage: " + alcoholInfo[i].getRecordedConsumption();
          }
          else if (category.equals("unrecorded_consumption")) {
            allOfTheCountries += " Unrecorded consumption percentage: " + alcoholInfo[i].getUnrecordedConsumption() + "%";
          }
          else if (category.equals("beer_percentage")) {
            allOfTheCountries += " Beer percentage: " + alcoholInfo[i].getBeerPercentage() + "%";
          }
          else if (category.equals("wine_percentage")) {
            allOfTheCountries += " Wine percentage: " + alcoholInfo[i].getWinePercentage() + "%";
          }
          else if (category.equals("spirits_percentage")) {
            allOfTheCountries += " Spirits percentage: " + alcoholInfo[i].getSpiritsPercentage() + "%";
          }
          else if (category.equals("other_percentage")) {
            allOfTheCountries += " Other percentage: " + alcoholInfo[i].getOtherPercentage() + "%";
          }
          else if (category.equals("past_projection")) {
            allOfTheCountries += " Past projection percentage: " + alcoholInfo[i].getPastProjection() + "%";
          }
          else if (category.equals("future_projection")) {
            allOfTheCountries += " Future projection percentage: " + alcoholInfo[i].getFutureProjection() + "%";
          }
        }
      }
    // in case they inputed something wrong, we tell them how to make sure they are right and have them restart by running this method again for them
    if (allOfTheCountries.equals("\n" + country_placeholder + "'s")) {
      System.out.println("\nMake sure to capitalized the first letter of your country, entered a valid country name, or provided the correct spelling located in the database! If you got that, make sure to input a valid category!");
      System.out.println("Remember, your options for the input are:");
      System.out.println("\ntotal_consumption \nrecorded_consumption \nunrecorded_consumption \nbeer_percentage \nwine_percentage \nspirts_percentage \nother_percentage \npast_projection \nfuture_projection");
      System.out.println("\n");
      specificCountryInfo();
      return "Gotta do better";
    }
    else {
      System.out.println("\nToo easy, here you go:");       
      System.out.println(allOfTheCountries);
      return "ah"; 
    }
    // returns the data value for their country
  }

  //////////
  public static String countryInfo() {

    Scanner user = new Scanner(System.in);
    System.out.println("What country would you like the information of?");
    String userInfo = user.nextLine().toLowerCase();

    alcoholSet alcoholInfo[] = read();
    // get input and all the data values for all the countries
    String placeholder = "";
    // for the next lines of code, we check for the country first and then add the data value they wanted based on their input and print it
    for (int i = 0; i < alcoholInfo.length; i++) {
      if (alcoholInfo[i].getCountry().toLowerCase().equals(userInfo)) {
        String countrysTotalInfo = ("\n" + alcoholInfo[i].getCountry() + "'s alcohol consumption stats: \n \n");
        countrysTotalInfo += "Total consumption percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getTotalConsumption()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Recorded consumption percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getRecordedConsumption()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Unrecorded consumption percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getUnrecordedConsumption()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Beer percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getBeerPercentage()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Wine percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getWinePercentage()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Spirits percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getSpiritsPercentage()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Other percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getOtherPercentage()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Past projection percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getPastProjection()).doubleValue());
        countrysTotalInfo += "% \n";
        countrysTotalInfo += "Future projection percentage: ";
        countrysTotalInfo += String.valueOf(Double.valueOf(alcoholInfo[i].getFutureProjection()).doubleValue());
        countrysTotalInfo += "% \n";

        placeholder = countrysTotalInfo;
      }
    }
    user.close();
    System.out.println(placeholder);
    return "ah";
  }

  ///////////////////////////////////////////////////////////////////
  public static String countryTotalConsumption() {
    Scanner minMax = new Scanner(System.in);
    System.out.println("Min or Max?: ");
    String minOrMax = minMax.nextLine();

    alcoholSet alcoholInfo[] = Scan.read();

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostConsumption = "\nCountries with most total consumption: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastConsumption = "\nCountries with least total consumption: \n\n";
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

    // ask for whether they want min or max and get data values for all the countries, we do this for each of the methods after specific_country_info and country_info in Scan.java
    
    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostRecordedConsumption = "\nCountries with most recorded consumption: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastRecordedConsumption = "\nCountries with least recorded consumption: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostUnrecordedConsumption = "\nCountries with most unrecorded consumption: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastUnrecordedConsumption = "\nCountries with least unrecorded consumption: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostBeerPercentage = "\nCountries with most beer percentage: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastBeerPercentage = "\nCountries with least beer percentage: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostWinePercentage = "\nCountries with most wine percentage: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastWinePercentage = "\nCountries with least Wine consumption: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostSpiritsPercentage = "\nCountries with most spirits percentage: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastSpiritsPercentage = "\nCountries with least spirits percentage: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostOtherPercentage = "\nCountries with most other percentage: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastOtherPercentage = "\nCountries with least other percentage: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
  
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostPastProjection = "\nCountries with most past projection: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;

      String countriesLeastPastProjection = "\nCountries with least past projection: \n\n";
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

    // we check for whether they want min or max and then get all the countries' data values and then go through all the data values for their category, find which countries have min or max and then print out those countries
    
    if (minOrMax.toLowerCase().equals("max")) {
      double max = 0.0;

      String countriesMostFutureProjection = "\nCountries with most Future Projection: \n\n";
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
      minMax.close();
    } else {
      double min = 9999.99;
      String countriesLeastFutureProjection = "\nCountries with least Future projection: \n\n";
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