package solid;

import solid.dip.DisplayReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new DisplayReport());
    }
}
