package com.company;

public class MusicDocument implements IDocument{
    public String state_of_document;
    public MusicDocument(){}
    @Override
    public void FileNew()
    {
        state_of_document = "New music file is created";
    }

    @Override
    public void FileOpen()
    {
        state_of_document = "Music file is opened";
    }

    @Override
    public void FileSave()
    {
        state_of_document = "Music file is saved";
    }
    @Override
    public String get_state_of_document()
    {
        return state_of_document;
    }
}