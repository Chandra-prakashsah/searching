class LinearSearchInteger {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 1, 4, 2 };
        int item = 1;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.print("item is find at " + i + " index position");
                temp++;
            }
        }
        if (temp == 0) {
            System.out.print("element is not find in given list");
        }
    }
}