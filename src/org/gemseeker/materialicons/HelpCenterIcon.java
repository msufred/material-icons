package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HelpCenterIcon extends SVGIcon {

    public HelpCenterIcon() {
        super();
    }

    public HelpCenterIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-." +
                "9-2-2-2m-6.99 15c-.7 0-1.26-.56-1.26-1.26c0-.71.56-1.25 1.26-1.25c.71 0 1.25" +
                ".54 1.25 1.25c-.01.69-.54 1.26-1.25 1.26m3.01-7.4c-.76 1.11-1.48 1.46-1.87 2" +
                ".17c-.16.29-.22.48-.22 1.41h-1.82c0-.49-.08-1.29.31-1.98c.49-.87 1.42-1.39 1" +
                ".96-2.16c.57-.81.25-2.33-1.37-2.33c-1.06 0-1.58.8-1.8 1.48l-1.65-.7C9.01 7.1" +
                "5 10.22 6 11.99 6c1.48 0 2.49.67 3.01 1.52c.44.72.7 2.07.02 3.08");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "help-center-icon";
    }
}
