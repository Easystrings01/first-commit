package Home;

public interface Classes_Object_Test {
    public static void main(String[] args) {
        Movie one = new Movie ();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        one.year = 2020;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.year = 2021;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
        three.year = 2023;

        Movie four = new Movie();
        four.title = "Falling in love";
        four.genre = "Romance";
        four.rating = 3;
        four.year = 2023;

        System.out.println( one.title + " a"+ " " + one.genre + " "+" movie which is rated" +" "+ one.rating +"produced in the year " + " " + one.year);
        System.out.println( two.title + " a"+ " " + two.genre + " "+" movie which is rated" +" "+ two.rating +"produced in the year " + " " + two.year);
        System.out.println( three.title + " a"+ " " + three.genre + " "+" movie which is rated" +" "+ three.rating +"produced in the year " + " " + three.year);
        System.out.println( four.title + " a"+ " " + four.genre + " "+" movie which is rated" +" "+ four.rating +"produced in the year " + " " + four.year);
    }
}

class Movie{
    String title;
    String genre;
    int rating;
    int year;

    void playIt(){
        System.out.println("Playing the movie");
    }
}
