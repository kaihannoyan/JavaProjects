package Models;

public class LocationFrom {
  private Long x;
  private Integer y;
  private String name;
  public LocationFrom (Long x, Integer y, String name){
    this.x = x;
    this.y = y;
    this.name = name;
  }
  public void setX (Long x){
    this.x = x;
  }
  public Long getX (){
    return x;
  }
  public void setY (Integer y){
    this.y = y;
  }
  public void setName (String name ){
    this.name = name;
  }
  public String getName (){
    return name;
  }
}
