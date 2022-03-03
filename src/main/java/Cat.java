import java.util.Objects;

public class Cat {
    private String say;

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(say, cat.say);
    }

    @Override
    public int hashCode() {
        return Objects.hash(say);
    }
}

