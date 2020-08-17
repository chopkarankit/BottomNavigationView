package com.example.bottomnavigationview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump
{
    public static HashMap<String, List<String>> getData()
    {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> cricket = new ArrayList<>();
        cricket.add("Everyone has the chance to show in hot live. hee are a few suggestions for you:\n1. Enriching your live content and actively interacting with your viewers will add your chances to be recommended in hot live.\n2. set your cover with clear and and beautiful real person image will help you stand out.\n3. promote your broadcast by sharing the link on other social networks such as instagram, facebook and twitter, and invite your friends to watch before you go live will be the best way to gain viewers in your broadcast.\n4. Additionally, we have hot gift to make you popular receiving hot gift and increasing your popularity value you will have the chance to get on top of the popular list or country list.");

        List<String> football = new ArrayList<>();
        football.add("the private room will not be seen and joined by any user unless you invite. in the private room, the host and viewers should comply with the local laws and regulations as well as community convention of BIGO live otherwise actions will be taken if there is any violations");


        List<String> basketball = new ArrayList<>();
        basketball.add("When You Prepare to live you, you will see 4 icons on the upper right corner click the 'lock' icon at the right and you will enter private room.the private room will not be seen and joined by any user unless you inite.");


        List<String> hockey = new ArrayList<>();
        hockey.add("You Can hide Your location by tapping on 'Me'-> 'Setting' -> 'privacy' -> 'hide location in profile'");

        List<String> runny = new ArrayList<>();
        runny.add("Please confirm weather you have enable the push permission from BIGO live.\nHow to confirm:\ngo to System Setting of your phone-> 'Notifications'-> 'Bigo live' to check the permission approval information");

        List<String> bat = new ArrayList<>();
        bat.add("Your account Will be banned if you violate the community convention of BIGO live. Please read the detailed community convention before you go live >>> 'Me' -> 'Setting' -> 'About us' -> 'community convention'\nif you see violtions, please report to us so that our censor can investigate the issue at once.\n\nHow to report :\nyou can do this by tapping on the user's name or avatar or messages, navigating to 'Report' icon on the upper left corner of user's mini-profile.");
        expandableListDetail.put("Under what circumstances will i be banned?",bat);

        List<String> tab = new ArrayList<>();
        tab.add("Unfortunately, we prohibit usage of our official logo, name or likeness as a part of user's account information without approval if you use BIGO logo as avatar your avatar will be banned");
        expandableListDetail.put("Can I use the BIGO Live logo as my profile picture?",tab);


        List<String> man = new ArrayList<>();
        man.add("Please Check the Rewards granted date in the activity page if it has passed the granted date and you haven't Received the rewards yet Please submit your issue via 'Feedback' and provide your activity data, the our customer service will help you process it");
        expandableListDetail.put("wht I haven't received my activityrewards?", man);

        List<String> wan = new ArrayList<>();
        wan.add("if you want to perform in Live House, Please send the following information to apply:\na. Your Full Name\nb. BIGO ID\nc. Your Contact Phone Number With Country Code + Area Code.\nd. Screenshot Of Your Performances in BIGO Live\ne. The URL Of The Daily Live streaming performance\nSend Your Information to :\n1. Global Live House(Music Live House):thebigoer@gmail.com\n2. india Live House:indialivehouse@gmail.com\n3. Indonesia Live House:Contact Line ID:ofchostbigoadmin\n4. Thailand Live House:feedback.th@bigo.tv\n5. Cambodia Live House:cambodia@bigo.tv OR Contact BIGO ID:gagalovecat\n6. My Live House:norazmi@bigo.sg\n7. Brazil Live House: Contato@bigo.tv\n8. Es Live House: Contact BIGO ID: 195550052 OR huangjiaqi3@BIGO.sg\n9. Russia Live House: bigolive@mail.ru\n10. MENA Live House: Contact BIGO ID: MenaCS\n11. Korea Live House: contact KAKAOTALK plus friend ID:bigolivekorea");
        expandableListDetail.put("How to apply for Live House?", wan);

        List<String> jack = new ArrayList<>();
        jack.add("1. Tap and Hold the record button then You'll be able to record 17 second video.\n2. Click The Record Button For 3 Times in succession then You'll be able to record 57 second video.");
        expandableListDetail.put("How to record video for over 15 Seconds?", jack);

        List<String> van = new ArrayList<>();
        van.add("if you can't send meassages, there may be a few reasons:\n1. there are sensitive words in the messages, and modifying Your Messages Would be a suggestion.\n2. You are not allowed to send photos and videos when you are unfollowed.\n3. you can only send messages to 10 unfollow people at most per day.\n4. if you are blocked by someone, you cannot send messages to him/her.\nif your situation do not confirm to the reason above, please submit your issue via 'Feedback', and our online customer service will help you with it.");
        expandableListDetail.put("Why I cannot send messages?", van);

        List<String> ball = new ArrayList<>();
        ball.add("Sorry that Once the messages are deleted You can't restore them any more.");
        expandableListDetail.put("I have deleted the messages, how can i Restore?", ball);

        expandableListDetail.put("How Can I be Popular in BIGO live?", cricket);
        expandableListDetail.put("What is Private Room? Will it be inspected?", football);
        expandableListDetail.put("How to live in Private Room?", basketball);
        expandableListDetail.put("How to hide my location?", hockey);
        expandableListDetail.put("I can't Receive notification from BIGO live?", runny);
        return expandableListDetail;


    }
}
