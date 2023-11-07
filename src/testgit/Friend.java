/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgit;

/**
 *
 * @author Chun On
 */
public class Friend {
    	private String name;
        private int age;
	
	public static int numberOfFriends;
	
	Friend(String name, int age){
		this.name=name;
                this.age=age;
		numberOfFriends++;
	}	
        
        public String nameofFriends() {
            return name;
	}
        
        public int ageofFriends() {
            return age;
        }
}
