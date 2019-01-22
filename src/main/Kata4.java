package main;

import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {

        Histogram<String> histogram = MailHistogramBuilder.build (
                MailListReader.read("email.txt")
        );

        HistogramDisplay display = new HistogramDisplay("Histograma", histogram);

        display.execute();
        /*
        
        Histogram<String> histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("protonmail.com");
        histogram.increment("protonmail.com");
        histogram.increment("protonmail.com");
        histogram.increment("gmail.es");
        histogram.increment("yahoo.es");
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAMA", histogram);
        histo.execute();*/
    }

}
