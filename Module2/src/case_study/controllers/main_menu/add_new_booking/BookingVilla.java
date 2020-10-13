package case_study.controllers.main_menu.add_new_booking;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewBooking;
import case_study.models.service.Services;
import case_study.models.service.Villa;

import java.util.ArrayList;
import java.util.List;

import static case_study.common.ShowList.*;
import static case_study.models.service.Villa.villaList;

public class BookingVilla extends AddNewBooking {
    public static List<MainMenu> bookingVillaList = new ArrayList<>();

    public BookingVilla() {
        this.name ="Booking Villa";
    }

    @Override
    public void displayList() {
        showMenu(bookingVillaList);
    }

    @Override
    public void execute() {
        for (Services vl: Villa.villaList) {
            System.out.println(vl.showInfo());
        }
        tempCustomer.setRentType(serviceSelection(villaList));
        displayList();
    }
}
