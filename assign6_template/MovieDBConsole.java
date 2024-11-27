//File: MovieDBConsole.java
//You don't need to change this class.
//The class for the console application of the Movie Database.

package assign6_template;
/* CIS 2168 Data Structures
 *  Section Number: 003
 *  Colden Jeanmonod tur26337@temple.edu
 *  Assignment Name: Assign 7
 *  Class Name: MovieDBConsole
 *  Runs through a method of organizing the MovieDb code
 *  I USED ECLIPSE IDE
 */
public class MovieDBConsole {

    public static void main(String[] args) {
        //create an empty movie database
        MovieDB myMovieDB = new MovieDB();
        //populate the movie DB with random movie data
        myMovieDB.createStartMovieDB();
        //display the starter movie DB information
        myMovieDB.showMovieDB();

        //create the movie title index
        myMovieDB.createIndex();
        //display the movie title index
        myMovieDB.showIndex();
    }

}
