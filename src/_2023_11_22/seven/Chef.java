package _2023_11_22.seven;

import java.util.List;

public class Chef {
    //Класс Chef:
    //Поля: String name, int experienceYears, List<MenuItem> specialties, boolean isAvailable.
    //Реализация интерфейса Cookable.
    private String name;
    private int experienceYears;
    private List<MenuItem> specialties;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", experienceYears=" + experienceYears +
                ", specialties=" + specialties +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public List<MenuItem> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<MenuItem> specialties) {
        this.specialties = specialties;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Chef(String name, int experienceYears, List<MenuItem> specialties, boolean isAvailable) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialties = specialties;
        this.isAvailable = isAvailable;
    }
}
