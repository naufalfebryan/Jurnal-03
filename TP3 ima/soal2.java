import java.util.Scanner;

class soal2{
    public static void main(String args[]){
		int n;
		Scanner userInput = new Scanner(System.in);
		String userName;
		
		// Masukkan nama anda and press Enter
		System.out.println("siapa namamu? ");
		userName = userInput.nextLine();
		
		System.out.println("umur kamu berapa? ");
		n = userInput.nextInt();
		System.out.println("Halo,  " + userName);
		System.out.println("Ternyata umur kamu baru " + n + " ya!");
	}
}	