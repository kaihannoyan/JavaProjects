package Managers;
import java.util.TreeSet;
public class CollectionManager{
  private TreeSet<Route> collection;
  private HashSet<Integer> uniqueIds;
  private ZonedDateTime creationDate;

  public CollectionManager (){
    this.collection = new TreeSet<>();
    this.uniqueIds = new HashSet<>();
    this.creationDate = ZonedDateTime.now();
  }
  private Integer getNextId (){
    if (uniqueIds.isEmpty()){
      return 1;
    } else {
      Integer id = uniqueIds.last () + 1;
      if (uniqueIds.contains (id))
        while (uniqueIds.contains (id))
          id +=1;
      uniqueIds.add (id);
      return id;
    }
  }
  public void add (Route route){
    route.setId (getNextId ());
    collection.add(route);
  }
  public String getInfo (){
    return "TreeSet of Route with size of #"+collection.size()+" created in "+creationDate;
  }
  public boolean update (int id,Route route){
    Optional<Route> routeToBeUpdated = collection.stream().filter (r -> r.getId () == id).findFirst();
    if (routeToBeUpdated.isPresent ()){
        collection.removeIf (r -> r.getId () == id);
        route.setId (id);
        collection.add(route);
      return true;
    }else return false;
  }
  
}
