import java.util.*;  
class HighLowTree{  
 public static void main(String args[]){  
 TreeSet1<Integer> set=new TreeSet1<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15);  
         System.out.println(set);
         System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
 }  
}  