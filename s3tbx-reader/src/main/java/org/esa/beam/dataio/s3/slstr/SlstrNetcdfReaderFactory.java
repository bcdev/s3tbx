package org.esa.beam.dataio.s3.slstr;

import java.io.File;
import java.io.IOException;

/**
 * @author Tonio Fincke
 */
public class SlstrNetcdfReaderFactory {

    static SlstrNetcdfReader createSlstrNetcdfReader(File file) throws IOException {
        final String fileName = file.getName();
        if(fileName.equals("FRP_in.nc")) {
            return new SlstrFRPReader(file.getAbsolutePath());
        } else if(fileName.equals("LST_ancillary_ds.nc")) {
            return new SlstrLSTAncillaryDsReader(file.getAbsolutePath());
        }
        return new SlstrNetcdfReader(file.getAbsolutePath());
    }

}
