
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
/*
1-st Iteration:
only one blank space at start(j) = '_'
Printing will be (k) = _*_*_*_*_*_*_

2nd Iteration:
two blank space at start(j) = '__'
Printing will be (k) = _*_*_*_*_*_*_  ==>1st
		            __*_*_*_*_*_   ==>2nd

3rd Iteration:
three blank space at start(j) = '___'
Printing will be (k) = _*_*_*_*_*_*_  ==>1st
		            __*_*_*_*_*_   ==>2nd				
                       ___*_*_*_*_    ==>3rd

Lastly
Printing will be (k) = _*_*_*_*_*_*_  ==>1st
		            __*_*_*_*_*_   ==>2nd				
                       ___*_*_*_*_    ==>3rd
                       ____*_*_*_     ==>4rth
		            _____*_*_      ==>5th
		            ______*_	      ==>6th




*/

	