
public class Route {
  private int id;
  private String name;
  private Coordinates coordinates;
  private ZonedDateTime creationDate;
  private LocationFrom from;
  private LocationTo to;
  private int distance;
  public Route (String name,Coordinates coordinates, ZonedDateTime creationDate, LocationFrom from, LocationTo to, int distance){
    this.name = name;
    this.coordinates = coordinates;
    this.creationDate = creationDate;
    this.from = from;
    this.to = to;
    this.distance = distance;
  }
  public int getId (){
    return id;
  }
  public void setId (int id){
    this.id = id;
  }
  public String getName (){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public Coordinates getCoordinates (){
    return coordinates;
  }
  public void setCoordinates (Coordinates coordinates){
    this.coordinates = coordinates;
  }
  public ZonedDateTime getCreationDate (){
    return creationDate;
  }
  public void setCreationDate (ZonedDateTime creationDate){
    this.creationDate = creationDate;
  }
  public LocationFrom getFrom (){
    return from;
  }
  public void setFrom (LocationFrom from){
    this.from = from;
  }
  public LocationTo getTo (){
    return to;
  }
  public void setTo (LocationTo to ){
    this.to = to;
  }
}
