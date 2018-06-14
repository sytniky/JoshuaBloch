public class Equals {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equals equals = (Equals) o;

        if (id != equals.id) return false;
        return name != null ? name.equals(equals.name) : equals.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {

    }
}
