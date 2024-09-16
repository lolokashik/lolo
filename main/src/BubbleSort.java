public class BubbleSort {

    public BubbleSort() {
        int[] test = new int[]{5, 2, 6, 3, 1, 4,34,45,12,4,2,5,5,5,3123,2,341,3};

        for (int i = 0; i < test.length - 1; i++) {
            for (int j = 0; j < test.length - 1 - i; j++) {
                if (test[j] > test[j + 1]) {
                    int temp = test[j];
                    test[j] = test[j + 1];
                    test[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
    }
}