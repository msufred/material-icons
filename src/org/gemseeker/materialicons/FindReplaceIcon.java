package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FindReplaceIcon extends SVGIcon {

    public FindReplaceIcon() {
        super();
    }

    public FindReplaceIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M11 6c1.38 0 2.63.56 3.54 1.46L12 10h6V4l-2.05 2.05A6.976 6.976 0 0 0 11 4c-3.53 " +
                "0-6.43 2.61-6.92 6H6.1A5 5 0 0 1 11 6m5.64 9.14A6.89 6.89 0 0 0 17.92 12H15.9a5 5 0 0 1-4" +
                ".9 4c-1.38 0-2.63-.56-3.54-1.46L10 12H4v6l2.05-2.05A6.976 6.976 0 0 0 11 18c1.55 0 2.98-." +
                "51 4.14-1.36L20 21.49L21.49 20z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "find-replace-icon";
    }
}
