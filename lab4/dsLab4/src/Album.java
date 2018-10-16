/**
 * Album.java
 * @author alexandrecastro
 * 10-01-28
 * CS208 Data Structures
 * 
 * This is the Album class, it provides the title of an Album with the number of
 * tracks.
 */
public class Album {
    private String title;
    private int tracks;
    
    public Album(){
        title = "generic";
        tracks = 0;
    }
    
    public Album(String title, int tracks){
        this.title = title;
        this.tracks = tracks;
    }
    
    public String getTittle(){
        return title;
    }
    
    public int getTracks(){
        return tracks;
    }
    
    public String toString(){
        return "Album title: " + title + "\nNumber of tracks: " + tracks + 
                "\n";
    }
}
