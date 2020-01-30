import java.util.Scanner;
public class Council {
    //Symbol for array are [ ]

    public static void main(String agrs[]){
        Scanner read = new Scanner(System.in);

        System.out.println("How many persons would you like in your council");
        int councilNUmber = read.nextInt();
        read.nextLine();

        Person[] council = new Person[councilNUmber];
        int sumAges = 0;
        double averageAge = 0;

        for(int i = 0; i< councilNUmber; i++){
            System.out.println("Name of council person " + (i+1) + ":");
            String name = read.nextLine();
            System.out.println("Age of council person " + (i+1) + ":");
            String age = read.nextLine();
            System.out.println("Favorite food of council person " + (i+1) + ":");
            String food = read.nextLine();

            Person person = new Person(name, age, food);
            council[i] = person;
        }

        for(int i = 0; i < council.length; i++){
            System.out.println(council[i]);

            sumAges += Integer.parseInt(council[i].getAge());
            averageAge = sumAges/ council.length;
        }

        System.out.println("The average is: " + averageAge);


    }

}
