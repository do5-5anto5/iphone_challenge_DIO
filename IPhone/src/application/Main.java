package application;

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
        ipod.close();
    	
//      Testing phone
    	Phone phone = new Phone();
        
    	phone.addContact("Ana", 123);
    	phone.addContact("Paula", 321);
    	
    	phone.showContacts();
    	
    	phone.removeContact("Ana");
    	phone.removeContact("Joao");
    	
    	phone.researchContactByName("Paula");        
    	phone.researchContactByName("Maria");
    	
    	phone.phoneCall("Paula");
    	phone.phoneAnswer("Paula");	
    	phone.close();
    }
}
