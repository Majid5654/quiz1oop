public class Course {
    private int id_course;
    private String name_course;
    private String description;
    private int price ;
    
    public Course (int id_course,String name_course,String description,int price){
        this.id_course = id_course;
        this.name_course = name_course;
        this.description = description;
        this.price = price;
    }

    public int getId_course() {
        return id_course;
    }

    public String getNameCourse(){
        return name_course;
    }

    public void setNameCourse (String NameCourse){
        this.name_course = NameCourse;
    }

    public String getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description = description;
    }

    public int getprice(){
        return price;
    }

    public void setprice(int price){
        this.price = price;
    }

    public void ChooseCourse (){
        System.out.println("1.HTML");
        System.out.println("2.JavaScript");
        System.out.println("3.PHP");
        System.out.println("--------------------");
        System.out.println("Choose(1-3)");
    }
}