/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgit;

/**
 *
 * @author Chun On
 */
public class Main {
    	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Spongebob",12);
		Friend friend2 = new Friend("Patrick",14);
		Friend friend3 = new Friend("Patrick",16);
		
		System.out.println(Friend.numberOfFriends);
                System.out.println(friend1.nameofFriends());
                System.out.println(friend1.ageofFriends());
	}
}
