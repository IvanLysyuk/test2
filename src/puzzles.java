public class puzzles {
    public static void main(String...args){
      int s=957932;
      int sec=s%60;
      int m= (s-sec)/60;
      int min=m%60;


      System.out.println(min +"минут" +sec + "min");
    }
}
