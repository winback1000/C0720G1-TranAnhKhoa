package case_study.controllers.main_menu.add_new_booking;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewBooking;
import case_study.models.service.Services;

import java.util.ArrayList;
import java.util.List;

import static case_study.common.ShowList.serviceSelection;
import static case_study.models.service.House.houseList;

public class BookingHouse extends AddNewBooking {
    public static List<MainMenu> bookingHouseList = new ArrayList<>();

    public BookingHouse() {
        this.name ="Booking House";
    }

    @Override
    public void displayList() {
        showMenu(bookingHouseList);
    }

    @Override
    public void execute() {
            for (Services vl: houseList) {
                System.out.println(vl.showInfo());
            }
        tempCustomer.setRentType(serviceSelection(houseList));
        displayList();
    }
}
