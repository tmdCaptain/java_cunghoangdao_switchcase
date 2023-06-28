package Java_02;

import java.util.Scanner;

public class cunghoangdao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y,x;
		do {
			System.out.println(" Nhập tháng sinh của bạn:");
			y = sc.nextInt();	
			if(y>0||y<12)
			
				System.out.println(" Nhập ngày sinh của bạn:");
				x = sc.nextInt();
				if(x<1||x>31) {
					System.out.println(" Bạn đã nhập sai ngày sinh");
					break;
				}
			switch (y) {
			case 1: 

				if(x >=20)
					System.out.println(" Cung bảo bình");
				else if( x < 20)
					System.out.println(" Cung Ma kết");
				break;
			case 2:
				if(x <= 18)
					System.out.println(" Cung bảo bình");
				else if(x > 18)
					System.out.println(" Cung Song Ngư");
				break;
			case 3:
				
				if(x <= 20 )
					System.out.println(" Cung Song Ngư");
				else if( x > 20)
					System.out.println(" Cung Bạch Dương");
				break;
			case 4:
				
				if(x <= 19 )
					System.out.println(" Cung Bạch Dương");
				else if(x > 19)
					System.out.println("Cung Kim Ngưu");
				break;
				
			case 5:
						
				if(x <= 20 )
					System.out.println(" Cung Kim Ngưu");
				else if(x > 20)
					System.out.println("Cung Song Tử");
				break;
						
			case 6:
				
				if(x <= 20 )
					System.out.println(" Cung Song Tử");
				else if(x > 20)
					System.out.println("Cung Cự Giải");
				break;
				
			case 7:
				
				if(x <= 22 )
					System.out.println(" Cung Cự Giải");
				else if(x > 22)
					System.out.println("Cung Sư Tử");
				break;
				
			case 8:
				
				if(x  <= 22 )
					System.out.println(" Cung Sư Tử");
				else if(x > 22)
					System.out.println("Cung Xữ Nữ");
				break;
				
			case 9:
				
				if(x <= 22 )
					System.out.println(" Cung Xữ Nữ");
				else if(x > 22)
					System.out.println("Cung Thiên Bình");
				break;
				
			case 10:
				
				if(x <= 22 )
					System.out.println(" Cung Thiên Bình");
				else if(x > 22)
					System.out.println("Cung Bò Cạp");
				break;
				
			case 11:
				
				if(x <= 21 )
					System.out.println(" Cung Bò Cạp");
				else if(x > 21)
					System.out.println("Cung Nhân Mã");
				break;
				
			case 12:
				
				if(x >= 22 )
					System.out.println(" Cung Ma Kết");
				else if(x < 22)
					System.out.println("Nhân Mã");
				break;
			default:
				System.out.println("Bạn nhập tháng bị sai, xin moi nhap lai tháng xin của bạn");
			}
		}while(x<1||x>31);

	}

}
