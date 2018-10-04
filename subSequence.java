import java.util.*;
class subSequence{

     static Scanner sc=new Scanner(System.in);
     static void seq(String s,String p){
      if(p.length()<0)
      return;

      System.out.println(s);
      for(int i=0;i<p.length();i++)
       seq(s+p.charAt(i),p.substring(i+1,p.length()));
  }


       public static void main (String args[]){
        String x=sc.nextLine();
          seq("",x);
          }
        }