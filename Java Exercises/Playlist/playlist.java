import java.util.LinkedList;
class playlist {
    public static void main(String[] args) {
        // mas magandang practice kapag magkakasama ang mga linked list mo
        LinkedList<String> songs = new LinkedList<String>();
        LinkedList<String> artists = new LinkedList<String>();
        LinkedList<String> playlists = new LinkedList<String>();
        
        // add 5 song titles
        songs.add("We Belong Together");
        songs.add("Million Reasons");
        songs.add("The Climb");
        songs.add("Who You Are");
        songs.add("A Woman's Worth");
        
        // add 5 artists
        artists.add("Mariah Carey");
        artists.add("Lady Gaga");
        artists.add("Miley Cyrus");
        artists.add("Jessie J");
        artists.add("Alicia Keys");
        
        // combine songs and artists to playlists
        for(int i = 0; i < songs.size(); i++){
            // bali 5 times mag rarun tong code sa baba dahil nasa for loop sya. aralin mo forloop! haha
           playlists.add(songs.get(i) + " - " + artists.get(i));
        }    
        
        // display songs linkedlist
        System.out.println(songs);
        
        // display artists linkedlist
        System.out.println(artists);
        
        // display playlist in separate lines
        for(int i = 0; i < playlists.size(); i++){
            // 5 times mag rarun tong print 
            System.out.println(playlists.get(i));
        }  
        
    }
}