public class Method {
    static void myName(String fname, String sname, int age) {
        System.out.format("my name is %s %s I am %d years old  \n", fname, sname, age);
    }

    public static void main(String[] args) {
        {
            myName("joe", "blogs", 30);
            myName("josaphine", "bloggers", 28);
        }

    }
}