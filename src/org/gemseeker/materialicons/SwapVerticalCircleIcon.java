package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwapVerticalCircleIcon extends SVGIcon {

    public SwapVerticalCircleIcon() {
        super();
    }

    public SwapVerticalCircleIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m564 842 156-156-43-42-83 83V536h-60v191l-81-82-43 43 154 154ZM368 616h60V425l82 81 " +
                "42-42-154-154-156 156 43 42 83-83v191Zm112 360q-82 0-155-31.5t-127.5-86Q143 804 111.5 731T80 " +
                "576q0-83 31.5-156t86-127Q252 239 325 207.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 " +
                "576q0 82-31.5 155T763 858.5q-54 54.5-127 86T480 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swap-vertical-circle-icon";
    }
}
