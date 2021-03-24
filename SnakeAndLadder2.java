import java.util.*; 
class SnakeAndLadder2{
public static void main(String[] args){
int start1=0,end=100,count1=0,start2=0;
Random rand1=new Random();
while(start1!=100 && start2!=100){
int Dice1=rand1.nextInt(6)+1;
int Dice2=rand1.nextInt(6)+1;
int Snake_or_ladder1=rand1.nextInt(2);
int Snake_or_ladder2=rand1.nextInt(2);
//System.out.println(count);
if(Snake_or_ladder1==1 && ((start1+Dice1) <=100)){
start1=start1+Dice1;
//System.out.println(Dice);
}
else if( start1 > Dice1){
start1=start1-1;
}
if(Snake_or_ladder2==1 && ((start2+Dice2) <=100)){
start2=start2+Dice2;
//System.out.println(Dice);
}

else if( start2 > Dice2){
start2=start2-1;
}
count1++;
}
if(start1==100)
System.out.println("Player1 own and reached "+ start1 +"but player2 reached "+ start2);
else
System.out.println("Player2 own and reached "+ start2 +"but player1 reached "+ start1);
}




}


