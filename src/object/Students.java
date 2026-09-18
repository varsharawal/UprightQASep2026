package object;

public class Students {
    String name;
    String location;
    int age;
    char gender;
    boolean isStudent;
    static String schoolName = "UTS";

    public  void studyScience(){
        System.out.println(name + " is studying science.");

    }
    public void playGames(String game){
        System.out.println(name + " is playing " + game);

    }

    public static void main(String[] args) {
        Students obj1 = new Students();
        obj1.name="Varsha";
        obj1.location= "Kepler";
        obj1.age = 200;
        obj1.gender = 'f';
        obj1.isStudent = true;
        obj1.studyScience();
        obj1.playGames("Shape-Shifting");
        System.out.println(obj1.name + " " + obj1.location + " " + obj1.age + " " + obj1.gender
                + " " + obj1.isStudent + " " + Students.schoolName );
        System.out.println();

        Students obj2 = new Students();
        obj2.name="Jubaida";
        obj2.location= "Mars";
        obj2.age = 500;
        obj2.gender = 'f';
        obj2.isStudent = true;
        obj2.studyScience();
        obj2.playGames("Time Travel");
        System.out.println(obj2.name + " " + obj2.location+ " " + obj2.age + " " + obj2.gender + " " + obj2.isStudent + " " + Students.schoolName);
        System.out.println();

        Students obj3= new Students();
        obj3.name="Rony";
        obj3.location= "Jupitor";
        obj3.age = 300;
        obj3.gender = 'M';
        obj3.isStudent = true;
        obj3.studyScience();
        obj3.playGames("Meteor Dodge");

        System.out.println(obj3.name + " " + obj3.location + " " + obj3.age + " " + obj3.gender + " " + obj3.isStudent + " " + Students.schoolName);
        System.out.println();
    }
}

