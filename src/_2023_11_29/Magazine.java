package _2023_11_29;

import java.time.LocalDate;

public class Magazine extends LibraryItem{
    //_2023_11_29.Magazine (Журнал) Реализует: _2023_11_29.LibraryItem
    //        //        Поля:
    //        //            int issueNumber
    //        //            LocalDate releaseDate
    //        //            boolean isMonthly
    private  int issueNumber;
    private LocalDate releaseDate;
    private boolean isMonthly;
    private ItemCondition itemCondition;

    @Override
    public String toString() {
        return "_2023_11_29.Magazine{" +
                "issueNumber=" + issueNumber +
                ", releaseDate=" + releaseDate +
                ", isMonthly=" + isMonthly +
                '}';
    }




    public Magazine(String title, String author, Genre genre, int issueNumber, LocalDate releaseDate, boolean isMonthly) {
        super(title, author, genre);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
        this.isMonthly = isMonthly;
        this.itemCondition = itemCondition;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    public ItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean monthly) {
        isMonthly = monthly;
    }
}
