package com.angel1107.shuangseqiu;

public class Lottery {
	 public  int  red;
     public  int  blue;
    
     public  int  startRed(){
     
      double r=Math.random();
     
     
      return (int)(r*33)+1;//产生1-33的随机数
     
     }
    
     public  void  startBlue(){
           
      double r=Math.random();
      System.out.println( (int)(r*16)+1); // 产生1-16的随机数
           
     }
}
