import org.jointheleague.graphical.robot.Robot;

public class HelloWorld {
public static void main(String[] args) {
Robot profbot=new Robot();
profbot.penDown();
profbot.setSpeed(10);
for (int i = 0; i < 9; i++) {
	profbot.move(100);
	profbot.turn(360/9);
	
}
profbot.moveTo(5, 5);
}
}
