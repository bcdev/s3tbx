package org.esa.beam.dataio.s3.slstr;

import junit.framework.TestCase;
import org.esa.beam.dataio.netcdf.util.NetcdfFileOpener;
import org.esa.beam.framework.dataio.ProductIO;
import org.esa.beam.framework.datamodel.Product;
import org.junit.Before;
import org.junit.Test;
import ucar.nc2.NetcdfFile;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * @author Tonio Fincke
 */
public class SlstrNetcdfReaderTest {

    private SlstrNetcdfReader reader;

    @Before
    public void setUp() throws IOException {
        String netDCFFilePath = SlstrNetcdfReaderTest.class.getResource("../../s3/FRP_in.nc").getPath();
        reader = new SlstrNetcdfReader(netDCFFilePath);
    }

    @Test
    public void testReadProductType() throws IOException {
        final String productType = reader.readProductType();
        assertEquals("NetCDF", productType);
    }

    @Test
    public void testGetWidth() throws IOException {
        final int width = reader.getWidth();
        assertEquals(1568, width);
    }

    @Test
    public void testGetHeight() throws IOException {
        final int height = reader.getHeight();
        assertEquals(266, height);
    }

    @Test
    public void testReadProduct() throws Exception {
        final Product product = reader.readProduct();
        assertNotNull(product);
        assertEquals("FRP_in", product.getName());
        assertEquals("NetCDF", product.getProductType());
        assertEquals(1568, product.getSceneRasterWidth());
        assertEquals(266, product.getSceneRasterHeight());
    }



}
