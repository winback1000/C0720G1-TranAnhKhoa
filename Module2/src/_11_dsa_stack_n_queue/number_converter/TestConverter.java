package _11_dsa_stack_n_queue.number_converter;

public class TestConverter {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.decToTarget("923", (byte) 16));
        System.out.println(converter.numToDec("11110",2));
        System.out.println(converter.convertRandom("39B",16,2));
        System.out.println(converter.convertRandom("1110011011",2,16));
    }
}
