package com.example.customlistview;

class I_Item
{
    String name;
    int image;

    public I_Item(String name, int image)
    {
        this.name = name;
        this.image = image;
    }

    public String getName()
    {
        return name;
    }

    public int getImage()
    {
        return image;
    }
}
