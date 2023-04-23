package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PlaceItemIcon extends SVGIcon {

    public PlaceItemIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public PlaceItemIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24.75 0-42.375-17.625T120 876V436q0-24.75 17.625-42.375T180 " +
                "376h210v60H180v440h600V436H570v-60h210q24.75 0 42.375 17.625T840 436v440q0 24.75-17.625 42.375T780 " +
                "936H180Zm300-203L318 571l43-43 89 89V96h60v521l89-89 43 43-162 162Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "place-item-icon";
    }

}
