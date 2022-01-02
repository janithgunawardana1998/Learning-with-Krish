import java.util.*;

public class Frog{

	public static void main(String []args) { 
int Meaters=0;
                int Jumps=0;
                double Time=0;
		
                System.out.println("Enter The Distance to jumps");	
		Scanner scanner = new Scanner(System.in); 
                Meaters = scanner.nextInt();
                

       while(Meaters >0)
 {
                if(Meaters >=5.0)
                       {  
                                Time += (1.0);
                                Meaters -= (5.0);
				Jumps++;
				
				if(Meaters >= 3.0)  
{
					Time += (2.0);
                                        Meaters -= (3.0);
					Jumps++;
					
					if(Meaters >= 1.0) 
					{
                                                Time += (3.5);
						Meaters -= (1.0);
						Jumps++;
						
					}
					else  {
						if(Meaters != 0) {
							Jumps++;
						}
						break;
					}
				}
				else {
					if(Meaters != 0) {
						Jumps++;
					}
					break;
				}
			}
			else {
				if(Meaters != 0) {
					Jumps++;
				}
				break;
			}
		}
                System.out.println("Frog Get " +Jumps+ " Jumps he took " + String.valueOf(Time)+ " Seconds to finish the Enterd Jumps");
	

               }
     }