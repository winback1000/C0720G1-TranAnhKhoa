package case_study.common;

public class Loader {
    public static void loadAllData(){
        Reader.villaReader();
        Reader.houseReader();
        Reader.roomReader();
        Reader.utilitiesServicesReader();
        Reader.contractReader();
        Reader.customerReader();
        Reader.employeeReader();
    }
}
