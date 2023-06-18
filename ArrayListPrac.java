import java.util.ArrayList;


public class ArrayListPrac {
    public static void main(String args[]){
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(12);
        i.add(13);
        i.add(15);
        for(int j: i)
            System.out.println(j);
       

    }


}



/*
 * import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
 */