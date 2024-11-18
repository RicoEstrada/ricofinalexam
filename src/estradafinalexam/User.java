/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estradafinalexam;

/**
 *
 * @author ACER NITRO 5
 */
public class User {
    class Node{
        private int userId;
        private int[] friends;
        private int numfriends;
        
        public Node(int userId){
            this.userId = userId;
            this.friends = new int[5];
            this.numfriends = 0;
            
        }
        
        public int getUserId(){
            return this.userId;
        }
        public void addFriend(int friendId){
            if (numfriends < 5){
                friends[numfriends++] = friendId;
            }
        }
        public void displayFriend(){
            if (numfriends == 0){
                System.out.println("No Friends found so sad");
            }else{
                for(int i = 0 ; i < numfriends ; i++){
                    System.out.println(friends[i] + "");
                }
            }
        }
    }
    private Node[] users;
    private int numUsers;
    
    public User(){
        this.users = new Node[10]; // limit lang sa friends because Friends have limits its true...
        this.numUsers = 0;
    }
    public void addUser(int userId){
        if (numUsers < 10){
            users[numUsers++] = new Node(userId);
        }
    }
    public Node getUserById (int userId){
        for (int i = 0; i < numUsers; i++){
          if (users[i].getUserId() == userId){
              return users[i];
          }     
        }
        return null;
    }
    public void addFriendship(int userId1, int userId2){
        Node user1 = getUserById(userId1);
        Node user2 = getUserById(userId2);
    
        if(user1 != null && user2 != null){
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }
    
    public void displayFriend(int userId){
        Node user = getUserById(userId);
        if (user != null){
            System.out.println("Friend of user " + userId + ": ");
            user.displayFriend();
            System.out.println();
        }else{
            System.out.println("User not found.");
        }
    }
}