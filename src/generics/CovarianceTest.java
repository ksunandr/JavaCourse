package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CovarianceTest {

    /*arrays in java are Covariant
     *      If Cat is subtype of Animal, then array of Cat  is subtype of array of Animal     */

    /*invariance - there is no inheriting in type of type.
     * If Cat is subtype of Animal, then List<Cat> is not subtype of List<Animal>
      so List<> is invariant  */
    public static void main(String[] args) {
        Cat c = new Cat();
        Animal a = c;/// OK

        Animal aa = new Animal();
        Cat cc = c;/// OK auto casting

        System.out.println(cc);

        Cat[] arrayOfAnimal = new Cat[]{new Cat(), new Cat()};
        Animal[] arrayOfCats = arrayOfAnimal; //OK
        System.out.println(arrayOfCats);


        String[] strings = new String[]{"a", "b", "c"};
        Object[] arr = strings;
       // arr[0] = 42; // ArrayStoreException. Runtime Exception


        List<Cat> catList = new ArrayList<>();
        // List<Animal> animalList =  catList; //compilation mistake


        List<Integer> ints = Arrays.asList(1, 2, 3);
        //List<Number> nums = ints; // compile-time error.
        // nums.set(2, 3.14);

        /* BUT List<> might be Covariant  - you have to use Wildcard - '?' and extends */
        List<Integer> ints1 = new ArrayList<Integer>();
        List<? extends Number> nums1 = ints;
        /* Also List<> might be contravariant  - you have to use Wildcard - '?' and  super*/
        List<Number> nums2 = new ArrayList<Number>();
        List<? super Integer> ints2 = nums2;


  /*****/
        List<? extends A> la;
        la = new ArrayList<B>();
        la = new ArrayList<C>();
        la = new ArrayList<D>();

        List<? super B> lb;
        lb = new ArrayList<A>(); //fine
       // lb = new ArrayList<C>(); //will not compile


    }
    public void someMethod(List<? extends B> lb) {
        B b = lb.get(0); // is fine
        //lb.add(new B()); //will not compile as we do not know the type of the list, only that it is bounded above by B
    }

    public void otherMethod(List<? super B> lb) {
      //  B b = lb.get(0); // will not compile as we do not know whether the list is of type B, it may be a List<A> and only contain instances of A
        lb.add(new B()); // is fine, as we know that it will be a supertype of A
       // lb.add(new A()); // doesn't work
    }
}
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

class Animal {

}

class Cat extends Animal {

}
