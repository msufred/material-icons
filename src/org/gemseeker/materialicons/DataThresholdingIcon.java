package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DataThresholdingIcon extends SVGIcon {

    public DataThresholdingIcon() {
        super();
    }

    public DataThresholdingIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-25 0-42.5-17.5T120 876V276q0-25 17.5-42.5T180 216h600q25 0 42.5 17.5T840 " +
                "276v600q0 25-17.5 42.5T780 936H180Zm446-60h71l83-83v-37h-34L626 876ZM281 662l141-140 90 90 " +
                "209-210-42-42-167 167-90-90-183 183 42 42ZM180 876h34l120-120h-71l-83 83v37Zm356 0 " +
                "120-120h-71L465 876h71Zm-161 0 120-120h-71L304 876h71Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "data-thresholding-icon";
    }
}
