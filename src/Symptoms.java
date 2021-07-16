public class Symptoms {

    private int days;

    public Symptoms(){}

    public void setDays(int days) {
        this.days = days;
    }

    public String getFever() {
        return "\nhad Fever for " + days + " days";
    }

    public String getCough() {
        return "\nhad Cough for " + days + " days";
    }

    public String getBreath() {
        return "\nhad Difficulty breathing for " + days + " days";
    }

    public String getTired() {
        return "\nWas Tired for " + days + " days";
    }

    public String getAches() {
        return "\nhad Aches for " + days + " days";
    }

    public String getChills() {
        return "\nhad Chills for " + days + " days";
    }

    public String getThroat() {
        return "\nhad a Sore Throat for " + days + " days";
    }

    public String getSmell() {
        return "\nhad loss of Smell for " + days + " days";
    }

    public String getTaste() {
        return "\nhad Loss of Taste for " + days + " days";
    }

    public String getHead() {
        return "\nhad Headache for " + days + " days";
    }

    public String getDiarrhea() {
        return "\nhad Diarrhea for " + days + " days";
    }

    public String getVomit() {
        return "\nhad Severe Vomiting for " + days + " days";
    }

}
