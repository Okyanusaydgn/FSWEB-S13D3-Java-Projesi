import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Person person1 = new Person("Okyanus", "aydogan",24);
        Person person2 = new Person("Fateme","aydogan",24);
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());
        System.out.println(person2.getSalary());


        Person person3 = new Person("ali","veli",74,6500,true,new String[]{"piano","chess"});
        System.out.println(person3.getSalary());
        System.out.println(Arrays.toString(person3.getHobbies()));
         */

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}

// yukarıdaki yapılar person sınıfına ait instance lardır.