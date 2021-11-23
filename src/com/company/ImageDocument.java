package com.company;

public class ImageDocument implements IDocument{
    public String state_of_document;
    public ImageDocument(){}
    @Override
    public void FileNew()
    {
        state_of_document = "New image file is created";
    }

    @Override
    public void FileOpen()
    {
        state_of_document = "Image file is opened";
    }

    @Override
    public void FileSave()
    {
        state_of_document = "Image file is saved";
    }
    @Override
    public String get_state_of_document()
    {
        return state_of_document;
    }
}
