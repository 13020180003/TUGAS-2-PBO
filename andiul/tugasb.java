/* 	Nama 	: Andi Nur ulfa damayanti
	Tanggal : 16 Maret 2020
	Waktu	: 23:45
*/

public class tugasb{
	public static void main(String[] args){
			int d, m, j, sis1, sis2;
			d = 5200;

		j = d/3600;
		sis1 = d%3600;

		m = (int) sis1/60;
		sis2 = sis1%60;

		System.out.println("Hasil : " + d + " detik = " + j + " jam : " + m + " menit : " + sis2 + " detik");
	}
}
	