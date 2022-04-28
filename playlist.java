import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        //Creating playlist
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        //Adding songs to playlist
        desertIslandPlaylist.add("Day One - Hans Zimmer");
        desertIslandPlaylist.add("Del Ray - Solo Rosa");
        desertIslandPlaylist.add("Iko Iko - Justin Wellington");
        desertIslandPlaylist.add("Stunder Som Den Här - Bo Kaspers Orkester");
        desertIslandPlaylist.add("love twantiti - Ckay");
        desertIslandPlaylist.add("Happiness Does Not Wait - Olafur Arnalds");
        desertIslandPlaylist.add("Norrland - Gidge");

        //Printing playlist
        //System.out.println(desertIslandPlaylist);

        //Check size of playlist
        //System.out.println(desertIslandPlaylist.size());

        //Removing songs from playlist
        desertIslandPlaylist.remove("Del Ray - Solo Rosa");
        desertIslandPlaylist.remove("Norrland - Gidge");

        //Swapping songs and storing the values in each variable
        int indexA = desertIslandPlaylist.indexOf("Stunder Som Den Här - Bo Kaspers Orkester");
        int indexB = desertIslandPlaylist.indexOf("Happiness Does Not Wait - Olafur Arnalds");

        String tempA = "Stunder Som Den Här - Bo Kaspers Orkester";

        desertIslandPlaylist.set(indexA,"Stunder Som Den Här - Bo Kaspers Orkester");
        //System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);

    }

}
