import java.util.Vector;

public class GMT<E> {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector();

        GMT<Number> gmt = new GMT();

        v.add(new Integer(5));

        v.add(new Integer(10));

        gmt.showData(v);

    }

    public void showData(Vector<E> v) {

        for (Object i : v)

            System.out.println(i);

    }

}
