public class Participant extends Person {
    private int id_participant;
    private static int id_counter = 001;
    private String lesson;
    private Course name_course;
    
    public Participant ( String nickName,String fullName,Course name_course){
        super(nickName, fullName);
        this.id_participant = id_counter++;
        this.lesson = name_course.getNameCourse();
    }

    public int getid_participant(){
        return id_participant;
    }

    public void setid_participant (int id_participant){
        this.id_participant = id_participant;
    }

    public void introduceSelf() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Hello, I am Participant " + getnickName() + ", ready to learn!" + lesson);
    }

    public void infoParticipant(){
        String formattedId = String.format("%03d", id_participant);
        System.out.println("Name participant "+getnickName());
        System.out.println("Full Name :"+getfullName());
        System.out.println("ID: " + formattedId);
        System.out.println("Participant : " +lesson);
    }

}
