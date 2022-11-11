package dima;

import java.util.Objects;

public class MyClassOwners {
    public MyClassOwners(String name) {
        this.name = name;
    }

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClassOwners that = (MyClassOwners) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MyClassOwners{" +
                "name='" + name + '\'' +
                '}';
    }
}
