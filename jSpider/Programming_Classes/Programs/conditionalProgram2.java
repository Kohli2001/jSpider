package com;

public class conditionalProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		boolean java = false; 
		boolean Sql = false; 
		boolean WebTech = true;
		
		if(java&& Sql || java && WebTech  ){
			System.out.println("yes eligible for interview");
		}
		else {
			System.out.println("No!  not eligible for interview");
		}
		

		System.out.println("===========================================");
		
//		boolean helmet = false;
//		
//		int speed = 50, speed2 =40;
//		
//		if(helmet&&speed<80 || helmet&&speed2<60) {
//			System.out.println("He can Catch him");
//		}
//		else {
//			System.out.println("Not its couldnt");
//		}
		
		boolean helmet = true;
		int speed = 60;
		if(helmet==true && speed<80 || helmet==false && speed<60){
			
			System.out.println("yes he can find");
		}
		else {
			System.out.println("No!");
		}
			
			
			
			
			
			
			
	}

}
