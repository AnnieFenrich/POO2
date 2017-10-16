package annie;
import robocode.*;
import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngle;

public class Tatiane extends AdvancedRobot
{

	//vari‡veis para se desviar das balas
	private double previousEnergy = 100;
	private int movementDirection = 1;
	private double gunTurnAmt;	
	static int i=0;
	static int teimosia=20;

	public void run() {
		//Trocando as cores do robo
		setBodyColor(Color.black);
		setGunColor(Color.gray);
		setScanColor(Color.white);
		setRadarColor(Color.gray);
		setBulletColor(Color.black);

		//Enquanto não há nenhum evento ocorrendo
		while(true) {
			ahead(100);
			turnGunLeft(180);
			ahead(500);
			turnGunLeft(180);
			turnRight(380);
			turnGunLeft(180);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		if(getEnergy() < 50){
			setTurnRight(e.getBearing() + 90 - 30*movementDirection);
			// Se o robot tem uma pequena descida de vida, assume que ele disparou
			double changeInEnergy = previousEnergy - e.getEnergy();
			if (changeInEnergy > 0 && changeInEnergy <= 3) {
				// Esquiva-se
				movementDirection = -movementDirection;
				setAhead((e.getDistance() / 4 + 25) * movementDirection);
			}
		} else {
			if(i%teimosia==0){
			    turnGunRight(180);
				stop(); 
				fire(3);
			} else {
			    double gunTurnAmt = normalRelativeAngle(e.getBearing() + (getHeading() - getRadarHeading()));
			    setTurnGunRight(gunTurnAmt);
				stop(); 
				fire(3);
			}
		i++;
		}
	}

	public void onHitByBullet(HitByBulletEvent e) {
		//Quando leva um tiro de outro robo
		gunTurnAmt -= 135;
		turnRight(gunTurnAmt);
		ahead(getBattleFieldWidth()/4);
	}
	
	public void onHitWall(HitWallEvent e) {
		//Quando atingir a parede
		if(getX() == 0){
			turnLeft(90);
			ahead(300);
		} else {
			turnRight(90);
			ahead(300);
		}
	}
	
	public void onHitRobot(HitRobotEvent e) {
		//Quando bater em outro robo
		turnGunRight(e.getBearing() + getHeading() - getGunHeading());
		stop(); 
		fire(3);
	}	

	public void onBulletHit(BulletHitEvent event) {
		//Quando você acertar um tiro em outro robo
		stop(); 
		setFire(0.1);
   }	
}
