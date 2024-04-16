import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("Denis");
        stringArray.add("Andrei");
        stringArray.add("Damse");
        System.out.println(stringArray);
        ListMethods.swapFirstLast(stringArray);
        System.out.println(stringArray);
    }
}
