
public class MusicBox {

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;
    public int noAds;

    //Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        this.songTitle = title;
        this.songAlbum = Album;
        this.songGenre = genre;
        this.songProducer = producer;
        this.songMusicLabel = label;

        // -- TODO
        /* Initialise  the rest of the variables in this Constructor block*/
    }


    //Methods
    public String getSongID() {
        return songID;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }

    public void setSongArtists(String songArtists) {
        this.songArtists = songArtists;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public void setIsSongPremium(char isSongPremium) {
        this.isSongPremium = isSongPremium;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(String songAlbum) {
        this.songAlbum = songAlbum;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    public String getSongProducer() {
        return songProducer;
    }

    public void setSongProducer(String songProducer) {
        this.songProducer = songProducer;
    }

    public String getSongMusicLabel() {
        return songMusicLabel;
    }

    public void setSongMusicLabel(String songMusicLabel) {
        this.songMusicLabel = songMusicLabel;
    }

    public int getNoAds() {
        return noAds;
    }

    public void setNoAds(int noAds) {
        this.noAds = noAds;
    }
    // -- TODO
    /* Create the rest of "getters" for the remaining variables */

}


