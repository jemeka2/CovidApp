import java.util.ArrayList;

public class Symptoms {
    private int days;
    private Info person;
    public Symptoms(){}

    public void setDays(int days) {
        this.days = days;
    }

    public String getFever() {
        return "had Fever for " + days + " days\n";
    }

    public String getCough() {
        return "had Cough for " + days + " days\n";
    }

    public String getBreath() {
        return "had Difficulty breathing for " + days + " days\n";
    }

    public String getTired() {
        return "Was Tired for " + days + " days\n";
    }

    public String getAches() {
        return "had Aches for " + days + " days\n";
    }

    public String getChills() {
        return "had Chills for " + days + " days\n";
    }

    public String getThroat() {
        return "had a Sore Throat for " + days + " days\n";
    }

    public String getSmell() {
        return "had loss of Smell for " + days + " days\n";
    }

    public String getTaste() {
        return "had Loss of Taste for " + days + " days\n";
    }

    public String getHead() {
        return "had Headache for " + days + " days\n";
    }

    public String getDiarrhea() {
        return "had Diarrhea for " + days + " days\n";
    }

    public String getVomit() {
        return "had Severe Vomiting for " + days + " days\n";
    }

    public void setPerson(Info person) {
        this.person = person;
    }
    public Info getPerson() {
        return person;
    }

    //I didn't know what to use composition for other then this
    public void presentPatient(){
        Info tempPatient = this.getPerson();
        String patient = tempPatient.getName();
        System.out.println("\n" + patient + "'s symptom's are: ");
    }
}
