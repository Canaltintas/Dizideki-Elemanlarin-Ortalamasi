import java.util.Scanner;
import java.util.Arrays;
public class main {
    static int[] addItem(int[] array){

        for (int i=0;i< array.length;i++){

            array[i]=(int) (Math.random()*100);


        }
        Arrays.sort(array);

        return array;
    }
    static double average(int[] array){

        double sum=0;
        for (int i:array){
            sum +=1.0/i;
        }
        sum = array.length / sum;
        return sum;
    }

    public static void main(String[] args) {
        int boundary;
        Scanner input=new Scanner(System.in);

        System.out.print("Dizinin kaç elemanlı olacağını giriniz : ");
        boundary=input.nextInt();
        int[] array = new int[boundary];
        addItem(array);
        System.out.println("Harmonik Ortalama : "+ average(array));
        System.out.println(Arrays.toString(array));



    }
}
