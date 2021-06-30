package game;

import fixtures.Room;

public class RoomManager {

	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		this.rooms = new Room[4];
		
		Room kitchen = new Room(
				"The Kitchen",
				"An open room kitchen and dining area",
				"The cooking area of a basement apartment that has the entryway to the apartment. There is a small circular dining table and a fridge next to it." + "\n"
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
		
		kitchen.setExits(rooms[0], rooms[1], null, rooms[3]);
		livingRoom.setExits(null, rooms[0], rooms[2], null);
		bedRoom.setExits(null, null, rooms[1], null);
		bathRoom.setExits(null, null, null, rooms[0]);
		
		
		rooms[0] = kitchen;
		rooms[1] = livingRoom;
		rooms[2] = bedRoom;
		rooms[3] = bathRoom;
	
	}
}
