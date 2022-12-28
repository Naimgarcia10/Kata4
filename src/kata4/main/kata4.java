package kata4.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kata4.view.HistogramBuilder;
import kata4.view.MailListReader;

public class kata4 {

    public static void main(String[] args) {
        Iterable<String> items = new EmailLoader(new FileLoader(new File("email.txt"))).items();
        MailListReader mailList = new MailListReader();
        List<String> domainsList = mailList.addDomains(items);
        
        HistogramBuilder hb = new HistogramBuilder();
        hb.BuildHistogram(domainsList);
    }

}