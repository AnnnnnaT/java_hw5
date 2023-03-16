public class task3 {
    public static void main(String[] args) {

        int[] arr = { 900, -193, 0, 1, 15, 3 };

        Heapsort heap = new Heapsort();

        System.out.println("Массив до сортировки: ");
        heap.print(arr);

        heap.sort(arr);

        System.out.println("Отсортированный массив: ");
        heap.print(arr);
    }
}
