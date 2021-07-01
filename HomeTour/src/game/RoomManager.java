package game;

import fixtures.Room;

public class RoomManager {
	//static Map<String, String, String> myMap = new HashMap<String, String, String>();
	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		this.rooms = new Room[5];
		Room frontHallWay = new Room(
				"FrontHallway",
				"The entrance of the apartment",
				"The hallway has a door to the front of the apartment." +
				"\n". +"There are stairs leading up to the door.");
		this.rooms[4] = frontHallWay;
		
		Room kitchen = new Room(
				"The Kitchen",
				"An open room kitchen and dining area",
				"The cooking area of a apartment that has the entryway to the apartment. There is a small circular dining table and a fridge next to it." + "\n"
				+ "To the north is the open area livingroom where a flatscreen TV and an L-shaped couch can be seen."
				+ "\n" + "To the west is a small bathroom with a tub and sink.");
		this.rooms[0] = kitchen;
		this.startingRoom = kitchen;
	
		Room livingRoom = new Room("The Livingroom", "Family area with a flatscreen television and two couches.", "In the livingroom, there are two couches that a person can sit on. \n" 
				+ "The kitchen and it's dining table can be seen from the livingroom. \n"
				+ "To the right is the bedroom with a bed and nightstand.");
		this.rooms[1] = livingRoom;
		
		Room bedRoom = new Room("The Bedroom", "A bedroom with a Queen sized bed and nightstand.", 
				"This is where the person sleeps and gets dressed. \n" + "The nightstand " +
				"To the right is the living room where a flatscreen TV and L-shaped couch can be seen. \n");
		this.rooms[2] = bedRoom;
		
		Room bathRoom = new Room("The Bathroom", "A bathroom with a tub and sink that has a mirror attached to the wall.", 
				"This bathroom has a hot tub feature where the person can relax after a long days work. \n" +
		        "To the north is the living room with a flatscreen TV and L-shaped couch." +
				"To the south, the kitchen can be seen with a dining table.");
		this.rooms[3] = bathRoom;
		
		kitchen.setExits(rooms[4], rooms[1], null, rooms[3], rooms[0]); //null was rooms[0];
		livingRoom.setExits(null, rooms[0], rooms[2], null, null);
		bedRoom.setExits(null, rooms[3], rooms[1], null, null);
		bathRoom.setExits(null, rooms[2], null, rooms[0], null);
		frontHallWay.setExits(rooms[0], null, null, null, null);
		
		rooms[0] = kitchen;
		rooms[1] = livingRoom;
		rooms[2] = bedRoom;
		rooms[3] = bathRoom;
		rooms[4] = frontHallWay;
	
	}
}
