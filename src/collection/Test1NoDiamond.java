package collection;

import java.util.ArrayList;
import java.util.List;

public class Test1NoDiamond {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("1r4444");
        list1.add("1te");
  //      list1.add(1);
        List<Integer> integers = new ArrayList(list1);
     //   List<Integer> integers = new ArrayLis<>(list1); - this leads to compilation error//
//error //int i = null;
//ok //Integer integer = null;

        System.out.println(list1.getClass());
        System.out.println(integers.getClass());

//        for (String s : list1){
//            System.out.println(s.length());
//        }
//
//        for (String s : list1){
//            System.out.println(s.length());
//        }
    }


     class TestTypeErasure {

        <T extends  InterfaceMy, InterfaceMy1> T test(ArrayList<String> as){
             ArrayList<T> list = new ArrayList<>();
             List<Integer> integers1 = new ArrayList<>();

             return list.get(0);
         }


     }


     interface InterfaceMy{};
     interface InterfaceMy1{};

}
