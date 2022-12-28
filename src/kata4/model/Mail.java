package kata4.model;

import java.util.regex.Pattern;

public class Mail {
    private String mail;
    //private static final Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private static final Pattern pattern = Pattern.compile("^[\\w-\\.]+@");

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        /*if (pattern.matcher(this.mail).matches() == true) return this.mail;
        else {return null;}*/
        String[] domain = pattern.split(this.mail);
        //System.out.println(pattern.split(this.mail));
        String result = "";
        for (String car : domain) 
            result = result + car;
        return result;
    }
    
    
    
}
