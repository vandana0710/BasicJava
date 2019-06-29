package basic.MyInheritance;

public class GamesTest {
	public static void main(String[] args) {
		Games gobj = new Games();
		gobj.noOfPlayers();

		System.out.println("------------------------------");

		Games obj = new OutDoorGames();
		obj.noOfPlayers();

		System.out.println("------------------------------");

		OutDoorGames gobj1 = new OutDoorGames();
		gobj1.noOfPlayers();

		System.out.println("------------------------------");

		OutDoorGames gobj2 = new Cricket();
		gobj2.noOfPlayers();

		System.out.println("------------------------------");

		IndoorGames iObj = new IndoorGames();
		iObj.noOfPlayers();

		System.out.println("------------------------------");

		IndoorGames iObj1 = new Badminton();
		iObj.noOfPlayers();

		System.out.println("------------------------------");

		Badminton bObj = new Badminton();
		bObj.noOfPlayers();
		bObj.equipmentRequired();

		System.out.println("------------------------------");

		Cricket cObj = new Cricket();
		cObj.noOfPlayers();
		cObj.equipmentRequired();
		

	}
}
