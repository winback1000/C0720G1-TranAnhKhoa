package case_study.controllers;

import case_study.common.Loader;
import case_study.controllers.main_menu.*;
import case_study.controllers.main_menu.add_new_booking.BookingHouse;
import case_study.controllers.main_menu.add_new_booking.BookingRoom;
import case_study.controllers.main_menu.add_new_booking.BookingVilla;
import case_study.controllers.main_menu.add_new_customer.AddNewContract;
import case_study.controllers.main_menu.add_new_service.AddNewHouse;
import case_study.controllers.main_menu.add_new_service.AddNewRoom;
import case_study.controllers.main_menu.add_new_service.AddNewVilla;
import case_study.controllers.main_menu.add_new_service.AddUtilitiesService;
import case_study.controllers.main_menu.book_cinema_ticket.PrintTicket;
import case_study.controllers.main_menu.show_services.*;
import static case_study.controllers.MainMenu.mainMenuList;
import static case_study.controllers.main_menu.AddNewBooking.addNewBookingList;
import static case_study.controllers.main_menu.AddNewCustomer.addNewCustomerList;
import static case_study.controllers.main_menu.AddNewService.addNewServiceList;
import static case_study.controllers.main_menu.BookCinemaTicket.bookCinemaTicketList;
import static case_study.controllers.main_menu.ShowServices.showServicesList;

public class MainController {

    public static void main(String[] args) {
    MainMenu mm = new MainMenu();
    mainMenuList.add(new AddNewService());
    mainMenuList.add(new ShowServices());
    mainMenuList.add(new AddNewCustomer());
    mainMenuList.add(new ShowCustomerInfo());
    mainMenuList.add(new AddNewBooking());
    mainMenuList.add(new AddNewEmployee());
    mainMenuList.add(new ShowInfoOfEmployee());
    mainMenuList.add(new BookCinemaTicket());
    mainMenuList.add(new SearchEmployeeProfile());

    addNewBookingList.add(new BookingVilla());
    addNewBookingList.add(new BookingHouse());
    addNewBookingList.add(new BookingRoom());
    addNewBookingList.add(new AddUtilitiesService());

    showServicesList.add(new ShowAllVilla());
    showServicesList.add(new ShowAllHouse());
    showServicesList.add(new ShowAllRoom());
    showServicesList.add(new ShowAllVillaNotDuplicate());
    showServicesList.add(new ShowAllHouseNotDuplicate());
    showServicesList.add(new ShowAllRoomNotDuplicate());

    addNewCustomerList.add(new AddNewContract());
    bookCinemaTicketList.add(new PrintTicket());

    addNewServiceList.add(new AddNewVilla());
    addNewServiceList.add(new AddNewHouse());
    addNewServiceList.add(new AddNewRoom());
    addNewServiceList.add(new AddUtilitiesService());
    new Back();
    new BackToMainMenu();
    new Exit();

    Loader.loadAllData();

    mm.execute();

    }
}
