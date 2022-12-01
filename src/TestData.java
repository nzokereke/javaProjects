import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestData {
    public static void fullName(String firstName,String lastName){
        System.out.println(" your name is "+ firstName +" " +lastName);
    }
    public static void fName(String name, String last) {
      String yourName = name + last;
      //return yourName;
    }

    public static void main(String[] args) {
    fullName("zoe", "okereke");
    fName("phoebe", "duru");

        String testData = "THIS IS SOME DATA";
        testData = testData.toLowerCase();
        System.out.println(testData);

        String dataTest = "Miss Zoe Okereke";
        dataTest=dataTest.toLowerCase();
        System.out.println(dataTest);
        System.out.println(dataTest.substring(5,8)); // substring function

        boolean testResult;
        int passingScore = 65;
        int studentScore = new java.util.Random().nextInt(100);
        if (studentScore>=passingScore){
            testResult = true;
        } else {
            testResult = false;
        }
        System.out.println(testResult);

        int [] number = {1,2,3,4,5,};
        for (int j : number) {
            System.out.println(j);

        }
        // ArrayLists
        ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(0,1);
            arrayList.add(1,2);
            System.out.println(arrayList);

        // Hash maps
        HashMap<Integer,String>myHash = new HashMap<>();
        myHash.put(1,"abraham");
        myHash.put(2,"benjamin");
        myHash.put(3,"cain");
        myHash.put(4,"david");
        for(String element : myHash.values()) {
            System.out.println(element);
        }
        for(Map.Entry<Integer, String> element: myHash.entrySet()){
            System.out.println(element);
        }
        ArrayList<Integer> theList = new ArrayList<Integer>();
        theList.add(1234);
        theList.add(4567);
        theList.add(99);
        theList.add(5);
        System.out.println(theList.size());
    }

}
