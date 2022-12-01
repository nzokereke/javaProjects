package Array;

public class ArrayAdapt {
    public static void main(String[] args) {
        String[] list = {"eggs", "bread", "tomatoes", "avocado", "butter", "coffee"};
        System.out.print("shopping list\n");
        for (String s : list) {
            System.out.println("--" + s);
        }
        for(int i =0; i<list.length; i++){
            System.out.print("\n** "+ list[i]);
        }
    }
}
