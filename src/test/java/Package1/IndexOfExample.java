package Package1;

public class IndexOfExample{
   public static void main(String args[]) {
       String str1 = new String("Beginners This is a BeginnersBook Beginners tutorial");
       String str2 = new String("Beginners");
   //    String str3 = new String("Book");
    //   String str4 = new String("Books");
       System.out.println("Index of B in str1: "+str1.indexOf('B'));
       
       System.out.println("Index of string str2 in str1:"+str1.indexOf(str2));
       
   }
}