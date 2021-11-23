package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Redactor {
    public ICreateDocument iCreateDocument;
    public IDocument iDocument;

    public Redactor(){}

    public String start(ICreateDocument iCreateDocument)
    {
        String str = " ";
        String str_scan;
        this.iCreateDocument = iCreateDocument;
        Scanner scan = new Scanner(System.in);
        str_scan = scan.nextLine();
        Pattern pattern1 = Pattern.compile("Exit");
        Pattern pattern2 = Pattern.compile("New");
        Pattern pattern3 = Pattern.compile("Open");
        Pattern pattern4 = Pattern.compile("Save");
        Matcher matcher = pattern1.matcher(str_scan);
        Matcher matcher1 = pattern2.matcher(str_scan);
        Matcher matcher2 = pattern3.matcher(str_scan);
        Matcher matcher3 = pattern4.matcher(str_scan);
        this.iCreateDocument = iCreateDocument;
        if(matcher1.matches()) {
            iDocument = this.iCreateDocument.CreateNew();
            str = iDocument.get_state_of_document();
        }
        if(matcher2.matches())
        {
            iDocument = this.iCreateDocument.CreateOpen();
            str = iDocument.get_state_of_document();
        }
        if (matcher3.matches())
        {
            iDocument = this.iCreateDocument.CreateOpen();
            iDocument.FileSave();
            str = iDocument.get_state_of_document();
        }
        if (matcher.matches())
        {
            str = this.exit();
        }
        return str;
    }

    public String exit()
    {
        return "The redactor is closed";
    }
}
