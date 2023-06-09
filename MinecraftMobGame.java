// Group members: Arham Ahmed, Dang-Uy Nguyen, Daniel Bajulaiye, Shayan Khan
/* This game is about using your resources wisely in order to live as long as possible
*/

// Dang's code
import java.util.Scanner;
import java.util.Random;

public class MinecraftMobGame{

   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      
      Random rd = new Random();
      
      // string list of enemies is created
      String[] enemies = { "Zombie", "Creeper", "Skeleton", "Spider" };
      
      // attributes of player and items that the player carries
      int hearts = 15;
      int porkChop = 2;
      int weakAcid = 4;
      int strongAcid = 2;
      int trapChance = 10;
      int stunGrenade = 4;
      int score = 0;
      
      boolean running = true;
      
      System.out.println("Welcome to the Minecraft Mob Game!");
      System.out.println("Enter your name: ");
      String player = scan.nextLine();
            
      GAME: while (running){
      
         // obtains (from the array) and prints out the enemy that has spawned 
         String enemy = enemies[rd.nextInt(enemies.length)];
         System.out.println(enemy + " appeared");
         System.out.println();
         
         // if enemy is Zombie, the Zombie's hearts will be equal to random number from 1-5
         if (enemy == "Zombie"){
            int enemyHearts = rd.nextInt(5) + 1;
            while (enemyHearts > 0){
               System.out.println(player + "'s hearts: " + hearts);
               System.out.println(enemy + "'s hearts: " + enemyHearts);
               System.out.println("What would you like to do?");
                     
               // choices for user
               System.out.println("Attack the " + enemy + " (Enter 1)");
               System.out.println("Eat a pork chop (Enter 2)");
               System.out.println("Use a weak acid against the " + enemy + " (Enter 3)");
               System.out.println("Use a strong acid against the " + enemy + " (Enter 4)");
               System.out.println("Use a stun grenade against the " + enemy + " (Enter 5)");
               String input = scan.nextLine();
               System.out.println();
            
               // Shayan's code       
               // if user enters "1", damage done is 4 and damage taken is 3
               if (input.equals("1")){
                  int damageDone = 4;
                  int damageTaken = 3;
                     
                  enemyHearts -= damageDone;
                  hearts -= damageTaken;
                  
                  score += damageDone;
                     
                  System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                  System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                  System.out.println("Your score is " + score);
                  
                  // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

               }
                     
               // if user enters "2", and if user has more than 0 pork chops, they gain 1 heart
               else if (input.equals("2")){
                  if (porkChop > 0){
                     hearts += 2;
                     porkChop--;
                     System.out.println(player + " ate the pork chop. You gained 1 heart. You now have " + hearts + " remaining and " + porkChop + " pork chops remaining.");
                  }
                  else{
                     System.out.println("You have no pork chops left!");
                  }
               }
               
               // Daniel's code   
               // if user enters "3", and if user has more than 0 weak acids, damage done is 2 and damage taken is 1 
               else if (input.equals("3")){
                  if (weakAcid > 0){
                     int damageDone = 2;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     weakAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no weak acids left!");
                  }
               }
                     
               // if user enters "4", and if user has more than 0 strong acids, damage done is 3 and damage taken is 2
               else if (input.equals("4")){
                  if (strongAcid > 0){
                     int damageDone = 3;
                     int damageTaken = 2;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     strongAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no strong acids left!");
                  }
               }
               
               // Arham's code
               // if user enters "5", and if user has more than 0 stun grenades, damage done is 4 and damage taken is 1
               else if (input.equals("5")){
                  if (stunGrenade > 0){
                     int damageDone = 4;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     stunGrenade--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no stun grenades left!");
                  }
               }
               // if user enters invalid command
               else{
                  System.out.println("Invalid command!");      
                  }
               }
            }
         // Dang's code     
         // if enemy is Creeper, the Creeper's hearts will be equal to random number from 6-10   
         else if (enemy == "Creeper"){
            int enemyHearts = rd.nextInt(5) + 6;
            while (enemyHearts > 0){
               System.out.println(player + "'s hearts: " + hearts);
               System.out.println(enemy + "'s hearts: " + enemyHearts);
               System.out.println("What would you like to do?");
                     
               // choices for user
               System.out.println("Attack the " + enemy + " (Enter 1)");
               System.out.println("Eat a pork chop (Enter 2)");
               System.out.println("Use a weak acid against the " + enemy + " (Enter 3)");
               System.out.println("Use a strong acid against the " + enemy + " (Enter 4)");
               System.out.println("Use a stun grenade against the " + enemy + " (Enter 5)");
               String input = scan.nextLine();
               System.out.println();
            
               // Shayan's code       
               // if user enters "1", damage done is 4 and damage taken is 3
               if (input.equals("1")){
                  int damageDone = 4;
                  int damageTaken = 3;
                     
                  enemyHearts -= damageDone;
                  hearts -= damageTaken;
                  
                  score += damageDone;
                     
                  System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                  System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                  System.out.println("Your score is " + score);
                  
                  // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

               }
                     
               // if user enters "2", and if user has more than 0 pork chops, they gain 2 hearts
               else if (input.equals("2")){
                  if (porkChop > 0){
                     hearts += 2;
                     porkChop--;
                     System.out.println(player + " ate the pork chop. You gained 1 heart. You now have " + hearts + " remaining and " + porkChop + " pork chops remaining.");
                  }
                  else{
                     System.out.println("You have no pork chops left!");
                  }
               }
               
               // Daniel's code     
               // if user enters "3", and if user has more than 0 weak acids, damage done is 2 and damage taken is 1 
               else if (input.equals("3")){
                  if (weakAcid > 0){
                     int damageDone = 2;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     weakAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

                  }
                  else{
                     System.out.println("You have no weak acids left!");
                  }
               }
                     
               // if user enters "4", and if user has more than 0 strong acids, damage done is 3 and damage taken is 2
               else if (input.equals("4")){
                  if (strongAcid > 0){
                     int damageDone = 3;
                     int damageTaken = 2;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     strongAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

                  }
                  else{
                     System.out.println("You have no strong acids left!");
                  }
               }
               
               // Arham's code
               // if user enters "5", and if user has more than 0 stun grenades, damage done is 4 and damage taken is 1
               else if (input.equals("5")){
                  if (stunGrenade > 0){
                     int damageDone = 4;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     stunGrenade--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

                  }
                  else{
                     System.out.println("You have no stun grenades left!");
                  }
               }
               // if user enters invalid command
               else{
                  System.out.println("Invalid command!");      
                  }
               }
            }
            
         // Dang's code
         // if enemy is Skeleton, the Skeleton's hearts will be equal to random number from 11-15
         else if (enemy == "Skeleton"){
            int enemyHearts = rd.nextInt(5) + 11;
            while (enemyHearts > 0){
               System.out.println(player + "'s hearts: " + hearts);
               System.out.println(enemy + "'s hearts: " + enemyHearts);
               System.out.println("What would you like to do?");
                     
               // choices for user
               System.out.println("Attack the " + enemy + " (Enter 1)");
               System.out.println("Eat a pork chop (Enter 2)");
               System.out.println("Use a weak acid against the " + enemy + " (Enter 3)");
               System.out.println("Use a strong acid against the " + enemy + " (Enter 4)");
               System.out.println("Use a stun grenade against the " + enemy + " (Enter 5)");
               String input = scan.nextLine();
               System.out.println();
            
               // Shayan's code       
               // if user enters "1", damage done is 4 and damage taken is 3
               if (input.equals("1")){
                  int damageDone = 4;
                  int damageTaken = 3;
                     
                  enemyHearts -= damageDone;
                  hearts -= damageTaken;
                  
                  score += damageDone;
                     
                  System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                  System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + " You now have " + hearts + " hearts left.");
                  System.out.println("Your score is " + score);
                  
                  // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

               }
                     
               // if user enters "2", and if user has more than 0 pork chops, they gain 2 hearts
               else if (input.equals("2")){
                  if (porkChop > 0){
                     hearts += 2;
                     porkChop--;
                     System.out.println(player + " ate the pork chop. You gained 1 heart. You now have " + hearts + " remaining and " + porkChop + " pork chops remaining.");
                  }
                  else{
                     System.out.println("You have no pork chops left!");
                  }
               }
               
               // Daniel's code     
               // if user enters "3", and if user has more than 0 weak acids, damage done is 2 and damage taken is 1 
               else if (input.equals("3")){
                  if (weakAcid > 0){
                     int damageDone = 2;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     weakAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                     }

                  }
                  else{
                     System.out.println("You have no weak acids left!");
                  }
               }
                     
               // if user enters "4", and if user has more than 0 strong acids, damage done is 3 and damage taken is 2
               else if (input.equals("4")){
                  if (strongAcid > 0){
                     int damageDone = 3;
                     int damageTaken = 2;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     strongAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no strong acids left!");
                  }
               }
               
               // Arham's code
               // if user enters "5", and if user has more than 0 stun grenades, damage done is 4 and damage taken is 1
               else if (input.equals("5")){
                  if (stunGrenade > 0){
                     int damageDone = 4;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     stunGrenade--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no stun grenades left!");
                  }
               }
               // if user enters invalid command
               else{
                  System.out.println("Invalid command!");      
                  }
               }
            }
         
         // Dang's code            
         // if enemy is Spider, the Spider's hearts will be equal to random number from 16-20              
         else if (enemy == "Spider"){
            int enemyHearts = rd.nextInt(5) + 16;
            while (enemyHearts > 0){
               System.out.println(player + "'s hearts: " + hearts);
               System.out.println(enemy + "'s hearts: " + enemyHearts);
               System.out.println("What would you like to do?");
                     
               // choices for user
               System.out.println("Attack the " + enemy + " (Enter 1)");
               System.out.println("Eat a pork chop (Enter 2)");
               System.out.println("Use a weak acid against the " + enemy + " (Enter 3)");
               System.out.println("Use a strong acid against the " + enemy + " (Enter 4)");
               System.out.println("Use a stun grenade against the " + enemy + " (Enter 5)");
               String input = scan.nextLine();
               System.out.println();
            
               // Shayan's code       
               // if user enters "1", damage done is 4 and damage taken is 3
               if (input.equals("1")){
                  int damageDone = 4;
                  int damageTaken = 3;
                     
                  enemyHearts -= damageDone;
                  hearts -= damageTaken;
                  
                  score += damageDone;
                     
                  System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                  System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                  System.out.println("Your score is " + score);
                  
                  // if user's hearts run out, then game ends
                  if (hearts <= 0){
                     System.out.println("You have ran out of hearts!");
                     break;
                  }

               }
                     
               // if user enters "2", and if user has more than 0 pork chops, they gain 2 hearts
               else if (input.equals("2")){
                  if (porkChop > 0){
                     hearts += 2;
                     porkChop--;
                     System.out.println(player + " ate the pork chop. You gained 1 heart. You now have " + hearts + " remaining and " + porkChop + " pork chops remaining.");
                  }
                  else{
                     System.out.println("You have no pork chops left!");
                  }
               }
               // Daniel's code     
               // if user enters "3", and if user has more than 0 weak acids, damage done is 2 and damage taken is 1 
               else if (input.equals("3")){
                  if (weakAcid > 0){
                     int damageDone = 2;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     weakAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no weak acids left!");
                  }
               }
                     
               // if user enters "4", and if user has more than 0 strong acids, damage done is 3 and damage taken is 2
               else if (input.equals("4")){
                  if (strongAcid > 0){
                     int damageDone = 3;
                     int damageTaken = 2;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     strongAcid--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no strong acids left!");
                  }
               }
               
               // Arham's code
               // if user enters "5", and if user has more than 0 stun grenades, damage done is 4 and damage taken is 1
               else if (input.equals("5")){
                  if (stunGrenade > 0){
                     int damageDone = 4;
                     int damageTaken = 1;
                        
                     enemyHearts -= damageDone;
                     hearts -= damageTaken;
                     
                     stunGrenade--;
                     score += damageDone;
                        
                     System.out.println(player + " took away " + damageDone + " hearts from the " + enemy + ". Enemy now has " + enemyHearts + " hearts left.");
                     System.out.println(player + " took " + damageTaken + " hearts worth of damage from the " + enemy + ". You now have " + hearts + " hearts left.");
                     System.out.println("Your score is " + score);
                     
                     // if user's hearts run out, then game ends
                     if (hearts <= 0){
                        System.out.println("You have ran out of hearts!");
                        break;
                     }

                  }
                  else{
                     System.out.println("You have no stun grenades left!");
                  }
               }
               // if user enters invalid command
               else{
                  System.out.println("Invalid command!");      
                  }
               }
            }
         
         // Arham's code   
         else{
            System.out.println("Invalid command!");
         }
         
         int trapNum = (int) (100 * Math.random());
         // if trapNum < trapChance, you fall into trap and lose 2 hearts
         if (trapNum < trapChance){
            hearts -= 2;
            System.out.println("You have taken 2 hearts worth of damage from the enemy's spit!");
         }
                  
         // if user's hearts run out, then game ends
         if (hearts <= 0){
            System.out.println("You have ran out of hearts!");
            break;
         }
         
         System.out.println();
         System.out.println("\n\tWhat would you like to do now?");
         System.out.println("\t1. Keep fighting (Enter 1)");
         System.out.println("\t2. Quit the Game (Enter 2)");
         
         System.out.print("\tEnter your choice: ");
         String input = scan.nextLine();
         
         while (!input.equals("1") && !input.equals("2")){
            System.out.println("\tInvalid command");
            System.out.println("\tEnter your choice: ");
            input = scan.nextLine();
         }
      }
      
      System.out.println();
      System.out.println("Thank you for playing the game!");
      System.out.println();
      
   }
}
      