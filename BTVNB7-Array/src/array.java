import java.util.Scanner;
public class array {
    static void integerarray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng: ");
        int size = scan.nextInt();
        int intarray []= new int[size];
        int max = intarray[0];
        int indexmax = 0;
        int indexmax2 = 0;
        int max2 = intarray [0];
        int min = intarray[0];
        int indexmin = 0;
        for (int i = 0; i< intarray.length;i++){
            System.out.printf("Nhập phần tử thứ %d :", i);
            intarray[i] = scan.nextInt();
        }
        System.out.println("Các phần tử của mảng:");
        for (int i = 0; i< intarray.length; i++){
            System.out.print (intarray[i]+"\t");
        }

        //Tìm phần tử lớn nhất và in ra index của phần tử đó
        for (int i = 0; i< intarray.length;i++){
            if (intarray[i] > max){
                max = intarray [i];
                indexmax = i;
            }
        }
        for (int i = 0; i< intarray.length;i++){
            if (max == intarray[i]){
                continue;
            }
            else if (max2 < intarray[i]){
                max2 = intarray[i];
                indexmax2 = i;
            }
        }
        System.out.println("\n Phần tử lớn nhất của mảng là "+max + " ở vị trí thứ "+indexmax);
        System.out.println("\n Phần tử lớn thứ 2 của mảng là " +max2 + " ở vị trí thứ " +indexmax2);

        for (int i = 0; i< intarray.length;i++){
            if (intarray[i] < min) {
                min = intarray[i];
                indexmin = i;
            }
        }
       System.out.println("\n Phần tử nhỏ nhất của mảnglà "+ min + " ở vị trí thứ "+indexmin);
    }

}