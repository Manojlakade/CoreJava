package Collections.listInterFACE.ComparableandComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class main_comparable {
    public static void main(String[] args) {
        Animal_comparable a1=new Animal_comparable(10,"abhi",72);
        Animal_comparable a2=new Animal_comparable(9,"xavier",70);
        Animal_comparable a3=new Animal_comparable(9,"manoj",75);

        List<Animal_comparable> st=new ArrayList<>();
        st.add(a1);
        st.add(a2);
        st.add(a3);


        //before comparator sorting
        //Collections.sort(st);


        //Custom Comparator used for specefic object for comparison rather than directly changing whole comparison
        //logic for all objects
        //Comparator in Java is an interface used to define custom sorting logic for objects.



//        Collections.sort(st, new Comparator<Animal_comparable>() {
//            @Override
//            //
//            public int compare(Animal_comparable o1, Animal_comparable o2) {
//                //return o1.weight- o2.weight;
//                return o1.name.compareTo(o2.name);//for str use compareTo
//            }
//
//            //shortcut
//            Collections.sort()
//        });


//        Collections.sort(st,(o1,o2) ->o1.name.compareTo(o2.name));

//        Collections.sort(st,Comparator.comparing(Animal_comparable::getAge));


        //compare by age, if equal then compare by name
//        Collections.sort(st,Comparator.comparing(Animal_comparable::getAge).thenComparing(Animal_comparable::getName));

//        System.out.println(st);

        int a[][]={
                {4,5,2},
                {5,1,2},
                {1,4,7}
        };

        Arrays.sort(a,(arr1, arr2) -> arr1[0] -arr2[0]);

        for(int e[]:a)
        {
            for(int elements:e)
            {
                System.out.print(elements +" ");
            }
            System.out.println();
        }

    }
}
