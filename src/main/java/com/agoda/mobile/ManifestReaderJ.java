package com.agoda.mobile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.List;

public class ManifestReaderJ {
    String manifest;

    public ManifestReaderJ(String manifest) {
        this.manifest = manifest;
    }

    public PermissionJ[] getPermissionsManifest() {

        ObjectMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, Boolean.FALSE);
        try {
            return xmlMapper.readValue(manifest, Manifestj.class).getPermissionJList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
