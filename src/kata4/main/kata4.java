package kata4.main;

import java.util.List;
import kata4.model.Mail;
import kata4.view.HistogramBuilder;
import kata4.view.MailListReader;

public class kata4 {

    public static void main(String[] args) {
        MailListReader mailListR = new MailListReader();
        List<Mail> items = mailListR.read("email.txt");
        
        List<String> domainsList = mailListR.addDomains(items);
        HistogramBuilder hb = new HistogramBuilder();
        hb.BuildHistogram(domainsList);
    }

}