

import java.io.*;
import java.util.Scanner;

   class MyList{
   public MyList firstLink,lastLink;
   int info,size;
   MyList link;
   private MyList next;

   MyList(){
       this.link=null;
       firstLink = null;
       lastLink=null;
   }
   public boolean isEmpty(){
        return(firstLink == null);
    }

    public void showMyList() {
        MyList currentLink = firstLink;
           System.out.print("List: ");
           while(currentLink != null) {
               currentLink.showMyList();
               currentLink = currentLink.lastLink;
           }
           System.out.println("");
       }
}

   public class projectrough {

   public static void main(String[] args){

       MyList newMyList=new MyList();
       Scanner userInput= new Scanner(System.in);

       int userInputNumber;
       System.out.println("Enter Total Data");
       userInputNumber = userInput.nextInt();
           int i=1;
           while(i<=userInputNumber){
           System.out.println("Enter Data "+ i +":");
           i++; 
           newMyList.info=userInput.nextInt();
           }
           if(newMyList.firstLink!=null){
               newMyList=newMyList.firstLink;
               newMyList=newMyList.lastLink;
               newMyList.firstLink=newMyList.firstLink.link;
       }
   }
}

