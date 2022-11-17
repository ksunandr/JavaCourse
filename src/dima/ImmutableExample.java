package dima;

import java.math.BigDecimal;
import java.util.*;

public class ImmutableExample {



    public static void main(String[] args) {

        String a = "1234";
        a = "3243";
        a = a + "2321";

        StringBuilder stringBuilder = new StringBuilder("dsd");
        stringBuilder.append("3213");
        stringBuilder.append("3213");

        Integer integer = 10;
        integer = integer + 20;
       // System.out.println("hashCode = " + integer.hashCode());
        integer.intValue();
        BigDecimal bigDecimal = BigDecimal.valueOf(10);
       // System.out.println(bigDecimal.hashCode());
        bigDecimal = bigDecimal.add(BigDecimal.TEN);
        //System.out.println(bigDecimal.hashCode());

      //  System.out.println(stringBuilder);
        String b = stringBuilder.toString();

        //exampleCustomImmutable();
        doExampleMap();
    }

    public static void exampleCustomImmutable() {
        Set<MyClassOwners> myClassOwnersSet = new HashSet<>();
        myClassOwnersSet.add(new MyClassOwners("Kseniia"));
        MyImmutableClass myImmutableClass = new MyImmutableClass( 1, myClassOwnersSet);
      //  System.out.println(myImmutableClass);
      //  System.out.println(myImmutableClass.hashCode());
    }

    public static Set<MyClassOwners> prepareSet1() {
        HashSet<MyClassOwners> firstSet = new HashSet<>();
        firstSet.add(new MyClassOwners("Kseniia"));
        firstSet.add(new MyClassOwners("Dmitrii"));
        return firstSet;
    }

    public static void doExampleMap() {
        Map<MyImmutableClass, String> map = new HashMap<>();
        Set<MyClassOwners> firstSet = prepareSet1();
        MyImmutableClass myValue = new MyImmutableClass(1, firstSet);
        map.put(myValue, "first value");

        System.out.println("get from map by initial value = " + map.get(myValue));
        firstSet.add(new MyClassOwners("111"));

        System.out.println("firstSet changed =" + myValue);
        System.out.println("get from map after firstSet changed = " + map.get(myValue));
//        System.out.println("Current map = " + map);
//        System.out.println("myValue hashCode = " + myValue.hashCode());
        for (Map.Entry<MyImmutableClass, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " equals = " + entry.getKey().equals(myValue));
            System.out.println("entry hashCOde = " + entry.getKey().hashCode());
        }
        Set<MyClassOwners> secondSet = new HashSet<>();
        secondSet.add(new MyClassOwners("Kseniia"));
        secondSet.add(new MyClassOwners("Dmitrii"));
      //  secondSet.add(new MyClassOwners("111"));
        MyImmutableClass secondMyValue = new MyImmutableClass(1, secondSet);
        System.out.println("secondMyValue hashCOde = " + secondMyValue.hashCode());
        System.out.println("secondSet" + secondMyValue.hashCode());

        System.out.println("get from map for secondSet and secondMyValue = " + map.get(secondMyValue));

        myValue.getMyClassOwnersSet().add(new MyClassOwners("dsdsddsd"));
        final int a = 10;
        //a = 20; //error
        System.out.println(myValue);
    }

    public static void doSimpleMapExample() {
        //Map<String, Integer> transportTypeSizeMap = new HashSet<>();
        //String firstKey = "bus";
        //transportTypeSizeMap.put(firstKey, 30);
        //System.out.printLn(transportTypeSizeMap.get(firstKey));
        //
    }


   final static Car constCar = new Car("1", 1);//immutable class is used for creation constants

    void method(){
        HashMap<Car, String> map = new HashMap<>();
        map.put(constCar, "first"); //
    }


}


final class Car {
    private final String color;
    private final Integer numberPlate;

    public Car(String color, Integer numberPlate) {
        this.color = color;
        this.numberPlate = numberPlate;
    }

    public String getColor() {
        return color;
    }

    public Integer getNumberPlate() {
        return numberPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(numberPlate, car.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, numberPlate);
    }
}

