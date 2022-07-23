package ca.ciccc.assignment8.question4;

public class Question4 {
    public static int[] solution(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]);
        }
        return b;
    }

    public static void main(String[] args) {
        int[] m = {1, 2, 3, 4, 5, 6, 7};
        solution(m, m.length);
    }
}
