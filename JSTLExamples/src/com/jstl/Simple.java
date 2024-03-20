package com.jstl;

import java.util.ListResourceBundle;  
public class Simple extends ListResourceBundle {  
    public Object[][] getContents() {  
        return contents;  
    }  
    static final Object[][] contents = { { "colour.Violet", "INDIA" },  
            { "colour.Indigo", "USA" }, { "colour.Blue", "UK" }, };  
}  