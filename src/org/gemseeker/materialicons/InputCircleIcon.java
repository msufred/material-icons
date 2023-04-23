package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class InputCircleIcon extends SVGIcon {

    public InputCircleIcon() {
        super();
    }

    public InputCircleIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 426 294 612l42 42 114-113v436h60V541l114 113 42-42-186-186ZM146 796q-32-49-49-105T80 " +
                "576q0-83 31.5-156T197 293q54-54 127-85.5T480 176q83 0 156 31.5T763 293q54 54 85.5 127T880 576q0 59-17 " +
                "115t-49 105l-44-42q25-41 37.5-85.5T820 576q0-142-99-241t-241-99q-142 0-241 99t-99 241q0 48 12.5 93t37.5 " +
                "85l-44 42Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "input-circle-icon";
    }
}
