import java.util.ArrayList;
import java.util.Scanner;
public class main1 {
    
        
    
    public static void main(String[] args)
{
   System.out.println ("Welcome to Aadhi's Top 10 songs");
   String aa1 = InputReader.getString("Shall we get started?");
   



    music patampoochi = new music("patampoochi", "Aadhi", 21162);
   patampoochi.print();
   music sadboi = new music("sad boi ", "Aadhi",10609);
   sadboi.print();
   music oodhu = new music("oodhu","Aadhi" ,957);
   oodhu.print();
   music isaiye = new music("isaiye","Aadhi" ,832);
   isaiye.print();
   music vatikuchi = new music("vatikuchi","Aadhi",730);
   vatikuchi.print();
   music parkathey = new music("Parkathey","Aadhi",678);
   parkathey.print();
   music sirukki = new music("Sirukki","Aadhi",599);
   sirukki.print();
   music thuglove = new music("Thug Love", "Aadhi", 450);
   thuglove.print();
   music ayirathiloruthi = new music("Ayirathil Oruthi", "Aadhi", 445);
   ayirathiloruthi.print();
   music heated = new music("Heated", "Aadhi", 426);
   heated.print();

   ArrayList<music> songs = new ArrayList<music>();
   songs.add(patampoochi);
   songs.add(sadboi);
   songs.add(oodhu);
   songs.add(isaiye);
   songs.add(vatikuchi);
   songs.add(parkathey);
   songs.add(sirukki);
   songs.add(thuglove);
   songs.add(ayirathiloruthi);
   songs.add(heated);
   int songnumber = 0 ;
        for(music song : songs){
            System.out.println("No: "+songnumber+"\t");
            song.print();
            songnumber++;
        }
String aa2 = InputReader.getString(" Do you want to add a song to list ? ");
 if (aa2.equalsIgnoreCase("yes") ){
    String songsadd = InputReader.getString(" Please enter the name of the song :");
    String artistadd = InputReader.getString(" Please enter name of the songs artist :");
    int playcountadd = InputReader.getInt(" Please enter playcount of the song");
    System.out.print("song:" + songsadd + "/t");
    System.out.print("artist:" + artistadd + "/t");
    System.out.print("playcount:" + playcountadd + "/t");
    music newsong = new music(songsadd, artistadd, playcountadd );
    songs.add(newsong);
    for (music i:songs) {
        i.print();
    
    int aa3 =InputReader.getInt(" Do you want to remove song from the list ?( Pick a song number from 0 to 10 to remove) >");
    String aa4 = InputReader.getString("please confirm this removal " + aa3 +"?");
    if (aa4.equalsIgnoreCase("yes")){
    songs.remove(aa3);
    for( music l :songs) {
        System.out.print("Songnumber: 0");
        l.print(); 
    } 
{
    try (Scanner choose = new Scanner(System.in)){
        System.out.println("Enter number of playcounts of songs you're searching ");
        int playcount = choose.nextInt();
        for (music music : songs){
          if (playcount <= music.getPlaycount()){
              music.print();
              System.out.println(); }
          }



    System.out.println("Thank you for using this service");


}
  }
}








}}}}