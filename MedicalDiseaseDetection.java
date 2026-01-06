import java.util.Scanner;

public class MedicalDiseaseDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================================");
        System.out.println("   WELCOME TO ONLINE MEDICAL TEST (Your Life, Our Care)");
        System.out.println("==============================================================");

        System.out.print("Enter Name   : ");
        String name = sc.next();

        System.out.print("Enter Gender : ");
        String gender = sc.next();

        System.out.print("Enter Age    : ");
        int age = sc.nextInt();

        System.out.println("\nAnswer the following questions (yes/no):");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Do you have cough? ");
        String cough = sc.next();

        System.out.print("Do you have running nose? ");
        String runningNose = sc.next();

        System.out.print("Do you have sneezing? ");
        String sneezing = sc.next();

        System.out.print("Do you have shortness of breath? ");
        String breath = sc.next();

        System.out.print("Do you have chest pain? ");
        String chestPain = sc.next();

        System.out.print("Do you have digestive issues? ");
        String digestion = sc.next();

        System.out.print("Do you have stomach ache? ");
        String stomachAche = sc.next();

        System.out.print("Do you have high body temperature? ");
        String temperature = sc.next();

        System.out.print("Do you have cold hands or legs? ");
        String coldBody = sc.next();

        System.out.print("Do you have headache? ");
        String headache = sc.next();

        System.out.println("--------------------------------------------------------------");

        if (cough.equalsIgnoreCase("yes") &&
            runningNose.equalsIgnoreCase("yes") &&
            sneezing.equalsIgnoreCase("yes")) {

            printDisease("COMMON COLD", name, gender, age,
                    "Drink hot lemon water with honey\nTake antiviral medication\nDrink plenty of water\nTake proper rest\nAvoid cold exposure",
                    "1 Week");

        } else if (cough.equalsIgnoreCase("yes") &&
                   breath.equalsIgnoreCase("yes") &&
                   chestPain.equalsIgnoreCase("yes")) {

            printDisease("RESPIRATORY INFECTION", name, gender, age,
                    "Take prescribed antibiotics\nDrink plenty of water\nTake rest\nAvoid smoking",
                    "1 Week");

        } else if (stomachAche.equalsIgnoreCase("yes") &&
                   digestion.equalsIgnoreCase("yes")) {

            printDisease("FOOD POISONING", name, gender, age,
                    "Replace lost fluids\nEat light food\nDrink ORS\nTake rest",
                    "1 Week");

        } else if (chestPain.equalsIgnoreCase("yes") &&
                   coldBody.equalsIgnoreCase("yes")) {

            printDisease("HEART-RELATED ISSUE", name, gender, age,
                    "Avoid oily food\nReduce stress\nConsult a cardiologist\nMaintain a healthy lifestyle",
                    "Depends on medical condition");

        } else {
            System.out.println("?? Disease could not be identified based on symptoms.");
            System.out.println("Please consult a medical professional.");
        }

        sc.close();
    }

    private static void printDisease(String disease, String name, String gender, int age,
                                     String treatment, String duration) {

        System.out.println("\n?? Disease Identified: " + disease);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Treatment Plan:");
        System.out.println(treatment);
        System.out.println("--------------------------------------------------------------");
        System.out.println("MEDICAL REPORT");
        System.out.println("Patient Name : " + name);
        System.out.println("Gender       : " + gender);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
        System.out.println("Recovery Time: " + duration);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Thank You! (Your Life, Our Care)");
    }
}
