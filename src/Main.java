import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Info userInfo = new Info();
        Symptoms questions = new Symptoms();
        ContactInfo runIn = new ContactInfo();

        Scanner kybd = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();

        int i = 0;
        String contact = "", userInput = "y",  symptoms = "";

        newList.add(" Fever");
        newList.add(" Cough");
        newList.add(" Shortness of breath or difficulty breathing");
        newList.add(" Tiredness");
        newList.add(" Aches");
        newList.add(" Chills");
        newList.add(" Sore throat");
        newList.add(" Loss of smell");
        newList.add(" Loss of taste");
        newList.add(" Headache");
        newList.add(" Diarrhea");
        newList.add(" Severe vomiting");

        //getting patient contact information
        System.out.println("Contact Tracing Program \nEnter a newly infected person's information");
        System.out.println("What is the patient's name? ");
        userInfo.setName(kybd.nextLine());
        System.out.println("What is the patient's phone number?");
        userInfo.setPhoneNum(kybd.nextLine());
        System.out.println("What is the patient's email?");
        userInfo.setEmail(kybd.nextLine());
        System.out.println("What city does the patient live in?");
        userInfo.setCity(kybd.nextLine());
        System.out.println("What state does a patient live in?");
        userInfo.setState(kybd.nextLine());
        System.out.println("");

        //Asking user for for symptoms and days if user has said symptom
        while(i < newList.size()){
            System.out.println("Does " + userInfo.getName() + " have any symptom for" + newList.get(i)+ "? (y/n)" );
            userInput = kybd.next().toLowerCase();
            if(userInput.equals("y")){
                System.out.println("How long has " + userInfo.getName() + " had this symptom for?");
                questions.setDays(kybd.nextInt());

                //I really wanted to avoid this type of thing but I originally had the gets in an
                //array that would then call add it to a string after but the numbers were not displaying
                if(newList.get(i).equals(" Fever")){
                    symptoms += questions.getFever();
                }
                else if(newList.get(i).equals(" Cough")){
                    symptoms += questions.getCough();
                }
                else if(newList.get(i).equals(" Shortness of breath or difficulty breathing")){
                    symptoms += questions.getBreath();
                }
                else if(newList.get(i).equals(" Tiredness")){
                    symptoms += questions.getTired();
                }
                else if(newList.get(i).equals(" Aches")){
                    symptoms += questions.getAches();
                }
                else if(newList.get(i).equals(" Chills")){
                    symptoms += questions.getChills();
                }
                else if(newList.get(i).equals(" Sore throat")){
                    symptoms += questions.getThroat();
                }
                else if(newList.get(i).equals(" Loss of smell")){
                    symptoms += questions.getSmell();
                }
                else if(newList.get(i).equals(" Loss of taste")){
                    symptoms += questions.getTaste();
                }
                else if(newList.get(i).equals(" Headache")){
                    symptoms += questions.getHead();
                }
                else if(newList.get(i).equals(" Diarrhea")){
                    symptoms += questions.getDiarrhea();
                }
                else if(newList.get(i).equals(" Severe vomiting")){
                    symptoms += questions.getVomit();
                }
            }
            i++;
        }

        userInput = "y";
        System.out.println("");

        //Asking user for people Contacted in-person
        while(userInput.equals("y")){
            System.out.println("Has " + userInfo.getName() + " met or run into anyone? (y/n)");
            userInput = kybd.next().toLowerCase();

            if(userInput.equals("y")){
                System.out.println("What is his/her name?");
                runIn.setName(kybd.next());
                System.out.println("What is his/her phone number?");
                runIn.setPhoneNum(kybd.next());
                System.out.println("What is his/her email?");
                runIn.setEmail(kybd.next());

                contact += runIn.displayContacts();
            }
        }

        //Displaying Information
        System.out.println("****** Contact Tracing Report ******");
        System.out.println(userInfo.displayInfo());
        System.out.println("\n");
        System.out.println("**          Symptoms:");
        System.out.println(symptoms);
        System.out.println("\n");
        System.out.println("**          Contacts:");
        System.out.println(contact);
    }
}