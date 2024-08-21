class LeftTriangle{
public static void main(String [] args){

int i , j ,row=7;

//Outer loop for row
for(i=0 ; i< row ; i++){
	
	//Inner loop for blank spaces 
	for(j=2*(row-i); j>=0 ; j--){
	System.out.print(" ");
	}
	//Inner loop for column
	for(j=0 ; j<=i ; j++){
	System.out.print("* "); //This Space after '*' is V.IMP 
	}
	//Move cursor to next line		
   System.out.println();
  }	
	
	
}
}	

/*
This Space after '*' is V.IMP if we didnt gave it then O/P will be

C:\Users\DELL\OneDrive\Desktop\Patterns>java LeftTriangle
               *
             **
           ***
         ****
       *****
     ******
   *******




*/