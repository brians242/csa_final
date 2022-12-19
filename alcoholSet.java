public class alcoholSet {

  private String country;
  private String total_consumption;
  private String recorded_consumption;
  private String unrecorded_consumption;
  private String beer_percentage;
  private String wine_percentage;
  private String spirits_percentage;
  private String other_percentage;
  private String past_projection;
  private String future_projection;

  public alcoholSet(String country, String total_consumption, String recorded_consumption, String unrecorded_consumption, String beer_percentage, String wine_percentage, String spirits_percentage, String other_percentage, String past_projection, String future_projection) {
    this.country = country;
    this.total_consumption = total_consumption;
    this.recorded_consumption = recorded_consumption; 
    this.unrecorded_consumption = unrecorded_consumption;
    this.beer_percentage = beer_percentage;
    this.wine_percentage = wine_percentage;
    this.spirits_percentage = spirits_percentage;
    this.other_percentage = other_percentage;
    this.past_projection = past_projection;
    this.future_projection = future_projection;
  }
  public alcoholSet() {
    country = new String("");
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public double getTotalConsumption() {
    return Double.valueOf(total_consumption).doubleValue();
  }
  public double getRecordedConsumption() {
    return Double.valueOf(recorded_consumption).doubleValue();
  }
  public double getUnrecordedConsumption() {
    return Double.valueOf(unrecorded_consumption).doubleValue();
  }
  public double getBeerPercentage() {
    return Double.valueOf(beer_percentage).doubleValue();
  }
  public double getWinePercentage() {
    return Double.valueOf(wine_percentage).doubleValue();
  }
  public double getSpiritsPercentage() {
    return Double.valueOf(spirits_percentage).doubleValue();
  }
  public double getOtherPercentage() {
    return Double.valueOf(other_percentage).doubleValue();
  }
  public double getPastProjection() {
    return Double.valueOf(past_projection).doubleValue();
  }
  public double getFutureProjection() {
    return Double.valueOf(future_projection).doubleValue();
  }
}