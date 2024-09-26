public class Instructorr extends Person {
    private int id_instruktur;
    private String nameLesson;
    private Course name_course;

    public Instructorr(int id_instruktur, String nickName, String fullName, Course name_course) {
        super(nickName,fullName);
        this.id_instruktur = id_instruktur;
        this.nameLesson = name_course.getNameCourse();
    }

    // Getter and Setter for Encapsulation
    public int getId_instruktur() {
        return id_instruktur;
    }

    public void setId_instruktur(int id_instruktur) {
        this.id_instruktur = id_instruktur;
    }

    public String getnameLesson() {
        return nameLesson;
    }

    public void setnameLesson (String nameLesson) {
        this.nameLesson = nameLesson;
    }

    //Polymorphism
    public void introduceSelf() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Hello, I am Instructor " + getfullName() + " You can call me " + getnickName() + ", and I specialize in: " +nameLesson);
    }

    public void infoinstructor(){
        System.out.println("Name Instructor: " + getnickName() );
        System.out.println("ID: " + id_instruktur);
        System.out.println("teacher " +nameLesson);
        System.out.println("=======================================================================================================");
    }
}

