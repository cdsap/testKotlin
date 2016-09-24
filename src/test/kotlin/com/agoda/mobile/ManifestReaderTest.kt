package com.agoda.mobile;

import org.junit.Test;

/**
 * Created by ivillar on 9/24/2016 AD.
 */
public class ManifestReaderTest {

    @Test
    fun shouldReadTestProperly() {
   //     val manifest : String = "<manifest>" +
   //             "<permission>ssss</permission>" +
   //             "<permission>ssss</permission></manifest>"

        var xml = "<manifest>\n" +
                "  <permission category=\"children\">\n" +
                "  </permission>\n" +
                "  <permission category=\"web\">\n" +
                "  </permission>\n" +
                "</manifest>";

        ManifestReader(xml).getReader()
    }

}
