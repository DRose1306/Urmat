package _2024_02_12;

public class Employee {
    private String firstName;
    private String lastName;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
    
    // Дублирование кода формирования email
    public String getEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}
class EmployeeCorrected {
    private String firstName;
    private String lastName;
    private final  String eMail = "@company.com";

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getInitials() {
        return this.firstName.charAt(0) + "." + this.lastName.charAt(0) + ".";
    }

    // Дублирование кода формирования email
    public String getEmail() {
        return generateEmail(this.firstName, this.lastName);
    }

    private String generateEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + eMail;
    }
}

