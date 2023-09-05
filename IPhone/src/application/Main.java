package application;

import java.util.Scanner;

import model.apps.InternetBrowser;
import model.apps.MusicPlayer;
import model.apps.Phone;

/* Challenge Dio - use basic OOP to represent basic phone operations 
 * Use a UML tool of your choice to design the classes and interfaces with the proposal 
 * to represent the roles of the iPhone: Music Player, Telephone Device and Internet Browser. 
 * Then create the classes and interfaces in .java file format
 *
 *Expected behaviors:
 *Music Player: play, pause, selectMusic
 *Telephone Device: call, answer, start MailVoz
 *Internet Browser: displayPage, addNewTab, refreshPage
 */
public class Main {
    public static void main(String[] args) throws Exception {
    	
    	Scanner input = new Scanner(System.in);

//    	Starting with MusicPlayer, test asked blocks
        MusicPlayer ipod = new MusicPlayer();

        ipod.addMusic("Be it - Michael Jackson");
        ipod.addMusic("Unnamed feeling - Mettallica");
        ipod.addMusic("Always on My Mind - Elvis");
        ipod.addMusic("Shot the Sheriff - Bob Marley");
        
        ipod.showAllMusics();
        
        ipod.selectMusicByPosition(1);
        ipod.pauseMusic(1);
        ipod.removeMusicByPosition(3);
        ipod.removeMusicByPosition(7);
        ipod.close();
    	
//      Testing phone
    	Phone phone = new Phone();
        
    	phone.addContact("Ana", 123);
    	phone.addContact("Paula", 321);
    	phone.addContact("Beatrice", 567);
    	
    	phone.showContacts();
    	
    	phone.removeContact("Ana");
    	phone.removeContact("Joao");
    	
    	phone.researchContactByName("Paula");        
    	phone.researchContactByName("Maria");
    	
    	phone.phoneCall("Paula");
    	phone.phoneAnswer("Paula", input);	
    	phone.phoneAnswer("Beatrice", input);
    	phone.close();
        
//    	Testing InternetBrowser
        InternetBrowser safari = new InternetBrowser();
        
        safari.addNewTab("Google", "www.google.com", "Sed ut perspiciatis unde omnis iste natus error "
        		+ "\nsit voluptatem accusantium doloremque laudantium, "
        		+ "\ntotam rem aperiam, eaque ipsa quae ab illo inventore veritatis "
        		+ "\net quasi architecto beatae vitae dicta sunt explicabo. ");
    	
        safari.displayPage("Google");
    	
    	safari.refreshPage("Google");
        
    	input.close();
    }
}
