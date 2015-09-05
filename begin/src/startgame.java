public class startgame {
    private String girlName;
  public void setName(String name){
      girlName = name;
  }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf was %s", getName());
    }
}
