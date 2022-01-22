class LinearSearchString {
    public static void main(String[] args) {
        String[] s = { "ram", "ck", "pk", "rk" };
        String item = "ck";
        int temp = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == item) {
                System.out.print("item is find at " + i + " index position");
                temp++;
            }
        }
        if (temp == 0) {
            System.out.print("item is not find in the list");
        }
    }
}
