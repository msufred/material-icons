package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OneTwoThreeIcon extends SVGIcon {

    public OneTwoThreeIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.45);
    }

    public OneTwoThreeIcon(double size) {
        super(size * 1.25, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M220 696V504h-60v-48h108v240h-48Zm132 0V586q0-15 9.5-24.5T386 552h98v-48H352v-48h146q15 0 " +
                "24.5 9.5T532 490v76q0 15-9.5 24.5T498 600h-98v48h132v48H352Zm248 0v-48h132v-48h-92v-48h92v-48H600v-" +
                "48h146q15 0 24.5 9.5T780 490v172q0 15-9.5 24.5T746 696H600Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "one-two-three-icon";
    }
}
