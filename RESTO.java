package hmm;
import java.util.*;

public class Pizzabillpro {
    public static class Resto {
        public String krishna;
        public String Sayaji;
        public String Delux;
        public String Radha;
        public String Sayaj;

        public Resto(String Krishna, String Sayaji, String Delux, String Radha, String Sayaj) {
            this.krishna = Krishna;
            this.Sayaji = Sayaji;
            this.Delux = Delux;
            this.Radha = Radha;
            this.Sayaj = Sayaj;
        }

        public void display() {
            System.out.println("\n___Restaurant Names___:");
            System.out.println("1. " + krishna);
            System.out.println("2. " + Sayaji);
            System.out.println("3. " + Delux);
            System.out.println("4. " + Radha);
            System.out.println("5. " + Sayaj);
        }

        
        
        
        
        public static class Res {
            public int chicken = 100;
            public int chickenroll = 200;
            public int chickenburger = 300;

            public int paneerChili = 100;
            public int paneerTikka = 200;
            public int paneerKabab = 300;

            public void Krishna() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Veg(1)||Non-Veg(2):");
                int j = sc.nextInt();

                if (j == 2) {
                    System.out.println("Non-Veg");
                    System.out.println("\n__________MENU___________");
                    System.out.println("1. Chicken 65 ₹" + chicken);
                    System.out.println("2. Chicken Roll ₹" + chickenroll);
                    System.out.println("3. Chicken Burger ₹" + chickenburger);
                } else {
                    System.out.println("Veg");
                    System.out.println("\n_________MENU__________");
                    System.out.println("1. Paneer Chili ₹" + paneerChili);
                    System.out.println("2. Paneer Tikka ₹" + paneerTikka);
                    System.out.println("3. Paneer Kabab ₹" + paneerKabab);
                }

                // Order Calculation
                System.out.println("Enter the item number to order:");
                int item = sc.nextInt();
                 System.out.println("Enter the quantity of item:");
                 int quantity =sc.nextInt();
                int totalBill = calculateBill(j, item);
                System.out.println("SGST :₹"+(totalBill*quantity)*5/100);
                int u=(totalBill*quantity)*5/100;
                System.out.println("CGST: ₹"+(totalBill*quantity)*5/100);
                int y=(totalBill*quantity)*5/100;
                System.out.println("Total Bill: ₹" + (totalBill*quantity+u+y));
                System.out.println("____________________________________THANK YOU_________________________________________");
                sc.close();
                }
            

            // Method to calculate bill
            public int calculateBill(int category, int item) {
                if (category == 2) { // Non-Veg
                    switch (item) {
                        case 1: return chicken;
                        case 2: return chickenroll;
                        case 3: return chickenburger;
                        default:
                            System.out.println("Invalid selection.");
                            return 0;
                    }
                } else { // Veg
                    switch (item) {
                        case 1: return paneerChili;
                        case 2: return paneerTikka;
                        case 3: return paneerKabab;
                        default:
                            System.out.println("Invalid selection.");
                            return 0;
                    }
                }
            }
        }

        public void Menu(Scanner sc) {
                System.out.println("\n___ENTER YOUR PREFERENCE (ENTER 0 to EXIT)___:");
                int i = sc.nextInt();
                if (i == 0) {
                    System.out.println("Exiting the menu.");
                    
                }
                switch (i) {
                    case 1: System.out.println("WELCOME TO " + krishna); break;
                    case 2: System.out.println("WELCOME TO " + Sayaji); break;
                    case 3: System.out.println("WELCOME TO " + Delux); break;
                    case 4: System.out.println("WELCOME TO " + Radha); break;
                    case 5: System.out.println("WELCOME TO " + Sayaj); break;
                    default: System.out.println("Invalid choice. Please select again.");
                }
            }
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Resto resto = new Resto("Krishna Hotel", "Sayaji Hotel", "Delux Hotel", "Radha Hotel", "Sayaj Hotel");
        resto.display(); // Show restaurant names
        resto.Menu(sc);  // Open menu selection

        // Creating an instance of Res (inside Resto)
        Resto.Res resObj = new Resto.Res();
        resObj.Krishna(); // Call the method to show the menu and calculate the bill

        sc.close();
    }
}
