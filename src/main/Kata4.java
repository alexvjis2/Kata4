package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    private final String filename;
    private Histogram histogram;
    private List<Mail> emails;

    public Kata4(String filename) {
        this.filename = filename;
    }
    
    public static void main(String[] args) {
        new Kata4("emails.txt").execute();
    }

    public void execute() {
        input();
        process();
        output();
    }
    public void input() {
        emails = MailListReader.read("email.txt");
    }
    
    public void process() {
        histogram = MailHistogramBuilder.build ( emails );
    }
    
    public void output() {
        HistogramDisplay display = new HistogramDisplay("Histograma", histogram);
        display.execute();
    }
}
