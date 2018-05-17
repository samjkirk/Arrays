public class arraysMain {
    public static void main(String[] args) {
        int[] arrayofInts = {1,3,6,9,10,14,19,25,30,100};
        Arrays a = new Arrays();

        for (int i = 0; i<arrayofInts.length; i++) {
            System.out.println(a.calc(i,arrayofInts[i],false));
        }
    }
}
