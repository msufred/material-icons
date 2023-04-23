package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OpenWithIcon extends SVGIcon {

    public OpenWithIcon() {
        super();
    }

    public OpenWithIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976 317 813l44-44 89 89V669h60v189l89-89 44 44-163 163ZM238 734 80 576l159-159 44 44-85 " +
                "85h189v60H198l84 84-44 44Zm484 0-44-44 84-84H574v-60h188l-84-84 44-44 158 158-158 158ZM450 482V294l-84 " +
                "84-44-44 158-158 158 158-44 44-84-84v188h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-with-icon";
    }
}
