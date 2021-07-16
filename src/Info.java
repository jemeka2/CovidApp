public class Info {
    private String name, email, phoneNum, city, state;

    public Info(){}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public String displayInfo(){
        return "\nName: " + name +
                "\nPhone: " + phoneNum +
                "\nEmail: " + email +
                "\nCity: " + city + " State: " + state;
    }
}
