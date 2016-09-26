package com.agoda.mobile;

import org.junit.Test;
import kotlin.test.assertEquals

class ManifestReaderTest {

    @Test
    fun shouldReadTestProperly() {

        var xml = "<manifest>" +
                "<uses-permission atr=\"222\"/>" +
                "<uses-permission atr=\"422\"/>" +
                "<uses-permission atr=\"322\"/>" +
                "<uses-permission atr=\"122\"/>" +
                "</manifest>"

        val list = ManifestReader(xml).getReader()
        assertEquals(4, list.size)
    }

}
