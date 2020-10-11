package case_study.models;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import static case_study.models.Human.COMMA;

public class Contract implements Comparable<Contract> {
    NumberFormat nf = new DecimalFormat("000000");
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    static int contractNum = 0;
    String id;
    String startDate;
    String endDate;
    String deposit;
    String totalCost;
    public static List<Contract> contractList = new ArrayList<>();

    public Contract(String startDate, String endDate, double deposit, double totalCost) {
        contractNum++;
        this.id = nf.format(contractNum);
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = moneyFormat.format(deposit);
        this.totalCost = moneyFormat.format(totalCost);
        contractList.add(this);
    }

    public String getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = moneyFormat.format(deposit);
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = moneyFormat.format(totalCost);
    }

    @Override
    public String toString() {
        return id + COMMA + startDate + COMMA + endDate + COMMA + deposit + COMMA + totalCost;
    }

    public String showInfo() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", deposit='" + deposit + '\'' +
                ", totalCost='" + totalCost + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contract e) {
        return this.id.compareTo(e.getId());
    }
}
