import java.util.Scanner;

    public class Moms {

    public static void main(String[] args) {

        plusDanskMoms();
        plusTyskMoms();


/*
    Scanner input = new Scanner(System.in);


     System.out.print("Indtast indkøbspris DKK: ");
     double indkoebspris = input.nextDouble();

     double skat = indkoebspris * 0.25;
     System.out.println("Købsmoms er DKK " + (int)(skat * 100) / 100.0);
        System.out.println("Samlet købspris i DKK er " + (indkoebspris + skat));*/
    }

        public static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);
            System.out.println("Indtast indkøbspris på vare købt i Danmark: ");
            double indkoebspris = input.nextDouble();
            double moms = indkoebspris * 0.25;
            System.out.println("Købsmoms er DKK " + (int)(moms * 100) / 100.0);
            System.out.println("Samlet købspris i DKK er " + (indkoebspris + moms));
        }

        public static void plusTyskMoms() {
        Scanner input = new Scanner(System.in);
            System.out.println("Indtast indkøbspris på vare købt i Tyskland: ");
            double indkoebspris = input.nextDouble();
            double moms = indkoebspris * 0.16;
            System.out.println("Købsmoms er DKK " + (int)(moms * 100) / 100.0);
            System.out.println("Samlet købspris i DKK er " + (indkoebspris + moms));

        }
    }

