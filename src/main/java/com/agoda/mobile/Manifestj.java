package com.agoda.mobile;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "manifest")
public class Manifestj {

    @JacksonXmlProperty(localName = "uses-permission")
    @JacksonXmlElementWrapper(useWrapping = false)
    PermissionJ[] permissionJList;

    public Manifestj() {
    }

    public PermissionJ[] getPermissionJList() {
        return permissionJList;
    }

    public void setPermissionJList(PermissionJ[] permissionJList) {
        this.permissionJList = permissionJList;
    }
}
