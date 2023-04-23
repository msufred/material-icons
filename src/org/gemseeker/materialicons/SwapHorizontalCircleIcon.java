package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwapHorizontalCircleIcon extends SVGIcon {

    public SwapHorizontalCircleIcon() {
        super();
    }

    public SwapHorizontalCircleIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m368 824 43-43-84-84h193v-60H327l84-84-43-43-157 157 157 157Zm224-174 157-157-156-157-44 43 84 " +
                "84H440v60h193l-84 84 43 43ZM480 976q-82 0-155-31.5t-127.5-86Q143 804 111.5 731T80 576q0-83 " +
                "31.5-156t86-127Q252 239 325 207.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 " +
                "82-31.5 155T763 858.5q-54 54.5-127 86T480 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swap-horizontal-circle-icon";
    }
}
