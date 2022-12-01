package ClassExercise;

public class Door {
   private String name;
   private boolean isOpen ;
   private boolean isClosed;

   public void getName(String n){
       name = n;

   }
    public void open(){
        isOpen = true;
    }

    public void closed(){
        isOpen = false;
    }

    public void doorStatus(){

        if (isOpen){
            System.out.println(name + " door is open " );
        }
        else{
            System.out.println(name + " door is closed " );
        }
        }
}


