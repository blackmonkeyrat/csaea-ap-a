public class Song {
    
    //ATTRIBUTES instance variables . . . . hold DATA for each song

    private String title;
    private String artist;
    private int plays;

    //CONSTRUCTOR

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        plays = 0;

    }

    //METHODS / BEHAVIORS

    public void play() {
        plays++;
    }

    public int getPlays() {
        System.out.println(plays);
        return plays;
    }

    public String toString() {

        if (plays == 1) {
            return title + " by " + artist + " - " + plays + "play";

        } 
        else {
            return title + " by " + artist + " - " + plays + "plays";

        }
    }

    public String getStars() {
        
    }

}
