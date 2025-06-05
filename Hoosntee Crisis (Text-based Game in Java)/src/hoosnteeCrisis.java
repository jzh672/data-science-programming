import java.util.Scanner;
import java.util.ArrayList;

public class hoosnteeCrisis 
{
    static Scanner userInput = new Scanner(System.in);
    static String input;
    public static void main(String[] args) 
    {
        //UI of the game
        System.out.println("#     #                                                     #####");
        System.out.println("#     #  ####   ####   ####  #    # ##### ###### ######    #     # #####  #  ####  #  ####");
        System.out.println("#     # #    # #    # #      ##   #   #   #      #         #       #    # # #      # #");
        System.out.println("####### #    # #    #  ####  # #  #   #   #####  #####     #       #    # #  ####  #  ####");
        System.out.println("#     # #    # #    #      # #  # #   #   #      #         #       #####  #      # #      #");
        System.out.println("#     # #    # #    # #    # #   ##   #   #      #         #     # #   #  # #    # # #    #");
        System.out.println("#     #  ####   ####   ####  #    #   #   ###### ######     #####  #    # #  ####  #  ####");
        character();
        enterToContinue();

        //Background information
        System.out.println("There is a country called Hoosntee, which faces a huge population problem. Government set up a system that gives every normal citizen a number, they will choose 10 numbers every 2 hours to kill, that to balance the population.");
        enterToContinue();

        //Choosing character
        System.out.println("Choose a character that you want to be in this game!");
        System.out.println("[1] Cub-Protagonist (Health: 100, Attack: 10)");
        System.out.println("[2] Wallace-Antagonist (Health: 85, Attack: 8)");
        System.out.println("Enter corresponding number to choose");
        character();

        //User enter which character they want to be
        input = userInput.nextLine();
        inputChecker();
        
        //Cub's story line
        if (input.equals("1"))
        {
            //Create a character cub using object
            characterTemplate cub = new characterTemplate("Cub", 100, 10);
            cub.characterInfo();
            cub();

            //User edit the last name
            System.out.println("");
            System.out.println("Enter your name to be the last name of character");
            input = userInput.nextLine();
            System.out.println("Hello! Cub " + input);
            enterToContinue();

            //Character information
            System.out.println("You are a a nobility in Hoosntee which hates Hoosntee's system. The boy Wallace starts a plan to kill all of nobilities, in order to not be killed, you have decided to start the adventure.");
            enterToContinue();
            //Enter Chapter 1
            System.out.println(" #####                                                #      #######");
            System.out.println("#     # #    #   ##   #####  ##### ###### #####      ##      #        ####  #####  ######  ####  #####");
            System.out.println("#       #    #  #  #  #    #   #   #      #    #    # #      #       #    # #    # #      #        #");
            System.out.println("#       ###### #    # #    #   #   #####  #    #      #      #####   #    # #    # #####   ####    #");
            System.out.println("#       #    # ###### #####    #   #      #####       #      #       #    # #####  #           #   #");
            System.out.println("#     # #    # #    # #        #   #      #   #       #      #       #    # #   #  #      #    #   #");
            System.out.println(" #####  #    # #    # #        #   ###### #    #    #####    #        ####  #    # ######  ####    #");
            System.out.println("");
            tree();
            enterToContinue();

            //Choosing partner with some ascii art
            System.out.println("Choose a partner!");
            System.out.println("");
            System.out.println("   ..:::::::..\t\t          ______\t\t              | 1");
            System.out.println("  //////\\\\\\\\\\\\\\\t\t       .-'      `-.\t\t           ,--|--.");
            System.out.println("  |||||||||||||\t             .'            `.\t\t        ,-'   |   `-.");
            System.out.println("  |||||||||||||\t            /                \\\t\t      ,'      |      `.");
            System.out.println("  |||||||||||||\t           ;                 ;`\t            ,'        |        `.");
            System.out.println("  |||||||||||||            |                 |;\t           /          |          \\");
            System.out.println("  |||||||||||||            ;                 ;|\t          /           |           \\");
            System.out.println("  |||||||||||||            '\\               / ;\t     ----+------------+------------\\------------+-");
            System.out.println("==================          \\`.           .' /\t\t__            |0         __ \\          __");
            System.out.println("==================           `.`-._____.-' .'\t\t||            |          ||  \\         ||");
            System.out.println("  #############      \t      / /`_____.-'\t      - ---           |          ---  `.");
            System.out.println("    #########       \t     / / /\t\t         2            |           2     `.");
            System.out.println("     #######        \t    / / /                                     |                   `-. ");
            System.out.println("      #####         \t   / / /                                      | -1                   `--,");
            System.out.println("       ###                / / /                                       |");
            System.out.println("                          \\/_/");
            System.out.println("    Journalist            Detective                              Mathematician");
            System.out.println("");
            System.out.println("[1] Alex-Journalist");
            System.out.println("[2] Marcus-Professional Detective");
            System.out.println("[3] Rocky-Mathematician");
            input = userInput.nextLine();

            //Another input check which prevent user enter a wrong thing
            while (!(input.equals("1")) && !(input.equals("2")) && !(input.equals("3")))
            {
                System.out.println("Re-enter!");
                input = userInput.nextLine();
            }

            //Store the information of partner using a string variable
            String partnerIndex = input;

            //Situation where the user choosed partner Alex
            if (partnerIndex.equals("1"))
            {
                //Create a partner using object
                characterTemplate alex = new characterTemplate("Alex", "Journalist");
                alex.partnerInfo();
                System.out.println("     ..:::::::..");
                System.out.println("    //////\\\\\\\\\\\\\\");
                System.out.println("    |||||||||||||");
                System.out.println("    |||||||||||||");
                System.out.println("    |||||||||||||");
                System.out.println("HH  |||||||||||||   HH");
                System.out.println("HH==================HH");
                System.out.println("HH==================HH");
                System.out.println("HH  #############   HH");
                System.out.println("HH  #############   HH");
                System.out.println("HH   ###########    HH");
                System.out.println("HH    #########     HH");
                System.out.println("HH     #######      HH");
                System.out.println("HH      #####       HH");
                System.out.println("HH        ()        HH");
                System.out.println("\\\\         ()       //");
                System.out.println("  \\\\       ()     //");
                System.out.println("    \\\\      ()  //");
                System.out.println("      \\\\     (//");
                System.out.println("        \\\\  //)(");
                System.out.println("      ____\\/___()");
                System.out.println("  ,#################....");
                System.out.println(" #####################  ```");
                enterToContinue();
            }
            else if (partnerIndex.equals("2"))
            {
                characterTemplate marcus = new characterTemplate("Marcus", "Professional Detective");
                marcus.partnerInfo();
                System.out.println("");
                System.out.println("            ______");
                System.out.println("         .-'      `-.");
                System.out.println("       .'            `.");
                System.out.println("      /                \\");
                System.out.println("     ;                 ;`");
                System.out.println("     |                 |;");
                System.out.println("     ;                 ;|");
                System.out.println("     '\\               / ;");
                System.out.println("      \\`.           .' /");
                System.out.println("       `.`-._____.-' .'");
                System.out.println("         / /`_____.-'");
                System.out.println("        / / /");
                System.out.println("       / / /");
                System.out.println("      / / /");
                System.out.println("     / / /");
                System.out.println("    / / /");
                System.out.println("   / / /");
                System.out.println("  / / /");
                System.out.println(" / / /");
                System.out.println("/ / /");
                System.out.println("\\/_/");
                enterToContinue();
            }
            else
            {
                characterTemplate rocky = new characterTemplate("Rocky", "Mathematician");
                rocky.partnerInfo();
                System.out.println("");
                System.out.println("                 | 1");
                System.out.println("              ,--|--.");
                System.out.println("           ,-'   |   `-.");
                System.out.println("         ,'      |      `.");
                System.out.println("       ,'        |        `.");
                System.out.println("      /          |          \\");
                System.out.println("     /           |           \\");
                System.out.println("----+------------+------------\\------------+-");
                System.out.println("   __            |0         __ \\          __");
                System.out.println("   ||            |          ||  \\         || ");
                System.out.println(" - ---           |          ---  `.");
                System.out.println("    2            |           2     `.");
                System.out.println("                 |                   `-.");
                System.out.println("                 | -1                   `--,");
                enterToContinue();
            }

            System.out.println("You have meet a blood trader, he said that he could find Wallace.");
            enterToContinue();

            //Deduct health or ignore
            System.out.println("Exchange information with some blood deduction or ignore him?");
            System.out.println("[1] Reduce Health (Random amount)");
            System.out.println("[2] Ignore the trader");
            input = userInput.nextLine();
            inputChecker();

            //Situation for health deduction
            if (input.equals("1"))
            {
                //Using random() method in Math class which could generate numbers between 0 and 1
                //Multiply and add numbers to set the random number in a specific bound
                int reduceHealth = (int) (20 * Math.random()) + 1;

                //Deduct Health
                cub.health -= reduceHealth;
                cub.characterInfo();
                enterToContinue();
            }

            //Situation for ignoring the box
            else
            {
                if (partnerIndex.equals("1"))
                {
                    System.out.println("Alex posts a blog and based on the replies, you find a forest");
                }
                else if (partnerIndex.equals("2"))
                {
                    System.out.println("Marcus used his detective skill find a forest");
                }
                else
                {
                    System.out.println("Rocky has no way to find location of Wallace, you finally give up");
                    cubNormalEnding();
                    return;
                }
            }
                
            //Plot: Meet a monster
            System.out.println("You have enter a forest. There is a monster in front of you!");
            System.out.println("      (                      )");
            System.out.println("      |\\    _,--------._    / |");
            System.out.println("      | `.,'            `. /  |");
            System.out.println("      `  '              ,-'   '");
            System.out.println("       \\/_         _   (     /");
            System.out.println("      (,-.`.    ,',-.`. `__,'");
            System.out.println("       |/#\\ ),-','#\\`= ,'.` |");
            System.out.println("       /  (_.)\\     .   -'//");
            System.out.println("      (  /\\____/\\    ) )`'\\");
            System.out.println("       \\ |V----V||  ' ,    \\");
            System.out.println("        |`- -- -'   ,'   \\  \\      _____");
            System.out.println(" ___    |         .'    \\ \\  `._,-'     `-");
            System.out.println("    `.__,`---^---'       \\ ` -'");
            System.out.println("       -.______  \\ . /  ______,-");
            System.out.println("               `.     ,'");

            //Generate random numbers for monster's health and attack
            int monsterHealth = (int) (30 * Math.random()) + 11;
            int monsterAttack = (int) (9 * Math.random()) + 2;

            //Create a monster using template
            characterTemplate monster = new characterTemplate("Monster",monsterHealth, monsterAttack);
            monster.enemyInfo();
            enterToContinue();

            //While loop that continuely ask for attack several times          
            while (monster.health > 0 && cub.health > 0)
            {
                System.out.println("");
                System.out.println("Attack?");
                System.out.println("[1] Yes");
                System.out.println("[2] Run away");
                input = userInput.nextLine();

                //Attack causes monster health and cub attack's variation
                if (input.equals("1"))
                {
                    monster.health -= cub.attack;
                    cub.health -= monster.attack;
                    cub.attack += 5;
                    monster.enemyInfo();
                }

                //Run away leads to the normal ending
                else if (input.equals("2"))
                {
                    System.out.println("You have escape from the forest");
                    cubNormalEnding();
                    return;
                }

                //Condition preventing other input than "1" and "2"
                else
                {
                    System.out.println("Re-enter!");
                }
            }

            //When monster's health less than 0, means it has been defeated
            if (monster.health <= 0 && cub.health > 0)
            {
                System.out.println("");
                cub.characterInfo();
                System.out.println("You have defeat the monster!");
                enterToContinue();
            }

            //When cub's health less than 0, means user has defeated, leads to the bad ending
            else
            {
                System.out.println("DEFEAT! You are dead!");
                badEnding();
                return;
            }
            
            //Plot: See a box
            System.out.println("You walk along the forest, and you have see a box.");
            enterToContinue();
            System.out.println("Open the box OR Ignore?");
            System.out.println("[1] Open the box");
            System.out.println("[2] Ignore it");
            input = userInput.nextLine();
            inputChecker();

            //Situation where user chooses to open the box
            if (input.equals("1"))
            {
                //Set up two variables with ramdom amount, first one is for extra attack, second is acting like a 
                //random judgement on whether add the attack or deduct the attack
                int bonusAttack = (int) (10 * Math.random()) + 1;
                int isAdded = (int) (2 * Math.random());
                if (isAdded == 0)
                {
                    System.out.println("There is a hidden weapon inside the box! You have been hurted!");
                    cub.health -= bonusAttack;
                    cub.characterInfo();
                    if (cub.health <= 0)
                    {
                        System.out.println("DEFEAT! You are dead!");
                        badEnding();
                        return;
                    }
                }
                else
                {
                    System.out.println("There is a Gatling inside the box!");
                    System.out.println("               _____");
                    System.out.println("            .':::::::'.");
                    System.out.println("       ___ /:::::::::::\\____ _            _.''_");
                    System.out.println("    /||   ||`.______.-`||   | |\\_\\\\\\\\____/_ _.-'\\\\\\\\");
                    System.out.println(".|-| ||===||           ||===| ||_||||____|_| .-'|||||");
                    System.out.println("'|-| ||===||===========||===| ||_||||____|_|`-._|||||");
                    System.out.println("    \\||___||___________||___|_|/ ////       `-._////");
                    System.out.println("            )  _____  (");
                    System.out.println("           / .'| (  '. \\");
                    System.out.println("          ( (  './    ) )");
                    System.out.println("           \\ '._____.' /");
                    System.out.println("            '._______.'");
                    cub.attack += bonusAttack;
                    cub.characterInfo();
                }
            }
            else
            {
                System.out.println("You have ignore the box");
            }
            enterToContinue();
            System.out.println("Seems like your partner is becoming useless, do you want to leave him alone?");
            System.out.println("[1] Yes. Noobs are Useless!");
            System.out.println("[2] NO. We are all friends!");
            input = userInput.nextLine();

            //Create a boolean variable that store the choice about "leaving partner"
            boolean leavePartner;
            inputChecker();
            if (input.equals("1"))
            {
                leavePartner = true;
            }
            else
            {
                leavePartner = false;
            }

            //Enter Chapter 2
            System.out.println(" #####                                               #####      #####");
            System.out.println("#     # #    #   ##   #####  ##### ###### #####     #     #    #     #   ##   ##### ######");
            System.out.println("#       #    #  #  #  #    #   #   #      #    #          #    #        #  #    #   #");
            System.out.println("#       ###### #    # #    #   #   #####  #    #     #####     #  #### #    #   #   #####");
            System.out.println("#       #    # ###### #####    #   #      #####     #          #     # ######   #   #");
            System.out.println("#     # #    # #    # #        #   #      #   #     #          #     # #    #   #   #");
            System.out.println(" #####  #    # #    # #        #   ###### #    #    #######     #####  #    #   #   ######");
            enterToContinue();
            System.out.println("You have find a huge house at the middle of the forest. But unfortunately it is locked, you need to solve mathematic puzzles in order to open it.");
            castle();
            System.out.println("You got only 1 chance! Please be careful!");
            enterToContinue();

            //Condition where mathematician is stayed with user
            if (partnerIndex.equals("3") && !(leavePartner))
            {
                System.out.println("Ha, Mathematician never afraid of puzzles! Soon puzzles are solved by mathematicians and the gate opened!");
                System.out.println("");
            }

            //Other conditions (Puzzles)
            else
            {
                System.out.println("Puzzle 1: Find out the pattern and fill in the next number");
                int[] puzzle1 = new int[]{3,9,27,81,0};
                for (int i = 0; i < puzzle1.length; i++)
                {
                    System.out.print(puzzle1[i] + " ");
                }
                System.out.println("");
                System.out.println("What is the best number that could substitute 0!");
                input = userInput.nextLine();

                //Create a boolean variable that store the answer of "Is puzzle 1 correct"
                boolean puzzle1IsCorrect = false;
                if (input.equals("243"))
                {
                    System.out.println("That is correct!");
                    puzzle1IsCorrect = true;
                }

                //Wrong answers leads to user health deduction
                else
                {
                    cub.health -= 5;
                    System.out.println("Wrong answer! Health deducted!");
                    cub.characterInfo();
                    if (cub.health <= 0)
                    {
                        System.out.println("DEFEAT! You are dead!");
                        badEnding();
                        return;
                    }
                }
                enterToContinue();
                System.out.println("Next Puzzle!");
                System.out.println("Puzzle 2: Remove the most appropriate object in the list");

                //Create an object list using ArrayList
                ArrayList<String> puzzle2 = new ArrayList<String>();

                //Add element into the ArrayList
                puzzle2.add("Apple"); 
                puzzle2.add("Watermelon"); 
                puzzle2.add("Tomato"); 
                puzzle2.add("Potato"); 
                puzzle2.add("Cherry");

                //Create another solution ArrayList that mainly used to check answer
                ArrayList<String> solution = new ArrayList<String>();
                solution.add("Apple");
                solution.add("Watermelon");
                solution.add("Tomato");
                solution.add("Cherry");
                System.out.println(puzzle2 + " ");
                System.out.println("");
                System.out.println("What is the best object could be remove in the list?");
                input = userInput.nextLine();

                //While loop preventing the input other than objects in the list
                while (!input.equals("Apple") && !input.equals("Watermelon") && !input.equals("Tomato") && !input.equals("Potato") && !input.equals("Cherry"))
                {
                    System.out.println("Seems like we don't have that object in the list, please re-enter!");
                    input = userInput.nextLine();
                }

                //Remove the input object in order to demonstrates the user's answer
                puzzle2.remove(input);
                System.out.println("Your answer: " + puzzle2 + " ");
                enterToContinue();

                //Create a boolean variable that store the answer of "Is puzzle 2 correct"
                boolean puzzle2IsCorrect = false;
                for (int index = 0; index < solution.size(); index++)
                {
                    //Check the sameness of edited arraylist and answer by comparing elements one by one
                    //Wrong answer leads to user's health deduction
                    if (!(puzzle2.get(index).equals(solution.get(index))))
                    {
                        cub.health -= 10;
                        System.out.println("Wrong answer! Health deducted!");
                        cub.characterInfo();
                        if (cub.health <= 0)
                        {
                            System.out.println("DEFEAT! You are dead!");
                            badEnding();
                            return;
                        }

                        //Once there is unequal element appeared, change puzzle2IsCorrect to be false and break the loop
                        puzzle2IsCorrect = false;
                        enterToContinue();
                        break;
                    }

                    //If elements are equal, change puzzle2IsCorrect to be true
                    puzzle2IsCorrect = true;
                }
                if (puzzle2IsCorrect)
                {
                    System.out.println("The answer is correct!");
                }
                System.out.println("Next Puzzle!");
                enterToContinue();
                
                System.out.println("Puzzle 3: Observe and find the error in the puzzle");
                int[][] puzzle3 = new int[][]{{0,0,1,1,0,2},{1,0,0,1,1,111},{0,0,1,1,1,3},{1,1,0,1,0,21},{0,0,1,0,0,1}};
                for (int row = 0; row < puzzle3.length; row++)
                {
                    for (int col = 0; col < puzzle3[0].length; col++)
                    {
                        if (col == puzzle3[0].length - 1)
                        {
                            System.out.print("  ");
                        }
                        System.out.print(puzzle3[row][col] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("1 1 3 1 2");
                System.out.println("1   1 2");
                System.out.println("");
                System.out.println("What are the two numbers that has an error?");
                System.out.println("Enter coordinates for each number");
                System.out.println("Example: If you want to indicate the \"1\"s at first row, enter [0,2],[0,3]");
                input = userInput.nextLine();

                //Create a boolean variable that used to store result of "Puzzle 3 is whether correct"
                boolean puzzle3IsCorrect = false;
                if (input.equals("[1,2],[1,3]"))
                {
                    System.out.println("The answer is correct!");
                    puzzle3IsCorrect = true;
                }

                //Wrong answer leads to user's health deduction
                else
                {
                    cub.health -= 15;
                    System.out.println("Wrong answer! Health deducted!");
                    cub.characterInfo();
                    if (cub.health <= 0)
                    {
                        System.out.println("DEFEAT! You are dead!");
                        badEnding();
                        return;
                    }
                }

                //Only for three puzzle are correctly solved, otherwise it is not possible to open the door
                if (puzzle1IsCorrect && puzzle2IsCorrect && puzzle3IsCorrect)
                {
                    System.out.println("The door opened!");
                }
                else
                {
                    System.out.println("The door cannot be opened! You finally give up!");
                    cubNormalEnding();
                    return;
                }
                enterToContinue();
            }

            //Enter chapter 3
            chapter3();
            enterToContinue();
            System.out.println("You have enter the big house. There is a gigantic machine that is standing at the middle of the house with plenty of cables connecting on it.");
            machine();
            enterToContinue();
            System.out.println("Suddenly, there is a person walk out from a hidden room at the back of the house");
            wallace();
            enterToContinue();
            System.out.println("You: Why did you do this, Wallace? You need to stop right now!");
            enterToContinue();
            System.out.println("Wallace: Oh, you ask me why? Your disgusting nobilities and government kill my mum. Do you think it has any reason? What I just want is to kill all of your nobilities to bring fair back to my mum!");
            enterToContinue();
            System.out.println("You: You are definitely crazy. If you don't stop, I will stop you then!");
            enterToContinue();

            //Create an enemy Wallace using characterTemplate
            characterTemplate enemyWallace = new characterTemplate("Wallace", 420, 10);
            enemyWallace.enemyInfo();
            enterToContinue();

            //attack with combo bonus
            int enemyWallaceHealthDeduct = cub.attack;
            while (!(enemyWallace.health <= 0) && !(cub.health <= 0))
            {
                System.out.println("Attack!");
                enterToContinue();
                cub.health -= enemyWallace.attack;

                //Combos generates greater attack toward enemy Wallace
                enemyWallace.health -= enemyWallaceHealthDeduct;
                enemyWallaceHealthDeduct += cub.attack;                
                enemyWallace.enemyInfo();                
            }

            //As enemyWallace's health is less than 0, wallace are defeated
            if (enemyWallace.health <= 0 && cub.health > 0)
            {
                System.out.println("You have defeat Wallace!");
                cub.characterInfo();
            }

            //Otherwise you defeated, leads to bad ending
            else
            {
                System.out.println("DEFEAT! You are dead!");
                badEnding();
                return;
            }
            enterToContinue();
            System.out.println("You: I am sorry for your mother's death, but killing people to revenge are not forgiveable!");
            enterToContinue();

            //If user leaves the partner at the front stage, leads to a fake ending
            if (leavePartner)
            {
                System.out.println("Wallace: Haha, do you think you are a hero that saves the world, you selfish guy?");
                enterToContinue();
                System.out.println("Wallace take out a device from his pocket");
                enterToContinue();
                System.out.println("Wallace: I have already assigned you a number, before I get into jail, let me kill the last nobility then!");
                enterToContinue();
                System.out.println("You: Nooooooooooo!");
                enterToContinue();
                cubFakeEnding();
                return;
            }

            //If user does not leave the partner at the front stage, leads to a true ending
            else
            {
                System.out.println("Wallace: Haha, fine then, you are a good guy bro. It is my fault that I blamed all the nobility in this country...");
                enterToContinue();
                System.out.println("Police surrounded the forest, Wallace has been caught!");
                enterToContinue();
                cubTrueEnding();
                cub.characterInfo();
                return;
            }
        }

        //Wallace's story line
        if (input.equals("2"))
        {
            //Create a character wallace using object
            characterTemplate wallace = new characterTemplate("Wallace", 85, 8);
            wallace.characterInfo();
            System.out.println("");
            wallace();
            System.out.println("");

            //Enter the last name of character
            System.out.println("Enter your name to be the last name of character");
            input = userInput.nextLine();
            System.out.println("Hello! Wallace " + input);
            enterToContinue();

            System.out.println("You are a normal citizen in Hoosntee, due to the cruel system, your parents had been killed by the government, so you hates all nobilities in this country, and finally starts your revenge, to kill all of nobilities.");
            enterToContinue();
            
            //Enter Chapter 1
            System.out.println(" #####                                                #      ######");
            System.out.println("#     # #    #   ##   #####  ##### ###### #####      ##      #     # #####  ######   ##   #    #");
            System.out.println("#       #    #  #  #  #    #   #   #      #    #    # #      #     # #    # #       #  #  ##  ##");
            System.out.println("#       ###### #    # #    #   #   #####  #    #      #      #     # #    # #####  #    # # ## #");
            System.out.println("#       #    # ###### #####    #   #      #####       #      #     # #####  #      ###### #    #");
            System.out.println("#     # #    # #    # #        #   #      #   #       #      #     # #   #  #      #    # #    #");
            System.out.println(" #####  #    # #    # #        #   ###### #    #    #####    ######  #    # ###### #    # #    #");
            enterToContinue();

            //Dialogues
            System.out.println("Machine: Citizen number 8358, your behavior is illegal, please stop it! Citizen number 8358, your behavior is illegal...");
            enterToContinue();
            System.out.println("You: I need to break that machine! This is the only chance now...!");
            enterToContinue();
            System.out.println("There are some puzzle that has been setted as passwords, solved the puzzles first!");
            machine();
            enterToContinue();

            //Plot: Puzzles
            System.out.println("Puzzle 1: Find the value of x based on the known information");
            System.out.println("3x + 2y + 5z = 2");
            System.out.println("x - 2y - z = 6");
            System.out.println("4x + 2y - 7z = 30");
            input = userInput.nextLine();

            //If the previous puzzle is correct, go ahead to next one
            if (input.equals("4"))
            {
                System.out.println("That is correct!");
                System.out.println("Next Puzzle!"); 
                enterToContinue();
                
                //Enter Puzzle 2
                System.out.println("Puzzle 2: Sudoku!");
                int[][] puzzle2 = new int[][]
                {
                    {4,3,1,6,0,0,5,2,8},
                    {9,6,7,2,5,8,3,4,1},
                    {5,8,2,1,4,3,9,6,7},
                    {6,5,9,8,1,7,2,3,4},
                    {3,2,8,5,6,4,1,7,9},
                    {7,1,4,9,3,2,8,5,6},
                    {8,7,3,4,2,1,6,9,5},
                    {1,4,5,3,9,6,7,8,2},
                    {2,9,6,7,8,5,4,1,3},
                };

                //Using a for loop to print every element in the array
                for (int row = 0; row < puzzle2.length; row++)
                {
                    for (int col = 0; col < puzzle2[0].length; col++)
                    {
                        System.out.print(puzzle2[row][col] + " ");
                    }
                    System.out.println("");
                }

                System.out.println("What is the best substitution for first \"0\" at first row?");
                input = userInput.nextLine();

                //If correct, go straight to next question
                if (input.equals("7"))
                {
                    System.out.println("What is the best substitution for second \"0\" at first row?");
                    input = userInput.nextLine();

                    //If correct, go straight to next question
                    if (input.equals("9"))
                    {
                        System.out.println("That is correct!");
                        System.out.println("Next puzzle!");
                        enterToContinue();
                        System.out.println("Puzzle 3: Answer the question directly!");
                        System.out.println("269 = 2");
                        System.out.println("389 = 3");
                        System.out.println("499 = 2");
                        System.out.println("175 = ?");
                        input = userInput.nextLine();
                        if (input.equals("0"))
                        {
                            System.out.println("That is correct!");
                        }

                        //If wrong, print not correct
                        else
                        {
                            System.out.println("That is not correct!");
                        }
                    }

                    //If wrong, print not correct
                    else
                    {
                        System.out.println("That is not correct!");
                    }
                }

                //If wrong, print not correct
                else
                {
                    System.out.println("That is not correct!");
                }
            }

            //If wrong, print not correct
            else
            {
                System.out.println("That is not correct!");
            }
            enterToContinue();

            //Enter chapter 2
            System.out.println(" #####                                               #####     ######");
            System.out.println("#     # #    #   ##   #####  ##### ###### #####     #     #    #     # ###### #    # ###### #    #  ####  #####");
            System.out.println("#       #    #  #  #  #    #   #   #      #    #          #    #     # #      #    # #      ##   # #    # #");
            System.out.println("#       ###### #    # #    #   #   #####  #    #     #####     ######  #####  #    # #####  # #  # #      #####");
            System.out.println("#       #    # ###### #####    #   #      #####     #          #   #   #      #    # #      #  # # #  ### #");
            System.out.println("#     # #    # #    # #        #   #      #   #     #          #    #  #       #  #  #      #   ## #    # #");
            System.out.println(" #####  #    # #    # #        #   ###### #    #    #######    #     # ######   ##   ###### #    #  ####  #####");
            enterToContinue();

            //Dialogues
            System.out.println("You: ...That is dream...");
            enterToContinue();
            System.out.println("You: It is almost a year now. I was strongly wish that to be true! My mum is going to be saved if I break that machine at that time...");
            enterToContinue();
            System.out.println("You: God damned nobilities! Why they are excused from the killing?!");
            enterToContinue();
            System.out.println("You: I need to get back to that place, to revenge for my mum!");
            enterToContinue();

            //Plot: Meet a monster
            System.out.println("You have enter a forest. There is a monster in front of you!");
            System.out.println("          ____      ________");
            System.out.println("        ,^.__.>--\"~~'_.--~_)~^.");
            System.out.println("       _L^~   ~    (~ _.-~ \\. |\\");
            System.out.println("    ,-~    __    __,^\"/\\_A_/ /' \\");
            System.out.println("  _/    ,-\"  \"~~\" __) \\  ~_,^   /\\");
            System.out.println(" //    /  ,-~\\ x~\"  \\._\"-~     ~ _Y");
            System.out.println(" Y'   Y. (__.//     /  \" , \"\\_r ' ]");
            System.out.println(" J-.__l_>---r{      ~    \\__/ \\_ _/");
            System.out.println("(_ (   (~  (  ~\"---   _.-~ `\\ / \\ !");
            System.out.println(" (_\"~--^----^--------\"  _.-c Y  /Y'");
            System.out.println("  l~---v----.,______.--\"  /  !_/ |");
            System.out.println("   \\.__!.____./~-.      _/  /  \\ !");
            System.out.println("    `x._\\_____\\__,>---\"~___Y\\__/Y'");
            System.out.println("        ~     ~(_~~(_)\"~___)/ /\\|");
            System.out.println("               (_~~   ~~___)  \\_t");
            System.out.println("               (_~~   ~~___)\\_/ |");
            System.out.println("               (_~~   ~~___)\\_/ |");
            System.out.println("               { ~~   ~~   }/ \\ l");

            //Set up two variables with ramdom amount, first one is for extra attack, second is acting like a 
            //random judgement on whether add the attack or deduct the attack
            int monsterHealth = (int) (40 * Math.random()) + 11;
            int monsterAttack = (int) (5 * Math.random()) + 2;

            //Create an monster object using template
            characterTemplate monster = new characterTemplate("Monster", monsterHealth, monsterAttack);
            monster.enemyInfo();
            enterToContinue();

            //Keep asking for attack when there is no one dead
            while (monster.health > 0 && wallace.health > 0)
            {
                System.out.println("");
                System.out.println("Attack?");
                System.out.println("[1] Yes");
                System.out.println("[2] Run away");
                input = userInput.nextLine();
                inputChecker();
                if (input.equals("1"))
                {
                    monster.health -= wallace.attack;
                    wallace.health -= monster.attack;
                    wallace.attack += 5;
                    monster.enemyInfo();
                }
                else
                {
                    System.out.println("You have escape from the forest");
                    wallaceNormalEnding();
                    return;
                }
            }

            //Situation where monster dead
            if (monster.health <= 0 && wallace.health > 0)
            {
                System.out.println("");
                wallace.characterInfo();
                System.out.println("You have defeat the monster!");
                enterToContinue();
            }

            //Situation where user dead
            else
            {
                System.out.println("DEFEAT! You are dead!");
                badEnding();
                return;
            }
            System.out.println("You walk along the forest, and you have see a box.");
            tree();
            enterToContinue();
            System.out.println("Open the box OR Ignore?");
            System.out.println("[1] Open the box");
            System.out.println("[2] Ignore it");
            input = userInput.nextLine();
            inputChecker();

            //Situation where user chooses to open the box
            if (input.equals("1"))
            {
                //Set up two variables with ramdom amount, first one is for extra attack, second is acting like a 
                //random judgement on whether add the attack or deduct the attack
                int bonusAttack = (int) (10 * Math.random()) + 1;
                int isAdded = (int) (2 * Math.random());
                if (isAdded == 0)
                {
                    System.out.println("There is a hidden weapon inside the box! You have been hurted!");

                    //User's health is minused by bonusAttack
                    wallace.health -= bonusAttack;
                    wallace.characterInfo();

                    //Health less than 0, user dead, leads to bad ending
                    if (wallace.health <= 0)
                    {
                        System.out.println("DEFEAT! You are dead!");
                        badEnding();
                        return;
                    }
                }
                else
                {
                    System.out.println("There is a shotgun inside the box!");
                    System.out.println("     _  __)\\____________________________________/7_");
                    System.out.println("    (//   )))))                                   `\\||");
                    System.out.println("     /   (((((                                      )`");
                    System.out.println("    (______________________________________________/");
                    System.out.println("     \\   ________ ______________________________/");
                    System.out.println("      ) /#######/ )\\  /     )/");
                    System.out.println("     / /##(\\)##/ /  \\(     //");
                    System.out.println("    / /#######( (\\______.__`");
                    System.out.println("   / /#########) )------``");
                    System.out.println("  / /#########/ /");
                    System.out.println(" / /###(/)###/ /");
                    System.out.println("( (#########/ (");
                    System.out.println(" \\____/_______\\)");
                    System.out.println("");

                    //User's health is added by bonusAttack
                    wallace.attack += bonusAttack;
                    wallace.characterInfo();
                }
            }

            //Situation for ignoring the box
            else
            {
                System.out.println("You have ignore the box");
            }
            enterToContinue();

            //Plot: Enter the house
            System.out.println("You have enter the house that you have dreamed last night");
            castle();
            enterToContinue();
            System.out.println("You: This is the only chance, that I could revenge for my mum!");
            enterToContinue();
            System.out.println("You have turn on the machine at the center of house, there is a block pop out that request for a 4-digit password.");
            machine();
            enterToContinue();
            System.out.println("Please enter the password");
            input = userInput.nextLine();

            //Recall to the game, find the password
            if (input.equals("4790"))
            {
                System.out.println("That's correct! The machine opened!");
            }

            //Incorrect password leads to normal ending
            else
            {
                System.out.println("That's not correct!");
                enterToContinue();
                System.out.println("Machine: Illegal infiltration! Illegal inflitration!...");
                enterToContinue();
                System.out.println("You have run away from the forest");
                wallaceNormalEnding();
                return;
            }

            //Enter chapter 3
            chapter3();
            enterToContinue();

            //Dialogue
            System.out.println("As you get accessed to the machine. You are always stay inside the house, giving the nobilities number and kill them every 2 hours");
            enterToContinue();
            System.out.println("But one day, there is a fat guy opened the door of the house, you have run into a hidden room");
            cub();
            enterToContinue();
            System.out.println("Cub: Why did you do this, Wallace? You need to stop right now!");
            enterToContinue();
            System.out.println("You: Oh, you ask me why? Your disgusting nobilities and government kill my mum. Do you think it has any reason? What I just want is to kill all of your nobilities to bring fair back to my mum!");
            enterToContinue();
            System.out.println("Cub: You are definitely crazy. If you don't stop, I will stop you then!");
            enterToContinue();

            //Create an enemy object using template
            characterTemplate enemyCub = new characterTemplate("Cub", 380, 10);
            enemyCub.enemyInfo();
            enterToContinue();

            //attack with combo bonus
            int enemyCubHealthDeduct = wallace.attack;

            //As enemy Cub and user is not dead, keep asking for attack
            while (enemyCub.health > 0 && wallace.health > 0)
            {
                System.out.println("Attack!");
                enterToContinue();
                wallace.health -= enemyCub.attack;

                //Combos generates greater attack toward enemy Cub
                enemyCub.health -= enemyCubHealthDeduct;
                enemyCubHealthDeduct += wallace.attack;                
                enemyCub.enemyInfo();                
            }

            //As enemyCub's health is less than 0, wallace are defeated
            if (enemyCub.health <= 0 && wallace.health > 0)
            {
                System.out.println("You have defeat Cub!");
                wallace.characterInfo();
            }

            //Otherwise you defeated, leads to bad ending
            else
            {
                System.out.println("DEFEAT! You are dead!");
                badEnding();
                return;
            }
            enterToContinue();

            //Plot: Police Officers coming
            System.out.println("Cub falls down at the front of the machine, you laughed at him, to show your hate of nobilities and government.");
            enterToContinue();
            System.out.println("Suddenly, the air was pierced by sirens");
            enterToContinue();
            System.out.println("No.1345 Police: Put your hands up, this place is forbiddened for citizens, you have break the law!");
            enterToContinue();
            System.out.println("You decide to kill these police using the machine, but the note on the machine attract your attention:");
            System.out.println("THE MEN WHO COMMIT CRIMES ARE ALWAYS BE CONSIDERED TO BE THE FIRST CHOICE TO BE ENTERED!");
            enterToContinue();
            System.out.println("No.1345 Police: Get out from the house, you crazy criminal!");
            enterToContinue();

            //Enter the citizen number
            System.out.println("Enter the citizen number into the machine!");
            input = userInput.nextLine();

            //If number is not wallace's citizen number, leads to fake ending
            if (!input.equals("8358"))
            {
                System.out.println("You have enter the number, but seems like it is not working anymore.");
                enterToContinue();
                System.out.println("Finally you are caught by the police, and you started your prison life");
                enterToContinue();
                wallaceFakeEnding();
                return;
            }

            //Otherwise leads to true ending
            System.out.println("You have entered yourself's number, but you are not dead, instead you have transfered back to one year ago");
            enterToContinue();
            System.out.println("You: Oh, I came back!");
            enterToContinue();
            System.out.println("There is a machine in front of you, you quickly run to that machine, break it immediately, and run back to your home.");
            enterToContinue();
            wallaceTrueEnding();
            wallace.characterInfo();
        } 
    }

    //Method always used to check the input (Only used in the case that need to press enter)
    public static void enterToContinue()
    {
        System.out.println("Press enter to continue!");
        input = userInput.nextLine();
        while (input.length() >= 0)
        {
            if (input.equals(""))
            {
                break;
            }
            System.out.println("Re-enter!");
            input = userInput.nextLine();
        }
    }

    //This is the method that demonstrates the ascii art of two characters
    public static void character()
    {
        System.out.println("                    .");
        System.out.println("                   / \\");
        System.out.println("                  _\\ /_");
        System.out.println("        .     .  (,'v`.)  .     .");
        System.out.println("        \\)   ( )  ,' `.  ( )   (/");
        System.out.println("         \\`. / `-'     `-' \\ ,'/");
        System.out.println("          : '    _______    ' :                              ////^\\\\\\\\");
        System.out.println("          |  _,-'  ,-.  `-._  |                              | ^   ^ |");
        System.out.println("          |,' ( )__`-'__( ) `.|                             @ (o) (o) @");
        System.out.println("          (|,-,'-._   _.-`.-.|)                              |   <   |");
        System.out.println("          /  /<( o)> <( o)>\\  \\                              |  ___  |");
        System.out.println("          :  :     | |     :  :                               \\_____/");
        System.out.println("          |  |     ; :     |  |                             ____|  |____");
        System.out.println("          |  |    (.-.)    |  |                            /    \\__/    \\");
        System.out.println("          |  |  ,' ___ `.  |  |                           /              \\");
        System.out.println("          ;  |)/ ,'---'. \\(|  :                          /\\_/|        |\\_/\\");
        System.out.println("      _,-/   |/\\(       )/\\|   \\-._                     / /  |        |  \\ \\");
        System.out.println("_..--'.-(    |   `-'''-'   |    )-.`--.._              ( <   |        |   > )");
        System.out.println("         `.  ;`._________,':  ,'                        \\ \\  |        |  / /");
        System.out.println("        ,' `/               \\'`.                         \\ \\ |        | / /");
        System.out.println("             `------.------'                              \\ \\|________|/ /");
    }

    //This is the method used to check the input is whether 1 or 2
    public static void inputChecker()
    {
        while (!(input.equals("1")) && !(input.equals("2")))
        {
            System.out.println("Re-enter!");
            input = userInput.nextLine();
        }
    }

    //This is the method demonstrating ascii art for "Chapter 3 Crisis"
    public static void chapter3()
    {
        System.out.println(" #####                                               #####      #####");
        System.out.println("#     # #    #   ##   #####  ##### ###### #####     #     #    #     # #####  #  ####  #  ####");
        System.out.println("#       #    #  #  #  #    #   #   #      #    #          #    #       #    # # #      # #");
        System.out.println("#       ###### #    # #    #   #   #####  #    #     #####     #       #    # #  ####  #  ####");
        System.out.println("#       #    # ###### #####    #   #      #####           #    #       #####  #      # #      #");
        System.out.println("#     # #    # #    # #        #   #      #   #     #     #    #     # #   #  # #    # # #    #");
        System.out.println(" #####  #    # #    # #        #   ###### #    #     #####      #####  #    # #  ####  #  ####");
    }

    //This is the method demonstrating ascii art of Cub
    public static void cub()
    {
        System.out.println("                    .");
        System.out.println("                   / \\");
        System.out.println("                  _\\ /_");
        System.out.println("        .     .  (,'v`.)");
        System.out.println("        \\)   ( )  ,' `.  ( )   (/");
        System.out.println("         \\`. / `-'     `-' \\ ,'/");
        System.out.println("          : '    _______    ' :");
        System.out.println("          |  _,-'  ,-.  `-._  |");
        System.out.println("          |,' ( )__`-'__( ) `.|");
        System.out.println("          (|,-,'-._   _.-`.-.|)");
        System.out.println("          /  /<( o)> <( o)>\\  \\");
        System.out.println("          :  :     | |     :  :");
        System.out.println("          |  |     ; :     |  |");
        System.out.println("          |  |    (.-.)    |  |");
        System.out.println("          |  |  ,' ___ `.  |  |");
        System.out.println("          ;  |)/ ,'---'. \\(|  :");
        System.out.println("      _,-/   |/\\(       )/\\|   \\-._");
        System.out.println("_..--'.-(    |   `-'''-'   |    )-.`--.._");
        System.out.println("         `.  ;`._________,':  ,'");
        System.out.println("        ,' `/               \\'`.");
        System.out.println("             `------.------'");
    }

    //This is the method demonstrating ascii art of Wallace
    public static void wallace()
    {
        System.out.println("      ////^\\\\\\\\");
        System.out.println("      | ^   ^ |");
        System.out.println("     @ (o) (o) @");
        System.out.println("      |   <   |");
        System.out.println("      |  ___  |");
        System.out.println("       \\_____/");
        System.out.println("     ____|  |____");
        System.out.println("    /    \\__/    \\");
        System.out.println("   /              \\");
        System.out.println("  /\\_/|        |\\_/\\");
        System.out.println(" / /  |        |  \\ \\");
        System.out.println("( <   |        |   > )");
        System.out.println(" \\ \\  |        |  / /");
        System.out.println("  \\ \\ |        | / /");
        System.out.println("   \\ \\|________|/ /");
    }

    //This is the method demonstrating ascii art of bad ending
    public static void badEnding()
    {
        System.out.println("######                                                           ######  #######    #    ######");
        System.out.println("#     #   ##   #####     ###### #    # #####  # #    #  ####     #     # #         # #   #     #");
        System.out.println("#     #  #  #  #    #    #      ##   # #    # # ##   # #    #    #     # #        #   #  #     #");
        System.out.println("######  #    # #    #    #####  # #  # #    # # # #  # #         #     # #####   #     # #     #");
        System.out.println("#     # ###### #    #    #      #  # # #    # # #  # # #  ###    #     # #       ####### #     #");
        System.out.println("#     # #    # #    #    #      #   ## #    # # #   ## #    #    #     # #       #     # #     #");
        System.out.println("######  #    # #####     ###### #    # #####  # #    #  ####     ######  ####### #     # ######");
        System.out.println("");
        System.out.println("                                      ..:::::::::..");
        System.out.println("                                  ..:::aad8888888baa:::..");
        System.out.println("                               .::::d:?88888888888?::8b::::.");
        System.out.println("                             .:::d8888:?88888888??a888888b:::.");
        System.out.println("                           .:::d8888888a8888888aa8888888888b:::.");
        System.out.println("                          ::::dP::::::::88888888888::::::::Yb::::");
        System.out.println("                         ::::dP:::::::::Y888888888P:::::::::Yb::::");
        System.out.println("                        ::::d8:::::::::::Y8888888P:::::::::::8b::::");
        System.out.println("                       .::::88::::::::::::Y88888P::::::::::::88::::.");
        System.out.println("                       :::::Y8baaaaaaaaaa88P:T:Y88aaaaaaaaaad8P:::::");
        System.out.println("                       :::::::Y88888888888P::|::Y88888888888P:::::::");
        System.out.println("                       ::::::::::::::::888:::|:::888::::::::::::::::");
        System.out.println("                        :::::::::::::::8888888888888b::::::::::::::'");
        System.out.println("                        :::::::::::::::88888888888888::::::::::::::");
        System.out.println("                         :::::::::::::d88888888888888:::::::::::::");
        System.out.println("                          ::::::::::::88::88::88:::88::::::::::::");
        System.out.println("                           `::::::::::88::88::88:::88::::::::::'");
        System.out.println("                             `::::::::88::88::P::::88::::::::'");
        System.out.println("                               `::::::88::88:::::::88::::::'");
        System.out.println("                                  ``:::::::::::::::::::''");
        System.out.println("                                       ``:::::::::''");
    }

    //This is the method demonstrating ascii art of cub's normal ending
    public static void cubNormalEnding()
    {
        System.out.println("#     #");
        System.out.println("##    #  ####  #####  #    #   ##   #         ###### #    # #####  # #    #  ####");
        System.out.println("# #   # #    # #    # ##  ##  #  #  #         #      ##   # #    # # ##   # #    #");
        System.out.println("#  #  # #    # #    # # ## # #    # #         #####  # #  # #    # # # #  # #");
        System.out.println("#   # # #    # #####  #    # ###### #         #      #  # # #    # # #  # # #  ###");
        System.out.println("#    ## #    # #   #  #    # #    # #         #      #   ## #    # # #   ## #    #");
        System.out.println("#     #  ####  #    # #    # #    # ######    ###### #    # #####  # #    #  ####");
        System.out.println("");
        System.out.println("#    #   ##   # ##### # #    #  ####     #####  ####     #####  ######    #    # # #      #      ###### #####");
        System.out.println("#    #  #  #  #   #   # ##   # #    #      #   #    #    #    # #         #   #  # #      #      #      #    #");
        System.out.println("#    # #    # #   #   # # #  # #           #   #    #    #####  #####     ####   # #      #      #####  #    #");
        System.out.println("# ## # ###### #   #   # #  # # #  ###      #   #    #    #    # #         #  #   # #      #      #      #    #");
        System.out.println("##  ## #    # #   #   # #   ## #    #      #   #    #    #    # #         #   #  # #      #      #      #    #");
        System.out.println("#    # #    # #   #   # #    #  ####       #    ####     #####  ######    #    # # ###### ###### ###### #####");
        System.out.println("                                                                  _");
        System.out.println("                                                              _( (~\\");
        System.out.println("       _ _                        /                          ( \\> > \\");
        System.out.println("   -/~/ / ~\\                     :;                \\       _  > /(~\\/");
        System.out.println("  || | | /\\ ;\\                   |l      _____     |;     ( \\/    > >");
        System.out.println("  _\\\\)\\)\\)/ ;;;                  `8o __-~     ~\\   d|      \\      //");
        System.out.println(" ///(())(__/~;;\\                  \"88p;.  -. _\\_;.oP        (_._/ /");
        System.out.println("(((__   __ \\\\   \\                  `>,% (\\  (\\./)8\"         ;:'  i");
        System.out.println(")))--`.'-- (( ;,8 \\               ,;%%%:  ./V^^^V'          ;.   ;.");
        System.out.println("((\\   |   /)) .,88  `: ..,,;;;;,-::::::'_::\\   ||\\         ;[8:   ;");
        System.out.println(" )|  ~-~  |(|(888; ..``'::::8888oooooo.  :\\`^^^/,,~--._    |88::  |");
        System.out.println(" |\\ -===- /|  \\8;; ``:.      oo.8888888888:`((( o.ooo8888Oo;:;:'  |");
        System.out.println(" |_~-___-~_|   `-\\.   `        `o`88888888b` )) 888b88888P\"\"'     ;");
        System.out.println(" ; ~~~~;~~         \"`--_`.       b`888888888;(.,\"888b888\"  ..::;-'");
        System.out.println("   ;      ;              ~\"-....  b`8888888:::::.`8888. .:;;;''");
        System.out.println("      ;    ;                 `:::. `:::OOO:::::::.`OO' ;;;''");
        System.out.println(" :       ;                     `.      \"``::::::''    .'");
        System.out.println("    ;                           `.   \\_              /");
        System.out.println("  ;       ;                       +:   ~~--  `:'  -';");
        System.out.println("                                   `:         : .::/");
        System.out.println("      ;                            ;;+_  :::. :..;;;");
        System.out.println("                                   ;;;;;;,;;;;;;;;,;");
    }

    //This is the method demonstrating ascii art of cub's fake ending
    public static void cubFakeEnding()
    {
        System.out.println("#######                                                                 ######");
        System.out.println("#         ##   #    # ######    ###### #    # #####  # #    #  ####     #     #  ####   ####  #    # ###### #####");
        System.out.println("#        #  #  #   #  #         #      ##   # #    # # ##   # #    #    #     # #    # #    # ##  ## #      #    #");
        System.out.println("#####   #    # ####   #####     #####  # #  # #    # # # #  # #         #     # #    # #    # # ## # #####  #    #");
        System.out.println("#       ###### #  #   #         #      #  # # #    # # #  # # #  ###    #     # #    # #    # #    # #      #    #");
        System.out.println("#       #    # #   #  #         #      #   ## #    # # #   ## #    #    #     # #    # #    # #    # #      #    #");
        System.out.println("#       #    # #    # ######    ###### #    # #####  # #    #  ####     ######   ####   ####  #    # ###### #####");
        System.out.println("");
        System.out.println("                                                 .======.");
        System.out.println("                                                 |      |");
        System.out.println("                                                 |      |");
        System.out.println("                                                 |      |");
        System.out.println("                                        .========'      '========.");
        System.out.println("                                        |   _      xxxx      _   |");
        System.out.println("                                        |  /_;-.__ / _\\  _.-;_\\  |");
        System.out.println("                                        |     `-._`'`_/'`.-'     |");
        System.out.println("                                        '========.`\\   /`========'");
        System.out.println("                                                 | |  / |");
        System.out.println("                                                 |/-.(  |");
        System.out.println("                                                 |\\_._\\ |");
        System.out.println("                                                 | \\ \\`;|");
        System.out.println("                                                 |  > |/|");
        System.out.println("                                                 | / // |");
        System.out.println("                                                 | |//  |");
        System.out.println("                                                 | \\(\\  |");
        System.out.println("                                                 |  ``  |");
        System.out.println("                                                 |      |");
        System.out.println("                                                 |      |");
        System.out.println("                                                 |      |");
    }
    
    //This is the method demonstrating ascii art of cub's true ending
    public static void cubTrueEnding()
    {
        System.out.println("#######");
        System.out.println("   #    #####  #    # ######    ###### #    # #####  # #    #  ####");
        System.out.println("   #    #    # #    # #         #      ##   # #    # # ##   # #    #");
        System.out.println("   #    #    # #    # #####     #####  # #  # #    # # # #  # #");
        System.out.println("   #    #####  #    # #         #      #  # # #    # # #  # # #  ###");
        System.out.println("   #    #   #  #    # #         #      #   ## #    # # #   ## #    #");
        System.out.println("   #    #    #  ####  ######    ###### #    # #####  # #    #  ####");
        System.out.println("");
        System.out.println(" #####");
        System.out.println("#     #   ##   #    # ######    ##### #    # ######    #    #  ####  #####  #      #####");
        System.out.println("#        #  #  #    # #           #   #    # #         #    # #    # #    # #      #    #");
        System.out.println(" #####  #    # #    # #####       #   ###### #####     #    # #    # #    # #      #    #");
        System.out.println("      # ###### #    # #           #   #    # #         # ## # #    # #####  #      #    #");
        System.out.println("#     # #    #  #  #  #           #   #    # #         ##  ## #    # #   #  #      #    #");
        System.out.println(" #####  #    #   ##   ######      #   #    # ######    #    #  ####  #    # ###### #####");
        System.out.println("");
        System.out.println("                                  .=.,");
        System.out.println("                                 ;c =\\");
        System.out.println("                               __|  _/");
        System.out.println("                             .'-'-._/-'-._");
        System.out.println("                            /..   ____    \\");
        System.out.println("                           /' _  [<_->] )  \\");
        System.out.println("                          (  / \\--\\_>/-/'._ )");
        System.out.println("                           \\-;_/\\__;__/ _/ _/");
        System.out.println("                            '._}|==o==\\{_\\/");
        System.out.println("                             /  /-._.--\\  \\_");
        System.out.println("                            // /   /|   \\ \\ \\");
        System.out.println("                           / | |   | \\;  |  \\ \\");
        System.out.println("                          / /  | :/   \\: \\   \\_\\");
        System.out.println("                         /  |  /.'|   /: |    \\ \\");
        System.out.println("                         |  |  |--| . |--|     \\_\\");
        System.out.println("                         / _/   \\ | : | /___--._) \\");
        System.out.println("                        |_(---'-| >-'-| |       '-'");
        System.out.println("                               /_/     \\_\\");
    }

    //This is the method demonstrating ascii art of Wallace's normal ending
    public static void wallaceNormalEnding()
    {
        System.out.println("#     #");
        System.out.println("##    #  ####  #####  #    #   ##   #         ###### #    # #####  # #    #  ####");
        System.out.println("# #   # #    # #    # ##  ##  #  #  #         #      ##   # #    # # ##   # #    #");
        System.out.println("#  #  # #    # #    # # ## # #    # #         #####  # #  # #    # # # #  # #");
        System.out.println("#   # # #    # #####  #    # ###### #         #      #  # # #    # # #  # # #  ###");
        System.out.println("#    ## #    # #   #  #    # #    # #         #      #   ## #    # # #   ## #    #");
        System.out.println("#     #  ####  #    # #    # #    # ######    ###### #    # #####  # #    #  ####");
        System.out.println("");
        System.out.println("######                                               #######");
        System.out.println("#     # ###### #    # ###### #    #  ####  ######    #         ##   # #      ###### #####");
        System.out.println("#     # #      #    # #      ##   # #    # #         #        #  #  # #      #      #    #");
        System.out.println("######  #####  #    # #####  # #  # #      #####     #####   #    # # #      #####  #    #");
        System.out.println("#   #   #      #    # #      #  # # #  ### #         #       ###### # #      #      #    #");
        System.out.println("#    #  #       #  #  #      #   ## #    # #         #       #    # # #      #      #    #");
        System.out.println("#     # ######   ##   ###### #    #  ####  ######    #       #    # # ###### ###### #####");
        System.out.println("");
        System.out.println("                          oooo$$$$$$$$$$$$oooo");
        System.out.println("                      oo$$$$$$$$$$$$$$$$$$$$$$$$o");
        System.out.println("                   oo$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o         o$   $$ o$");
        System.out.println("   o $ oo        o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o       $$ $$ $$o$");
        System.out.println("oo $ $ \"$      o$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$o       $$$o$$o$");
        System.out.println("\"$$$$$$o$     o$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$o    $$$$$$$$");
        System.out.println("  $$$$$$$    $$$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("  $$$$$$$$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$$$$$$  \"\"\"$$$");
        System.out.println("   \"$$$\"\"\"\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$");
        System.out.println("    $$$   o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$o");
        System.out.println("   o$$\"   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$       $$$o");
        System.out.println("   $$$    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\" \"$$$$$$ooooo$$$$o");
        System.out.println("  o$$$oooo$$$$$  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   o$$$$$$$$$$$$$$$$$");
        System.out.println("  $$$$$$$$\"$$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$\"\"\"\"\"\"\"\"");
        System.out.println(" \"\"\"\"       $$$$    \"$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"      o$$$");
        System.out.println("            \"$$$o     \"\"\"$$$$$$$$$$$$$$$$$$\"$$\"         $$$");
        System.out.println("              $$$o          \"$$\"\"$$$$$$\"\"\"\"           o$$$");
        System.out.println("               $$$$o                                o$$$\"");
        System.out.println("                \"$$$$o      o$$$$$$o\"$$$$o        o$$$$");
        System.out.println("                  \"$$$$$oo     \"\"$$$$o$$$$$o   o$$$$\"\"");
        System.out.println("                     \"\"$$$$$oooo  \"$$$o$$$$$$$$$\"\"\"");
        System.out.println("                        \"\"$$$$$$$oo $$$$$$$$$$");
        System.out.println("                                \"\"\"\"$$$$$$$$$$$");
        System.out.println("                                    $$$$$$$$$$$$");
        System.out.println("                                     $$$$$$$$$$\"");
        System.out.println("                                      \"$$$\"\"\"\"");
    }

    //This is the method demonstrating ascii art of Wallace's fake ending
    public static void wallaceFakeEnding()
    {
        System.out.println("#######");
        System.out.println("#         ##   #    # ######    ###### #    # #####  # #    #  ####");
        System.out.println("#        #  #  #   #  #         #      ##   # #    # # ##   # #    #");
        System.out.println("#####   #    # ####   #####     #####  # #  # #    # # # #  # #");
        System.out.println("#       ###### #  #   #         #      #  # # #    # # #  # # #  ###");
        System.out.println("#       #    # #   #  #         #      #   ## #    # # #   ## #    #");
        System.out.println("#       #    # #    # ######    ###### #    # #####  # #    #  ####");
        System.out.println("");
        System.out.println("######");
        System.out.println("#     # #####  #  ####   ####  #    #    #      # ###### ######");
        System.out.println("#     # #    # # #      #    # ##   #    #      # #      #");
        System.out.println("######  #    # #  ####  #    # # #  #    #      # #####  #####");
        System.out.println("#       #####  #      # #    # #  # #    #      # #      #");
        System.out.println("#       #   #  # #    # #    # #   ##    #      # #      #");
        System.out.println("#       #    # #  ####   ####  #    #    ###### # #      ######");
        System.out.println("");
        System.out.println("                  _________________________");
        System.out.println("                     ||   ||     ||   ||");
        System.out.println("                     ||   ||, , ,||   ||");
        System.out.println("                     ||  (||/|/(\\||/  ||");
        System.out.println("                     ||  ||| _'_`|||  ||");
        System.out.println("                     ||   || o o ||   ||");
        System.out.println("                     ||  (||  - `||)  ||");
        System.out.println("                     ||   ||  =  ||   ||");
        System.out.println("                     ||   ||\\___/||   ||");
        System.out.println("                     ||___||) , (||___||");
        System.out.println("                    /||---||-\\_/-||---||\\");
        System.out.println("                   / ||--_||_____||_--|| \\");
        System.out.println("                  (_(||)-| C-8358 |-(||)_)");
    }

    //This is the method demonstrating ascii art of Wallace's true ending
    public static void wallaceTrueEnding()
    {
        System.out.println("#######                                                                 #######");
        System.out.println("   #    #####  #    # ######    ###### #    # #####  # #    #  ####     #     # #####  #  ####  # #    #");
        System.out.println("   #    #    # #    # #         #      ##   # #    # # ##   # #    #    #     # #    # # #    # # ##   #");
        System.out.println("   #    #    # #    # #####     #####  # #  # #    # # # #  # #         #     # #    # # #      # # #  #");
        System.out.println("   #    #####  #    # #         #      #  # # #    # # #  # # #  ###    #     # #####  # #  ### # #  # #");
        System.out.println("   #    #   #  #    # #         #      #   ## #    # # #   ## #    #    #     # #   #  # #    # # #   ##");
        System.out.println("   #    #    #  ####  ######    ###### #    # #####  # #    #  ####     ####### #    # #  ####  # #    # ");
        System.out.println("");
        System.out.println("                                /:\"\"|       .@@@@@,");
        System.out.println("                               |: 66|_      @@@@@@@@,");
        System.out.println("                               C     _)     aa`@@@@@@");
        System.out.println("                                \\ ._|      (_   ?@@@@");
        System.out.println("                                 ) /        =' @@@@\"");
        System.out.println("                                 /`\\\\         \\(```");
        System.out.println("                                || |Y|       //`\\        .\"~~~~~\".");
        System.out.println("                                || |#|      / | ||       |  .:.  |");
        System.out.println("                                || |#|      \\ | ||    A  | /6 6\\ |");
        System.out.println("                                || |#|      / | ||   |~|_|_\\ e /_|_     .@@@@,");
        System.out.println("                                :| |=:     /  | |\\   |_|)___`\"`___(8    aa`@@@,");
        System.out.println("                                ||_|,|    |   |_| \\     |~~~~~~~~~|     =  `@@@");
        System.out.println("                                \\)))||    |   (((  |    \\_________/       )_/`@'");
        System.out.println("                             |~~~`-`~~~|  `~\\~~~~~~|     |/ /_\\ \\|       / || @");
        System.out.println("                             |         |     `\\   /      ()/___\\()       | || @");
        System.out.println("                             |_________|       ( ||      ||~~~~~||       /~|| \"`");
        System.out.println("                             |_________|       | ||      ||     ||      /__W_\\");
        System.out.println("                                 | ||          | ||      ||     ||        |||");
        System.out.println("                                 |_||__      __|_||      ||_____||       _|||");
        System.out.println("                                 (____))    (:;:;))      ||-----||      ((___)");
    }

    //This is the method demonstrating ascii art of castle
    public static void castle()
    {
        System.out.println("                 |ZZzzz");
        System.out.println("                 |");
        System.out.println("                 |");
        System.out.println("    |ZZzzz      /^\\            |ZZzzz");
        System.out.println("    |          |~~~|           |");
        System.out.println("    |        |^^^^^^^|        / \\");
        System.out.println("   /^\\       |[]+    |       |~~~|");
        System.out.println("|^^^^^^^|    |    +[]|       |   |");
        System.out.println("|    +[]|/\\/\\/\\/\\^/\\/\\/\\/\\/|^^^^^^^|");
        System.out.println("|+[]+   |~~~~~~~~~~~~~~~~~~|    +[]|");
        System.out.println("|       |  []   /^\\   []   |+[]+   |");
        System.out.println("|   +[]+|  []  || ||  []   |   +[]+|");
        System.out.println("|[]+    |      || ||       |[]+    |");
        System.out.println("|_______|------------------|_______|");
    }

    //This is the method demonstrating ascii art of machine
    public static void machine()
    {
        System.out.println("         .__________________________________________________.");
        System.out.println("         ||////////////////////////////////////////////////||");
        System.out.println("         ||////////////////////////////////////////////////||");
        System.out.println("         ||////////////////////////////////////////////////||");
        System.out.println("         ||////////////////////////////////////////////////||   /    \\");
        System.out.println("         !__________________________________________________!  |      |");
        System.out.println("         |   __ __ __ __ __ __ __ __ __ __  /|\\ ATARI 2080ST|  |      |");
        System.out.println("         |__/_//_//_//_//_//_//_//_//_//_/____________--____|  |  .---|---.");
        System.out.println("         | ______________________________________________   |  |  |   |   |");
        System.out.println("         | [][][][][][][][][][][][][][][__] [_][_] [][][][] |  |  |---'---|");
        System.out.println("         | [_][][][][][][][][][][][][]| |[] [][][] [][][][] |  |  |       |");
        System.out.println("         | [__][][][][][][][][][][][][__|[] [][][] [][][][] |  |  |       |");
        System.out.println("         | [_][][][][][][][][][][][][_]            [][][]|| |  |  |  /|\\  |");
        System.out.println("         |    [_][________________][_]             [__][]LI |  |   \\_____/");
        System.out.println("         |__________________________________________________|  ;");
        System.out.println("                                                          \\___/");
    }

    //This is the method demonstrating ascii art of tree
    public static void tree()
    {
        System.out.println("               ,@@@@@@@,");
        System.out.println("       ,,,.   ,@@@@@@/@@,  .oo8888o.");
        System.out.println("    ,&%%&%&&%,@@@@@/@@@@@@,8888\\88/8o");
        System.out.println("   ,%&\\%&&%&&%,@@@\\@@@/@@@88\\88888/88'");
        System.out.println("   %&&%&%&/%&&%@@\\@@/ /@@@88888\\88888'");
        System.out.println("   %&&%/ %&%%&&@@\\ V /@@' `88\\8 `/88'");
        System.out.println("   `&%\\ ` /%&'    |.|        \\ '|8'");
        System.out.println("       |o|        | |         | |");
        System.out.println("       |.|        | |         | |");
        System.out.println("    \\\\/ ._\\//_/__/  ,\\_//__\\\\/.  \\_//__/_");
    }
}