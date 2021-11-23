package com.company;

public class Main {

    public static void main(String[] args) {
	    String str;
        Redactor redactor = new Redactor();
        ICreateDocument iCreateDocument = new CreateTextDocument();
        str = redactor.start(iCreateDocument);
        System.out.println(str);
    }
}
