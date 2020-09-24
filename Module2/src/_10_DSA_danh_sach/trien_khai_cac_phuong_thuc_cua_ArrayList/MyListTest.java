package _10_DSA_danh_sach.trien_khai_cac_phuong_thuc_cua_ArrayList;

public class MyListTest {

        public static <E> void main(String[] args) {
            MyList<Integer> listInteger = new MyList<>();
            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
            listInteger.add(4);
            listInteger.add(5);
            System.out.println(listInteger.toString());
            listInteger.remove(4);
            System.out.println(listInteger.toString());

            MyList<Integer> listClone = listInteger.clone();
            System.out.println(listClone.toString());

            listInteger.clear();
            System.out.println(listInteger.toString());
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));

//            listInteger.get(-1);
//            System.out.println("element -1: " + listInteger.get(-1));
        }
    }
