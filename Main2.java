import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        boolean menu = true;

        System.out.println("Welcome to E-Course");
  
        // Create instances of your classes
        Course course1 = new Course(1000, "HTML", "This session is to practice basic programming in HTML", 190000);
        Course course2 = new Course(1001, "Java Script ", "This session is to practice basic programming in HTML", 200000);
        Course course3 = new Course(1873, "PHP", "This session is to practice basic programming in HTML", 190000);
        Instructorr instructor1 = new Instructorr(1900, "Majid", "Erwan Majid", course1);
        Instructorr instructor2 = new Instructorr(1901, "Seno", "Baskoro Seno Aji", course2);
        Instructorr instructor3 = new Instructorr(1903, "Khen", "Khen Cahyo", course3);
        Participant participant1 = new Participant("Xavier", "Xavier Zaidane", course1);
        Participant participant2 = new Participant("Arka", "Febrian Arka Samudra", course2);
        Participant participant3 = new Participant("Baihaqi", "M Rizal Al Baihaqi", course3);
        Video video1 = new Video(3840, "2 Hours", "Basic HTML 1", "Video");
        Payment payment1 = new Payment(84848, 27, 19000, "Transfer");
        Payment payment2 = new Payment(1234, 29, 19000, "Cash");
        
        // Loop to display the menu
        while (menu) {
            menu = displayMenu(scanner, instructor1, instructor2, instructor3, participant1, participant2, participant3, course3, payment1, payment2, video1);
        }

        scanner.close();  // Close the scanner to prevent resource leaks
        
    }
    // Method to display menu options1

    private static boolean displayMenu(Scanner scanner, Instructorr instructor1, Instructorr instructor2, Instructorr instructor3, Participant participant1, Participant participant2, Participant participant3, Course course, Payment payment1, Payment payment2 ,Video video) {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. View Course Details");
        System.out.println("2. View Instructor Info");
        System.out.println("3. Choose Course");
        System.out.println("4. View Video Info");
        System.out.println("5. Exit");
        System.out.print("Choose : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nCourse Details:");
                participant1.infoParticipant();
                participant2.infoParticipant();
                participant3.infoParticipant();
                break;
            case 2:
                System.out.println("\nInstructor Info:");
                instructor1.introduceSelf();
                instructor1.infoinstructor();
                instructor2.introduceSelf();
                instructor2.infoinstructor();
                instructor3.introduceSelf();
                instructor3.infoinstructor();
                break;
                case 3:
                System.out.println("Choose course");
                course.ChooseCourse();

                int ChooseCourseandPayment = scanner.nextInt();
            switch (ChooseCourseandPayment) {
                case 1:
                    System.out.println("-------1.HTML-------- ");
                    System.out.println("Input your username");
                    String name = scanner.next();
                    if (name.equalsIgnoreCase("Xavier")) {
                        participant1.infoParticipant();
                        payment1.detailPembayaran();
                    }
                    else if (name.equalsIgnoreCase("Arka")) {
                        participant2.infoParticipant();
                        payment2.detailPembayaran();

                    }else if (name.equalsIgnoreCase("Baihaqi")) {
                        participant3.infoParticipant();
                        payment2.detailPembayaran();
                    }
                    break;
                case 2:
                System.out.println("-----2.Javascript-------");
                System.out.println("Input your username");
                String namej = scanner.next();
                if (namej.equalsIgnoreCase("xavier")) {
                    participant1.infoParticipant();
                    payment1.detailPembayaran();
                }
                else if (namej.equalsIgnoreCase("arka")) {
                    participant2.infoParticipant();
                    payment2.detailPembayaran();

                }else if (namej.equalsIgnoreCase("Baihaqi")) {
                    participant3.infoParticipant();
                    payment2.detailPembayaran();
                }
                    break;
                case 3:
                System.out.println("-----3.PHP-------");
                System.out.println("Input your username");
                String namep = scanner.next();
                if (namep.equalsIgnoreCase("xavier")) {
                    participant1.infoParticipant();
                    payment1.detailPembayaran();
                }
                else if (namep.equalsIgnoreCase("arka")) {
                    participant2.infoParticipant();
                    payment2.detailPembayaran();

                }else if (namep.equalsIgnoreCase("Baihaqi")) {
                    participant3.infoParticipant();
                    payment2.detailPembayaran();
                }
                    break;
            }
                System.out.println("\nPayment Details:");
                
                break;
            case 4:
                System.out.println("\nVideo Info:");
                video.infoVideo();
                break;
            case 5:
                System.out.println("Thank you for visiting E-Course!");
                return false;  // Exit the menu

            case 6:
            System.out.println("List course");
            course.ChooseCourse();
            
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        return true;  // Continue displaying the menu
    }
}


