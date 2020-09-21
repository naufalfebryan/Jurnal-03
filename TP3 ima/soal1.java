import java.util.Scanner;

class soal1{
    public static void main(String args[]){
	    long x;
		int n;
		long answer;
		Scanner userInput = new Scanner(System.in);
		System.out.println("masukkan jumlah nominal tabungan anda: ");
		x = userInput.nextLong();
		System.out.println("selama berapa hari anda menabung?: ");
		n = userInput.nextInt();
		answer = x * n;
		System.out.println("total tabungan anda selama " + n + " hari sebesar = " + answer);
	}
}	