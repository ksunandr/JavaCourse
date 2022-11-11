package dima;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MyImmutableClass {

    final int integer;

    private final Set<MyClassOwners> myClassOwnersSet;

    public MyImmutableClass(int integer, Set<MyClassOwners> myClassOwnersSet) {
        this.integer = integer;
        //this.myClassOwnersSet = myClassOwnersSet;
        this.myClassOwnersSet = new HashSet<>(myClassOwnersSet);
    }

    public Set<MyClassOwners> getMyClassOwnersSet() {
        return Collections.unmodifiableSet(myClassOwnersSet);
    }

    @Override
    public String toString() {
        return "MyImmutableClass{" +
                "integer=" + integer +
                ", myClassOwnersSet=" + myClassOwnersSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyImmutableClass that = (MyImmutableClass) o;
        return integer == that.integer && Objects.equals(myClassOwnersSet, that.myClassOwnersSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, myClassOwnersSet);
    }
}
