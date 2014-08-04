package org.esa.beam.dataio.s3.slstr;

import java.io.File;
import java.io.IOException;

/**
 * @author Tonio Fincke
 */
public class SlstrNetcdfReaderFactory {

    static SlstrNetcdfReader createSlstrNetcdfReader(File file) throws IOException {
        if(file.getName().equals("FRP_in.nc")) {
            return new SlstrFRPReader(file.getAbsolutePath());
        } else {
            return new SlstrNetcdfReader(file.getAbsolutePath());
        }
    }

}
