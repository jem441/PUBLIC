package game;

import java.util.Scanner;



public class Main {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			RoomManager rm = new RoomManager();
			rm.init();
			int i = 0;
			Player player = new Player();
			player.currentRoom = rm.startingRoom;
			
			while (i == 0) {
				printRoom(player);
				String[] command = collectInput();
				parse(command, player);
			}	
			scan.close();
	} 
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.getName());
		System.out.println(player.currentRoom.getShortDescription());
		System.out.println(player.currentRoom.getLongDescription());
		player.currentRoom.getExits();
	}

	private static String[] collectInput() {
		System.out.println("Where would you like to go?");
		String[] command = scan.nextLine().toLowerCase().split(" ");
		return command;
	}
	
	
	private static void parse(String[] command, Player player) {
		System.out.println(command[0]);
		System.out.println(command[1]);
		
		if (command[0].equals("go")) {
			player.currentRoom = player.currentRoom.getExit(command[1]);
		}	else if (command[0] == "quit") {
			System.exit(0);
		} else {
			System.out.println("Please enter a correct command \n");
		}
	}
}


