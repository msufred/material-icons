package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RadioButtonUncheckedIcon extends SVGIcon {

    public RadioButtonUncheckedIcon() {
        super();
    }

    public RadioButtonUncheckedIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-82 0-155-31.5t-127.5-86Q143 804 111.5 731T80 576q0-83 31.5-156t86-127Q252 239 325 " +
                "207.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 82-31.5 155T763 858.5q-54 54.5-127 " +
                "86T480 976Zm0-60q142 0 241-99.5T820 576q0-142-99-241t-241-99q-141 0-240.5 99T140 576q0 141 99.5 " +
                "240.5T480 916Zm0 0q-141 0-240.5-99.5T140 576q0-142 99.5-241T480 236q142 0 241 99t99 241q0 141-99 " +
                "240.5T480 916Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "radio-button-unchecked-icon";
    }
}
