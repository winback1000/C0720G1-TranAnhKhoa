package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static case_study.common.ShowList.customerSelection;
import static case_study.common.ShowList.showCustomerList;
import static case_study.models.CinemaTicket.bookTicket;
import static case_study.models.Customer.customerList;

public class BookCinemaTicket extends MainMenu {
    public static List<MainMenu> bookCinemaTicketList = new ArrayList<>();
    public Customer tempCustomer;

    public BookCinemaTicket() {
        this.name = "Book Cinema Ticket";
    }

    @Override
    public void execute() {
        Collections.sort(customerList);
        showCustomerList(customerList);
        tempCustomer = customerSelection(customerList);
        bookTicket(tempCustomer);
        displayList();
    }

    @Override
    public void displayList() {
        showMenu(bookCinemaTicketList);
    }
}
