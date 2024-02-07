package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

    Testing Implementation of Iterable and Interator interface

*/
public class CollectionsTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        /*
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext())
                System.out.println(iterator.next());

         */

        for(int x : list)
            System.out.println(x);


        List<Integer> lst = new ArrayList<>();
    }
}
