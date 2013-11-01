package edu.lehigh.cse216.fall13.bugs.business;

/**
 * Simple User class. Used to identify who submits bugs and who comments on them
 * 
 * 
 * 
 */

public class User{

    private String firstName;
    private String lastName;
    private int userID;

    /**
     * Constructor for the class. Instantiates firstName, lastName, and userID.
     * 
     * @param firstName String of users first name
     * @param lastName	String of users last name
     * @param userID 	Should be a number ID
     */
    public User(String firstName, String lastName, int userID){
	this.firstName = firstName;
	this.lastName = lastName;
	this.userID = userID;
    }

    /**
     * Returns the first name of the user in the form of a String
     */
    public String getFirstName(){
	return firstName;
    }

    /**
     * Returns the last name of the user in the form of a String
     */
    public String getLastName(){
	return lastName;
    }

    /**
     * Returns and int of the user's ID'
     */
    public int getUserID(){
	return userID;
    }

}
