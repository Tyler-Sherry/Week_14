public class ItemChoice {

    public static <T extends Comparable<T>>
    T chooseItem(T item1, T item2, T item3) {
        T chosenItem = item1;

        if (item2.compareTo(chosenItem) < 0) {
            chosenItem = item2;
        }
        if (item3.compareTo(chosenItem) < 0) {
            chosenItem = item3;
        }
        return chosenItem;
    }

    public static void main(String[] args) {
        Integer i1 = 5;
        Integer i2 = 7;
        Integer i3 = 1;

        System.out.println(chooseItem(i1, i2, i3));
    }
}
