import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        boolean menu = true;

        System.out.println("Welcome to E-Course");
  
        // Create instances of your classes
        Course course1 = new Course(1873, "Basic Program", "This session is to practice basic programming in HTML", 19000);
        Instructorr instructor1 = new Instructorr(1902, "Majid", "Erwan Majid", course1);
        Participant participant1 = new Participant("Majid", "ERWANNN", course1);
        Participant participant2 = new Participant("Arka", "Febrian Arka Samudra", course1);
        Video video1 = new Video(3840, "2 Hours", "Basic HTML 1", "Video");
        Payment payment1 = new Payment(84848, 27, 19000, "Transfer");

        // Loop to display the menu
        while (menu) {
            menu = displayMenu(scanner, instructor1, participant1, participant2, course1, payment1, video1);
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }

    // Method to display menu options1
    
    private static boolean displayMenu(Scanner scanner, Instructorr instructor, Participant participant1, Participant participant2, Course course, Payment payment, Video video) {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. View Course Details");
        System.out.println("2. View Instructor Info");
        System.out.println("3. View Payment Details");
        System.out.println("4. View Video Info");
        System.out.println("6. add Course");
        System.out.println("5. Exit");
        System.out.print("Choose : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nCourse Details:");
                course.Courseinfo();
                participant1.infoParticipant();
                participant2.infoParticipant();
                break;
            case 2:
                System.out.println("\nInstructor Info:");
                instructor.introduceSelf();
                instructor.infoinstructor();
                break;
            case 3:
                System.out.println("\nPayment Details:");
                payment.detailPembayaran();
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
