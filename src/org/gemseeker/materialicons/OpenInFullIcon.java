package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OpenInFullIcon extends SVGIcon {

    public OpenInFullIcon() {
        super();
    }

    public OpenInFullIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 936V636h60v198l558-558H540v-60h300v300h-60V318L222 876h198v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-in-full-icon";
    }
}
