import java.util.Scanner;
public class toCharArray {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap chuoi: ");
        string = scanner.nextLine();
        char[] arrStr;
        arrStr = string.toCharArray();
        System.out.println("so lan xua hien cua ky tu la: " + checkOccurrences(arrStr));
    }
    public static int checkOccurrences(char[] arr){
        String checkString;
        int count = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhap ky tu muon kiem tra ");
        checkString = scanner1.nextLine();
        char[] stringCheck = checkString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (stringCheck[0] == arr[i]){
                count++;
            }
        }
        return count;
    }
}
