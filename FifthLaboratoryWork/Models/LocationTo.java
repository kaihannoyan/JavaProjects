package Models;

public class LocationTo {
  private Double x;
  private double y;
  private Long z;

  public LocationTo (Double x, double y, Long z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public void setX (Double x){
    this.x = x;
  }
  public Double getX (){
    return x;
  }
  public void setY (double y){
    this.y = y;
  }
  public double getY(){
    return y;
  }
  public Long getZ (){
    return z;
  }
  public void setZ (Long z){
    this.z = z;
  }
}
