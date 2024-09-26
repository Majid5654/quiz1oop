public class Participant extends Person {
    private int id_participant;
    private String lesson;
    private Course name_course;
    
    public Participant (int id_participant, String nickName,String fullName,Course name_course){
        super(nickName, fullName);
        this.id_participant = id_participant;
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
        System.out.println("Name participant "+getnickName());
        System.out.println("ID " +id_participant);
        System.out.println("Participant : " +lesson);
    }

}
