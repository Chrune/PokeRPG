public class startgame {
    private String name;
    private endgame birthday;

    public startgame(String theName, endgame theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
