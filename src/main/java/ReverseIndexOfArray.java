import java.util.Scanner;

public class ReverseIndexOfArray {
    public static void main(String[] args) {
        int size, exit;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            do {
                System.out.println("Enter size: ");
                size = scanner.nextInt();
                if (size > 20)
                    System.out.println("Size should not exceed 20");
            }
            while (size > 20);

            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.println("Enter element" + (i + 1) + " : ");
                array[i] = scanner.nextInt();
                i++;
            }
            System.out.println("Property list: ");
            System.out.print("{ ");
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.print("}");

            for (int j=0; j<array.length/2;j++) {
                int temp=array[j];
                array[j]=array[size-1-j];
                array[size-1-j]=temp;

            }
            System.out.printf("\n%-20s","Reverse array: ");
            System.out.print("{ ");
            for(int j:array)
                System.out.print(j+" ");
            System.out.print("}");
            System.out.println("\n"+"Enter 0 to exit, other to continue");
            exit = scanner.nextInt();
            if (exit == 0)
                System.exit(0);
        }
        while (exit != 0);
    }
}

