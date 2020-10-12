package case_study.controllers.main_menu.book_cinema_ticket;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.BookCinemaTicket;
import case_study.models.CinemaTicket;

import java.util.ArrayList;
import java.util.List;

public class PrintTicket extends BookCinemaTicket {

    public PrintTicket() {
        this.name= "Print tickets";
    }

    @Override
    public void execute() {
        CinemaTicket.printTicket();
        displayList();
    }

    @Override
    public void displayList() {
        super.displayList();
    }
}
