package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FilterAltOffIcon extends SVGIcon {

    public FilterAltOffIcon() {
        super();
    }

    public FilterAltOffIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M580 591 245 256h527q21 0 31 19t-4 36L580 591Zm233 404L560 742v114q0 17-11.5 28.5T520 " +
                "896h-80q-17 0-28.5-11.5T400 856V582L61 243l43-43 752 752-43 43Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "filter-alt-off-icon";
    }
}
