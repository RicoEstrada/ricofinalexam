/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estradafinalexam;

import java.util.Scanner;

/**
 *
 * @author ACER NITRO 5
 */
public class Estradafinalexam {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        User user = new User();
        
        System.out.println("Enter the number of users: ");
        int numUsers= scn.nextInt();
        
        for(int i = 0; i <= numUsers; i++){
            user.addUser(i);
        }
        
        System.out.println("Enter then number of friendship: ");
        int numFriendships = scn.nextInt();
        
        System.out.println("enter the friendships format: (1 2): ");
        for (int i = 0; i < numFriendships; i++){
            int user1 = scn.nextInt();
            int user2 = scn.nextInt();
            user.addFriendship(user1, user2);
        }
        
        System.out.println("Enter a user ID to see their Friends: ");
        int userIdToCheck = scn.nextInt();
        
        user.displayFriend(userIdToCheck);
        scn.close();
    }
    
}
