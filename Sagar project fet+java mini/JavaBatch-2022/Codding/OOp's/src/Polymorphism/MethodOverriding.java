package Polymorphism;
class Game//Parent
{
	public void start()
	{
		System.out.println("Game started!!!!");
	}
	public void stop()
	{
		System.out.println("Game Stoped!!!");
	}
}
class G1_Game extends Game
{
	public void g1_run()
	{
		System.out.println("G1_Game is running-----");
	}
}
class G2_Game extends Game
{
	public void g2_run()
	{
		System.out.println("G2_Game is running-----");
	}
	public void stop()
	{
		super.stop();
		System.out.println("G2_game stoped!!!");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) {
		G1_Game g1=new G1_Game();
		g1.start();
		g1.g1_run();
		g1.stop();
		
		G2_Game g2=new G2_Game();
		g2.start();
		g2.g2_run();
		g2.stop();
		
	}

}








