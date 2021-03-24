import java.util.*; 
class SnakeAndLadder{
public static void main(String[] args){
int start=0,end=100,count=0;
Random rand1=new Random();
int Dice=rand1.nextInt(6)+1;
int Snake_or_ladder=rand1.nextInt(2);
while(start!=100){
if(Snake_or_ladder==1){
start=start+Dice;
}
else if( start > Dice){
start=start-1;
}
}
}


}


