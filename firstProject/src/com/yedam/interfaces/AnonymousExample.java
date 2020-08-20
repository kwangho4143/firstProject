package com.yedam.interfaces;

class Anonymous {
   void run() {
      System.out.println("실행");
   }
}

class ChildAnonymous extends Anonymous {
   
}

interface AnonymInterface {
   void run();
}

public class AnonymousExample {
   public static void main(String[] args) {
      AnonymInterface anonymintf = new AnonymInterface() {

         @Override
         public void run() {
        	 System.out.println("자식 구현 객체 실행.");
         }
         
      };
      anonymintf.run();
      
      Anonymous anonym = new Anonymous() {
         String srt;
                  
         @Override
         void run() {
            System.out.println("자식 실행");
         }
         
      };
      anonym.run();
   }
}






