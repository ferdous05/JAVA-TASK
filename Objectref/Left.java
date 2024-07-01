/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectref;

/**
 *
 * @author BC
 */

import java.util.Scanner;
public class Left {
    
    
    
    





    
       public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int L= input.nextInt();
		System.out.print("Enter Total photos: ");
		int N= input.nextInt();
		UploadPhoto Obj = new UploadPhoto();
		System.out.println("Enter Height and width of the photo ");
		

		for(int i=0;i<N;i++)
		{
			System.out.print("Height: ");
			int H=input.nextInt();
			System.out.print("Width: ");
			int W=input.nextInt();
			Obj.Upload(L, W, H);

		}

		

	}

}
    
    
    
    
    

