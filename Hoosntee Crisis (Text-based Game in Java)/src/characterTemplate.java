public class characterTemplate 
{
    //4 attributes of a character
    String name;
    String job;
    int health;
    int attack;

    //Constructor that used to create a character oject
    characterTemplate (String theName, int theHealth, int theAttack)
    {
        this.name = theName;
        this.health = theHealth;
        this.attack = theAttack;
    }

    //Constructor that used to create a partner object
    characterTemplate(String theName, String theJob)
    {
        this.name = theName;
        this.job = theJob;
    }

    //Method that used to print information of the character
    void characterInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
    }

    //Method that used to print information of the partner
    void partnerInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
    }

    //Method that used to print information of the enemy
    void enemyInfo()
    {
        System.out.println(name + " Information:");
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
    }
}