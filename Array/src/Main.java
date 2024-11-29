import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Basketball");
        sports.add("Athletics");
        sports.add("Football");

        System.out.println("toString: " + sports.toString());

        Collections.sort(sports);
        System.out.println("sort: " + sports);

        int index = Collections.binarySearch(sports, "Basketball");
        System.out.println("binarySearch: " + index);

        ArrayList<String> list2 = new ArrayList<>(sports);
        System.out.println("equals: " + sports.equals(list2));

        String[] sports1 = {"Basketball", "Athletics"};
        String[] sports2 = {"Athletics", "Basketball"};
        String[] sports3 = {"Basketball", "Athletics"};
        int res1 = Arrays.compare(sports1, sports2);
        System.out.println("compare: " + res1);
        int res2 = Arrays.compare(sports1, sports3);
        System.out.println("compare: " + res2);
    }

}