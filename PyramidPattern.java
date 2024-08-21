class ReversePyramid{
public static void main(String [] args){

int i , j ,k ,row=6;

//Outer loop for row
for(i=0 ; i<=row-1 ; i++){
	
	//Inner loop for blank spaces 
	for(j=0; j<=i ; j++){
	System.out.print(" ");
	}
	//Inner loop for column
	for(k=0 ; k<=row-i-1 ; k++){
	System.out.print("*" + " " );
	//or System.out.print("* ");

	}
	//Move cursor to next line		
   System.out.println();
  }	
	
	
}
}	