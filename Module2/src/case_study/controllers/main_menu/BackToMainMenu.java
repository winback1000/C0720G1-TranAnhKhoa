package case_study.controllers.main_menu;
import case_study.controllers.MainMenu;
import static case_study.controllers.main_menu.AddNewBooking.addNewBookingList;
import static case_study.controllers.main_menu.AddNewCustomer.addNewCustomerList;
import static case_study.controllers.main_menu.AddNewService.addNewServiceList;
import static case_study.controllers.main_menu.BookCinemaTicket.bookCinemaTicketList;
import static case_study.controllers.main_menu.ShowCustomerInfo.showCustomerInfoList;
import static case_study.controllers.main_menu.ShowInfoOfEmployee.showInfoOfEmployeeList;
import static case_study.controllers.main_menu.ShowServices.showServicesList;
import static case_study.controllers.main_menu.add_new_booking.BookingHouse.bookingHouseList;
import static case_study.controllers.main_menu.add_new_booking.BookingRoom.bookingRoomList;
import static case_study.controllers.main_menu.add_new_booking.BookingVilla.bookingVillaList;
import static case_study.controllers.main_menu.add_new_customer.AddNewContract.addNewContractList;
import static case_study.controllers.main_menu.add_new_service.AddNewHouse.addNewHouseList;
import static case_study.controllers.main_menu.add_new_service.AddNewRoom.addNewRoomList;
import static case_study.controllers.main_menu.add_new_service.AddNewVilla.addNewVillaList;
import static case_study.controllers.main_menu.add_new_service.AddUtilitiesService.addUtilitiesServiceList;
import static case_study.controllers.main_menu.show_services.ShowAllHouse.showAllHouseList;
import static case_study.controllers.main_menu.show_services.ShowAllHouseNotDuplicate.showAllHouseNotDuplicateList;
import static case_study.controllers.main_menu.show_services.ShowAllRoom.showAllRoomList;
import static case_study.controllers.main_menu.show_services.ShowAllRoomNotDuplicate.showAllRoomNotDuplicateList;
import static case_study.controllers.main_menu.show_services.ShowAllVilla.showAllVillaList;
import static case_study.controllers.main_menu.show_services.ShowAllVillaNotDuplicate.showAllVillaNotDuplicateList;

public class BackToMainMenu extends MainMenu {
    public BackToMainMenu() {
        this.name = "Back to main menu";
        addNewBookingList.add(this);
        showServicesList.add(this);
        addNewCustomerList.add(this);
        showCustomerInfoList.add(this);
        showInfoOfEmployeeList.add(this);
        addNewServiceList.add(this);
        bookingHouseList.add(this);
        bookingRoomList.add(this);
        bookingVillaList.add(this);
        addNewContractList.add(this);
        addNewHouseList.add(this);
        addNewRoomList.add(this);
        addNewVillaList.add(this);
        addUtilitiesServiceList.add(this);
        showAllHouseList.add(this);
        showAllRoomList.add(this);
        showAllVillaList.add(this);
        showAllHouseNotDuplicateList.add(this);
        showAllRoomNotDuplicateList.add(this);
        showAllVillaNotDuplicateList.add(this);
        bookCinemaTicketList.add(this);
    }

    @Override
    public void execute() {
        back.empty();
        showMenu(mainMenuList);
    }
}
