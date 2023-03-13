package interview.d;

import java.util.Objects;

public class SomeCorrectClass {

    int x;
    public SomeCorrectClass(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeCorrectClass that = (SomeCorrectClass) o;
        return x == that.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
