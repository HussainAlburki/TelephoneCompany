/*TelephoneCompany created in Java, in the company the user is able to chose different types of smartphones 
then they will be able to chose the specifications of the phone , 
eventually the price can be calculated due to the chosen specifications.
 OOP concept is using here in this code with several classes and functions as well as interfaces used here in this code. 
 All cases are considered, every part is calculated.
  Finally, error EXCEPTIONS and catch used here to correct the mistakes made by the user
   in order not to terminate the program
*/
package telephonecompany;

import java.util.Scanner;


/**
 *
 * @author Hussain
 */
public class TelephoneCompany {
    public static void main(String[] args) {
       Scanner cin=new Scanner(System.in);
       int flag=1;//assiginig the flag to be used in loops
       
         double PrPrice=0;  
         double MemPrice = 0;
         double StorPrice=0;
         double CamPrice=0;
         double ScTyPrice=0;
         double BatPrice=0;
         double PencilPrice=0;
         double GamePadPrice=0;
         double TotalPrice=0;
    
     
        System.out.println("Dear Customer Welcome to our Company.");
        System.out.print("We have three different types of SmartPhones.\nPlease write (P for Pro),(G for Gaming)or (N for Note)."); 
        String strPT=cin.next();
        char PhoneType=strPT.charAt(0);//Getting first letter from the string
        
        switch (PhoneType) 
        {
    case 'P': //In case of Pro We will have same try and catch Block repetedely 
    ProPhone Pro=new ProPhone(); //Creting the Pro Object
    System.out.println("We may ask you the SmartPhone specification?(e.g Processor, Memory, etc.)");
       
    //For Processor
    do{
        try{
        System.out.print("Please Write the Processor name and number(With No Space and considering the first letter in upper case.).");
           String PrName = cin.next();//getting the Processor Name
        PrPrice=Pro.Processor(PrName);//callling the functino and assigning the return value to the price.
        if(PrPrice== -1.0) //in case of returning -1 the processor name is invalid so we will keep trying
            throw new SorryMyBad();
        
         flag=0;// if the throw did not run we will change the flag in order to exit the loop.  
        
                }catch(SorryMyBad gg)
                {
                   System.out.println("This Processor type is NOT Avaliable.\nTry Again..");
                }
    }while(flag==1);
    
         //Same Things Explained above will be used below.
        //For Memory
        flag=1;//assigning the flag back to 1 to enter the new loop again.(It is used every time before the loops)
        do{
            
          try{
        System.out.print("Please Write the Memory GB size wanted as an integer.");
        int memory = cin.nextInt();
       MemPrice=Pro.Memory(memory);
        if(MemPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Memory Size is NOT Avaliable.\nTry again..");
                }
        }while(flag==1);
        flag=1;
        
        
             //For Storage
             do{
          try{
        System.out.print("Please Write the Storage GB size wanted as an integer.");
        int storage = cin.nextInt();
        StorPrice=Pro.Storage(storage);
        if(StorPrice == -1)
            throw new SorryMyBad();
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.print("This Storage Size is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             
             
             //For Camera
             do{
              try{
        System.out.print("Please Write the Camera Power wanted as an integer.");
        int camera=cin.nextInt();
        CamPrice=Pro.Camera(camera);
        if(CamPrice == -1)
            throw new SorryMyBad(); 
     
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Camera Power is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             
             
             //Screen Technology
             do{
          try{
        System.out.print("Please Write the Screen Technology Type name(in upper case letters).");
        String ScType=cin.next();
        ScTyPrice=Pro.ScreenTechnology(ScType);
        if(ScTyPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This ScreenTechnology type is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
          
             flag=1;
             
             
             //For Battery
             do{
              try{
        System.out.print("Please Write the Battery Power wanted as an integer in mAh.");
        int BatteryPw=cin.nextInt();
        BatPrice=Pro.Bettery(BatteryPw);
        if(BatPrice == -1)
            throw new SorryMyBad();  
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Battery Power is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
                break;
                //END OF PRO
                
                
                
                
                //Gaming Phone
                 case 'G':     
                GamingPhone Gaming=new GamingPhone();
                    System.out.println("We may ask you the SmartPhone specification?(e.g Processor, Memory, etc.)");
       
    //For Processor
    do{
        try{
        System.out.println("Please Write the Processor name and number(With No Space).");
           String PrName = cin.next();
        PrPrice=Gaming.Processor(PrName);
        if(PrPrice== -1.0)
            throw new SorryMyBad();
        
         flag=0;
                }catch(SorryMyBad gg)
                {
                   System.out.println("This Processor type is NOT Avaliable.\nTry Again..");
                }
    }while(flag==1);
    
    
        //For Memory
        flag=1;
        do{
        try{
        System.out.println("Please Write the Memory GB size wanted as an integer.");
        int memory = cin.nextInt();
       MemPrice=Gaming.Memory(memory);
        if(MemPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Memory Size is NOT Avaliable.\nTry again..");
                }
        }while(flag==1);
        flag=1;
        
        
             //For Storage
             do{
          try{
        System.out.print("Please Write the Storage GB size wanted as an integer.");
        int storage = cin.nextInt();
        StorPrice=Gaming.Storage(storage);
        if(StorPrice == -1)
            throw new SorryMyBad();
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.print("This Storage Size is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1; 
             
             
             //For Camera
             do{
              try{
        System.out.print("Please Write the Camera Power wanted as an integer.");
        int camera=cin.nextInt();
        CamPrice=Gaming.Camera(camera);
        if(CamPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Camera Power is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             
             
             //Screen Technology
             do{
          try{
        System.out.print("Please Write the Screen Technology Type name(in upper case letters).");
        String ScType=cin.next();
        ScTyPrice=Gaming.ScreenTechnology(ScType);
        if(ScTyPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This ScreenTechnology type is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             
             
             //For Battery
             do{
              try{
        System.out.print("Please Write the Battery Power wanted as an integer in mAh.");
        int BatteryPw=cin.nextInt();
        BatPrice=Gaming.Bettery(BatteryPw);
        if(BatPrice == -1)
            throw new SorryMyBad();  
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Battery Power is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
              System.out.println("Would you like a GamePad with the Phone?(Y for Yes, N for NO)");//Asking for a GamePad
                                  String answer=cin.next();
                                  char Ans=answer.charAt(0);
                                  if(Ans=='Y')
                                      GamePadPrice=Gaming.Gamepad;//If yes it will add the price to GamePadPrice to be calculated later.
                break;
       //END OF GAMING
                
                
                
                
                
                //Note Object
                 case 'N':
      NotePhone Note=new NotePhone();
      System.out.println("We may ask you the SmartPhone specification?(e.g Processor, Memory, etc.)");
  
    //For Processor
    do{
        try{
        System.out.println("Please Write the Processor name and number(With No Space).");
           String PrName = cin.next();
        PrPrice=Note.Processor(PrName);
        if(PrPrice== -1.0)
            throw new SorryMyBad();
        
         flag=0;
                }catch(SorryMyBad gg)
                {
                   System.out.println("This Processor type is NOT Avaliable.\nTry Again..");
                }
    }while(flag==1);
      flag=1;
      
      
        //For Memory
        do{
          try{
        System.out.println("Please Write the Memory GB size wanted as an integer.");
        int memory = cin.nextInt();
       MemPrice=Note.Memory(memory);
        if(MemPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Memory Size is NOT Avaliable.\nTry again..");
                }
        }while(flag==1);
        flag=1;
             //For Storage
             do{
          try{
        System.out.print("Please Write the Storage GB size wanted as an integer.");
        int storage = cin.nextInt();
        StorPrice=Note.Storage(storage);
        if(StorPrice == -1)
            throw new SorryMyBad();
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.print("This Storage Size is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             //For Camera
             do{
              try{
        System.out.print("Please Write the Camera Power wanted as an integer.");
        int camera=cin.nextInt();
        CamPrice=Note.Camera(camera);
        if(CamPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This Camera Power is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             
             
             //Screen Technology
             do{
          try{
        System.out.print("Please Write the Screen Technology Type name(in upper case letters).");
        String ScType=cin.next();
        ScTyPrice=Note.ScreenTechnology(ScType);
        if(ScTyPrice == -1)
            throw new SorryMyBad(); 
        
        flag=0;
                }catch(SorryMyBad gg)
                {
                    System.out.println("This ScreenTechnology type is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
             flag=1;
             
             
             //Battery
             do{
              try{
        System.out.print("Please Write the Battery Power wanted as an integer in mAh.");
        int BatteryPw=cin.nextInt();
        BatPrice=Note.Bettery(BatteryPw);
        if(BatPrice == -1)
            throw new SorryMyBad();  
        
        flag=0;
              }catch(SorryMyBad gg)
                {
                    System.out.println("This Battery Power is NOT Avaliable.\nTry again..");
                }
             }while(flag==1);
              System.out.println("Would you like a Pincil with the Phone?(Y for Yes, N for NO)");//Asking the User for Pencil
              String answer1=cin.next();//Getting the answer
              char Ans1=answer1.charAt(0);
              if(Ans1=='Y')
               PencilPrice=Note.Pencil;//The Price will be got in order to be calculated later
            
              break;
              //END OF NOTE
        
        }//END OF Switch case
         
     TotalPrice=PrPrice+MemPrice+StorPrice+CamPrice+ScTyPrice+BatPrice+PencilPrice+GamePadPrice;// Calculateing the Price(GamePadPrice and PencilPrice are considered 0 in case of Pro or the user does not want. 
        System.out.println("\nThe Total Price of the phone is:"+TotalPrice);
        System.out.println("Dear client we are glad to serve you we hope to see you again.\n\nHave a nice day...");
        
        
   // System.out.println("Processor Name is:"+PrPrice+"\nMemory Price is:"+MemPrice+"\nStorage Price is:"+StorPrice+"\nCamera Price is:"+CamPrice+"\nScreenTY is:"+ScTyPrice+"\nBattery is:"+BatPrice); // For Trying to Check The Prices
    }
    
  
    
}
