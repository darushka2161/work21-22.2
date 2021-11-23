package com.company;

public class TextDocument implements IDocument{

    public String state_of_document;
    public TextDocument(){}
    @Override
    public void FileNew()
    {
        state_of_document = "New text file is created";
    }

    @Override
    public void FileOpen()
    {
        state_of_document = "Text file is opened";
    }

    @Override
    public void FileSave()
    {
        state_of_document = "Text file is saved";
    }
    @Override
    public String get_state_of_document()
    {
        return state_of_document;
    }
}
