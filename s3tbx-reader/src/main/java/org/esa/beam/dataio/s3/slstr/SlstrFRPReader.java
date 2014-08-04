package org.esa.beam.dataio.s3.slstr;

import org.esa.beam.dataio.netcdf.util.Constants;
import org.esa.beam.dataio.netcdf.util.DataTypeUtils;
import org.esa.beam.dataio.netcdf.util.NetcdfFileOpener;
import org.esa.beam.framework.datamodel.Band;
import org.esa.beam.framework.datamodel.FlagCoding;
import org.esa.beam.framework.datamodel.IndexCoding;
import org.esa.beam.framework.datamodel.MetadataAttribute;
import org.esa.beam.framework.datamodel.MetadataElement;
import org.esa.beam.framework.datamodel.Product;
import org.esa.beam.framework.datamodel.ProductData;
import org.esa.beam.framework.datamodel.SampleCoding;
import org.esa.beam.framework.datamodel.VirtualBand;
import org.esa.beam.jai.ImageManager;
import org.esa.beam.jai.ResolutionLevel;
import org.esa.beam.util.io.FileUtils;
import ucar.ma2.Array;
import ucar.ma2.DataType;
import ucar.nc2.Attribute;
import ucar.nc2.Dimension;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Tonio Fincke
 */
class SlstrFRPReader extends SlstrNetcdfReader {

    private final NetcdfFile netcdfFile;

    SlstrFRPReader(String pathToFile) throws IOException {
        super(pathToFile);
        netcdfFile = NetcdfFileOpener.open(pathToFile);
    }

    //todo continue here as soon as valid test products are available

//    protected void addBands(Product product) {
//        final Variable iVariable = netcdfFile.findVariable("i");
//        final Variable jVariable = netcdfFile.findVariable("j");
//        final List<Variable> variables = netcdfFile.getVariables();
//        for (final Variable variable : variables) {
//            if (variable.findDimensionIndex("rows") != -1 && variable.findDimensionIndex("columns") != -1) {
//                createBand(product, variable, variable.getFullName());
//            }
//            addVariableMetadata(variable, product);
//        }
//    }

//    protected RenderedImage createSourceImage(Band band) {
//        final int bufferType = ImageManager.getDataBufferType(band.getDataType());
//        final int sourceWidth = band.getSceneRasterWidth();
//        final int sourceHeight = band.getSceneRasterHeight();
//        final java.awt.Dimension tileSize = band.getProduct().getPreferredTileSize();
//        final String bandName = band.getName();
//        String variableName = bandName;
//        Variable variable;
//        int dimensionIndex = -1;
//        String dimensionName = "";
//        if(bandName.contains("_channel")) {
//            variableName = bandName.substring(0, variableName.indexOf("_channel"));
//            variable = netcdfFile.findVariable(variableName);
//            dimensionName = "channel";
//            dimensionIndex = Integer.parseInt(bandName.substring(bandName.length() - 1)) - 1;
//        } else {
//            variable = netcdfFile.findVariable(variableName);
//        }
//        return new SlstrVariableOpImage(variable, bufferType, sourceWidth, sourceHeight, tileSize,
//                                        ResolutionLevel.MAXRES, dimensionName, dimensionIndex);
//    }

}
