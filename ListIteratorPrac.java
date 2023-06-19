import java.util.*;  
public class ListIteratorPrac {
    public static void main(String args[]){  
List<String> list=new ArrayList<String>();    
        list.add("Arbaaz");    
        list.add("junaid");    
        list.add("Saurav");    
        list.add(1,"ketan");    
        ListIterator<String> iterator=list.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(iterator.hasNext()){    
              
        System.out.println("index:"+iterator.nextIndex()+" value:"+iterator.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(iterator.hasPrevious()){    
          
        System.out.println("index:"+iterator.previousIndex()+" value:"+iterator.previous());    
        }    
}  
}

