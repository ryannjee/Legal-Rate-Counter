/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cw2q3;

/**
 *
 * @author Ryan
 */
import java.util.*;

public class CW2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner(System.in);

    String type1;
    char ask;
    int L=0;
    double amount=0;
do{
    System.out.print("Landed(L) or Non-landed(N):");
    type1=s.nextLine().toUpperCase();
    ask = type1.charAt(0);    
switch(ask)
{
case 'L': 
{ 
    while(amount<=0)
    {
    System.out.print("Loan amount: RM"); //key in loan amount
    amount = s.nextDouble();
    double fee_amount;
    System.out.printf("Your loan amount is: RM%.2f\n" ,amount); //show loan amount
    
if(amount>=700000)
{
fee_amount=amount*0.05; //legal fee amount formula
System.out.println("Legal Fee Rate 5%"); //show legal fee rate 
System.out.printf("Your legal Fee amount: RM %.2f \n" ,fee_amount); //show legal fee amount
System.out.println("Type = Landed"); //show it is landed
}
 
else if(amount>=500000)
{
fee_amount=amount*0.04; //legal fee amount formula
System.out.println("Legal Fee Rate 4%"); //show legal fee rate 
System.out.printf("Your legal Fee amount: RM %.2f \n",fee_amount); //show legal fee amount
System.out.println("Type = Landed"); //show it is landed
}
 
else if(amount>0)
{
fee_amount=amount*0.035; //legal fee amount formula 
System.out.println("Legal Fee Rate 3.5%"); //show legal fee rate 
System.out.printf("Your legal Fee Rate: RM %.2f \n",fee_amount); //show legal fee amount
System.out.println("Type = Landed"); //show it is landed
} 

else
{
System.out.println("Invalid input"); 
//If the user enters incorrect data, this output will be displayed.
}
}
L=0;

break;
} 

case 'N':
{
    while(amount<=0)
    {
    System.out.print("Loan amount: RM"); //key in loan amount
    amount = s.nextDouble();
    double fee_amount;
    System.out.printf("Your loan amount is: RM%.2f\n" ,amount); //show loan amount
    
if(amount>=400000)
{
fee_amount=amount*0.035; //legal fee amount formula
System.out.println("Legal Fee Rate 3.5%"); //show legal fee rate 
System.out.printf("Your legal Fee Rate: RM %.2f \n",fee_amount); //show legal fee amount
System.out.println("Type = Non-Landed"); //show it is non-landed
}

else if(amount>0)
{
fee_amount=amount*0.032; //legal fee amount formula
System.out.println("Legal Fee Rate 3.2%"); //show legal fee rate 
System.out.printf("Your legal Fee Rate: RM %.2f \n",fee_amount); //show legal fee amount
System.out.println("Type = Non-Landed"); //show it is non-landed
}

else
{
System.out.println("Invalid input"); 
//If the user enters incorrect data, this output will be displayed.
}
}
L=0;
}

break;

default:
{
System.out.println("Invalid input"); 
//If the user enters incorrect data, this output will be displayed. 
L=1;

break;
} 
}
}while(L!=0);
} 
}
