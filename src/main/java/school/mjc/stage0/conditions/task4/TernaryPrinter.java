package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        String max="";
        max = first>=second ? "First":"Second";
        System.out.println(max);
    }
}
