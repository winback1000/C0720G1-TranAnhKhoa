package case_study.controllers.main_menu.add_new_booking;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewBooking;
import case_study.models.service.Services;

import java.util.ArrayList;
import java.util.List;

import static case_study.common.ShowList.serviceSelection;
import static case_study.models.service.Room.roomList;

public class BookingRoom extends AddNewBooking {
    public static List<MainMenu> bookingRoomList = new ArrayList<>();

    public BookingRoom() {
        this.name ="Booking Room";
    }

    @Override
    public void displayList() {
        showMenu(bookingRoomList);
    }

    @Override
    public void execute() {
        for (Services vl: roomList) {
            System.out.println(vl.showInfo());
        }
        tempCustomer.setRentType(serviceSelection(roomList));
        displayList();
    }
}
