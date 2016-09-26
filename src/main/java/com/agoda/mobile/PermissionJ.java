package com.agoda.mobile;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PermissionJ {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(isAttribute = true, localName = "atr")
    public String atr;


    public PermissionJ() {
    }


    public PermissionJ(String atr) {
        this.atr = atr;
    }

    public String getAtr() {
        return atr;
    }

    public void setAtr(String atr) {
        this.atr = atr;
    }


}
