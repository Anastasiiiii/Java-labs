public class lab_2 {
    public static void main(String args[])
    {
        float [][] a = {
                {1.2F, 1.3F, 1.4F},
                {2.4F, 1.5F, 1.7F},
                {3.2F, 4.1F, 0.3F}
        };
        System.out.println("Початкова матриця");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                float temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println("Транспонована матрица");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        float sum;
        for(int j = 0; j < matrix[0].length; j++){
            sum = 0.0f;
            for(int i = 0; i < matrix.length; i++){
                sum = sum + matrix[j][i];
            }
            float average = sum/matrix.length;
            System.out.println("Середнє значення елементів " + j + " рядка: " + average);
        }
    }

}
