public class MagicYear {

    private final int magicYear;

    private int magicYearCalculator(int year){
        return year + 12;
    }

    public MagicYear(int year){
        this.magicYear = magicYearCalculator(year);
    }

}
