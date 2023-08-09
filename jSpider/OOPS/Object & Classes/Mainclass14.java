


class Movie{

    String titale;
    String writer;
    String producer;
    String director;
    String actors;
    String singer;
    String choreographer;

}

class Mainclass14{
    public static void main(String[] args) {

        //creating object and thier referances

        Movie m1 = new Movie();

        //asssigning / initiliaztiing teh values 

        m1.titale="3 Idiot";
        m1.writer="vasunka wanger";
        m1.producer="Jock soleman";
        m1.director="Jock soleman";
        m1.actors="Amir Khan";
        m1.singer="Arijit singh";
        m1.choreographer="Romy desuza";

        //printing the values

        System.out.println(m1.titale);
        System.out.println(m1.director);
        System.out.println(m1.producer);
        System.out.println(m1.writer);
        System.out.println(m1.actors);
        System.out.println(m1.singer);
        System.out.println(m1.choreographer);

        //creating new object


        Movie m2 = new Movie();

        //asssigning / initiliaztiing teh values 

        m2.titale="Krrish 3";
        m2.writer="Rakesh Roshan";
        m2.producer="Rakesh Roshan";
        m2.director="Rakesh Roshan";
        m2.actors="Hritik Roshan";
        m2.singer="Rahat fali ali khan";
        m2.choreographer="Romy desuza";


        //printing the values

        System.out.println(m2.titale);
        System.out.println(m2.director);
        System.out.println(m2.producer);
        System.out.println(m2.writer);
        System.out.println(m2.actors);
        System.out.println(m2.singer);
        System.out.println(m2.choreographer);


        
    }
}