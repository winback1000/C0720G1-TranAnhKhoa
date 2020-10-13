package case_study.common;

import static case_study.common.FilePath.*;

public class Loader {
    public static void loadAllData(){
//        Reader.villaReader();
//        Reader.houseReader();
//        Reader.roomReader();
//        Reader.utilitiesServicesReader();
        Reader.employeeReader();
        Reader.servicesReader(SERVICES);
        Reader.servicesReader(OTHER_UTILITIES);
        Reader.contractReader();
        Reader.customerReader();

    }
}
