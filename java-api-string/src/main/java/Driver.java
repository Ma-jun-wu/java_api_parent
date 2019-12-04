import org.junit.Test;

public class Driver {
    public static void main(String[] args) {
        Person person = new Person("马君武",21,"男",170,52);
        System.out.println(person);
    }
    @Test
    public void testTrim(){
        String str1="************";
        System.out.println(str1);
        str1=str1.trim();
        System.out.println(str1);

        String str="i love you";
        boolean f=str.contains("you");
        System.out.println(f);
    }
}