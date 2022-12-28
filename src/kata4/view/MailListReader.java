package kata4.view;

import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    private List<String> domainsList = new ArrayList();
    
    public List<String> addDomains(Iterable<String> items){
        for (String line : items) {
            Mail mail = new Mail(line);
            domainsList.add(mail.getDomain());
        }
        return domainsList;
    }
}
