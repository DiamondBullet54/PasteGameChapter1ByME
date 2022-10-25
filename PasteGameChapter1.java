import java.util.Scanner;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class PasteGameChapter1 {
    public static void main(String[] args) throws Exception{
    
    Scanner keyboard = new Scanner(System.in);
    String name;

    text("Hello.");
    text("you must be new here.");
    text("actually... I think you already know what this place is...");
    text("this place is...");
    text("nothing.");
    text("absolutely nothing.");
    text("well, maybe there is... something.");
    text("there's you and me.");
    text("...");
    text("I'm bored.");
    text("...");
    text("So what's your name, anyway?");
    System.out.print("Please tell me: ");
    name = keyboard.nextLine();

    if(name.equals("sex guy")){
        keyboard.nextLine();
        text("the one and only??? SEX GUY?!?!?");
        text("wow");
        text("anyway...");
    }else{
        System.out.println(name + "?");
        keyboard.nextLine();
        text("...");
        text("that's kinda cool, but I dont really care that much.");
        text("anyway...");
    }
    text("lets do something cool.");
    text("we can get into a debate!");
    text("those are always fun!");
    text("Who are you voting for state represenative in the PA elections?");
    text("...");
    text("wait... you don't care about elections at all??");
    text("your vote doesn't matter??? WHAT?!?!?!");
    text("DON'T SAY COMMUNIST THINGS LIKE THAT!! BE A REAL AMERICAN AND VOTE VOTE VOTE!!!");
    text("PERSONAL CHOICE??!?!? THE ONLY PERSONAL CHOICE YOU SHOULD GET IS LEFT OR RIGHT BITCH@@!!!");
    JOptionPane.showMessageDialog(null, "I'm going to kill you");
    JOptionPane.showMessageDialog(null, "and then kill you again.");
    JOptionPane.showMessageDialog(null, "... actually, I have a better idea.");
    JOptionPane.showMessageDialog(null, "I'll just end the game.");
    JOptionPane.showMessageDialog(null, "And then you'll be bored again.");
    JOptionPane.showMessageDialog(null, "AHAHAHHAHAHA");
    JOptionPane.showMessageDialog(null, "see you, sucker.");

    keyboard.close();

    try {
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
    } catch (Exception e) {
        e.printStackTrace();}
    }

    public static void text(String text){// prints anything within a text("EXAMPLE");
        Scanner keyboard = new Scanner(System.in);
        System.out.println(text);
        keyboard.nextLine();
        //keyboard.close(); is never called so theres a memory leak. 
        //I don't know how to fix it, so I'm just gonna ignore it.
    }
}