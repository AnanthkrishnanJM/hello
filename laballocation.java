package ananth;

import java.util.Scanner;

public class laballocation {
		public static void main(String[] args) {
			Scanner a=new Scanner(System.in);
			int x=a.nextInt();
			int y=a.nextInt();
			int z=a.nextInt();
			int n=a.nextInt();
			
			
			if(n<=x) {
				System.out.println("L1");
				}
				else if(n<=y) {
					System.out.println("L2");
					}
					else if(n<=z) {
						System.out.println("L3");
					}else {
						System.out.println("no lab can accommodate");
				
			}

		}

	

	}


