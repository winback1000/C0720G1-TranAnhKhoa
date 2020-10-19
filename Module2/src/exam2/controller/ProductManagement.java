package exam2.controller;

import exam2.common.Reader;

public class ProductManagement {
    public static void main(String[] args) {
        Reader.importReader();
        Reader.exportReader();
        MainMenu.mainMenu();
    }
}
