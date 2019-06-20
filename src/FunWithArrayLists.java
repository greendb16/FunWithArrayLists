import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String reDo = "y";
        ArrayList<String> colors = new ArrayList<>();

        colors.add("RED");
        colors.add("BLUE");
        colors.add("YELLOW");
        for(String item:colors){
            System.out.println(item);
        }
        System.out.println(colors.get(1));


        while (!reDo.equalsIgnoreCase("q")) {

            System.out.println("\nEnter a color to add:");
            String newColor = key.nextLine();
            String newColor2 =newColor.toUpperCase();
            if (colors.contains(newColor2)) {
                System.out.println("\nThat color is already in the list.  Try again");
            } else {
                colors.add(newColor2);
            }
            System.out.print("\nThe List of colors are: " );
            for(String item:colors){
                System.out.print(item+"\t");
            }
            System.out.println("\nWould you like to input another color?");
            reDo = key.nextLine();
        }
    }
}
