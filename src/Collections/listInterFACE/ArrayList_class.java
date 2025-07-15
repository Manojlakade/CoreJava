package Collections.listInterFACE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_class {
    //collection inetrface methoads
    //int size()
    //boolean iaEmpty()
    //boolean contains(object 0)
    //boolean add()-returnrns true if added
    //boolean remove()
    //boolean containsALL(Collection<> c)
    //boolean addAll(Collecftion<> c)
    //boolean addAll(Collecftion<> c)

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(list.add(10)); // returns true
        list.add(20);
        list.add(30);
        //list.remove(Integer.valueOf(10));

        //System.out.println(list.get(0));
        list.set(1,22);//change value
        //System.out.println(list);
        list.add(2,29);
        //System.out.println(list);

        //iterator
        Iterator<Integer> fe=list.iterator();
        while(fe.hasNext()){
            System.out.println(fe.next());
        }




    }
}
