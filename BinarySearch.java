class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int li = 0;
        int hi = arr.length - 1;
        int mid = (li + hi) / 2;
        int item = 9;
        while (li <= hi) {
            if (arr[mid] == item) {
                System.out.println("item is find at " + mid + " position");
                break;
            } else if (arr[mid] < item) {
                li = mid + 1;
            } else {
                hi = mid + 1;
            }
            mid = (li + hi) / 2;

        }
        if (li > hi) {
            System.out.println("item is not find in the given list");
        }
    }
}
