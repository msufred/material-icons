package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ArrowCircleUpIcon extends SVGIcon {

    public ArrowCircleUpIcon() {
        super();
    }

    public ArrowCircleUpIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 724h60V542l74 74 42-42-146-146-146 146 42 42 74-74v182Zm30 252q-82 " +
                "0-155-31.5t-127.5-86Q143 804 111.5 731T80 576q0-83 31.5-156t86-127Q252 239 325 " +
                "207.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 82-31.5 155T763 " +
                "858.5q-54 54.5-127 86T480 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-circle-up-icon";
    }
}
