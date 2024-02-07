package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DataExplorationIcon extends SVGIcon {

    public DataExplorationIcon() {
        super();
    }

    public DataExplorationIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12c0 1.33.26 2.61.74 3.77L8 10.5l3.3 2.78L14.58 " +
                "10H13V8h5v5h-2v-1.58L11.41 16l-3.29-2.79l-4.4 4.4A9.996 9.996 0 0 0 12 22h8c1." +
                "1 0 2-.9 2-2v-8c0-5.52-4.48-10-10-10m7.5 18.5c-.55 0-1-.45-1-1s.45-1 1-1s1 .45" +
                " 1 1s-.45 1-1 1");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "data-exploration-icon";
    }
}
