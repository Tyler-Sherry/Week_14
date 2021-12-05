public class ItemManager {
    public static void main(String[] args) {
        Item<Integer> itemInt = new Item<Integer>(34);
        Item<Character> itemChar = new Item<Character>('l');

        itemInt.updateCount(15);
        itemInt.updateCount(34);

        itemChar.updateCount('f');
        itemChar.updateCount('l');
    }
}