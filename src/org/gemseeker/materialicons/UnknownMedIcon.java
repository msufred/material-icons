package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class UnknownMedIcon extends SVGIcon {

    public UnknownMedIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.125);
    }

    public UnknownMedIcon(double size) {
        super(size * 1.25, size * 0.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M130 606q-20.833 0-35.417-14.618Q80 576.765 80 555.882 80 535 94.583 520.5 109.167 506 130 " +
                "506h260q20.833 0 35.417 14.618Q440 535.235 440 556.118 440 577 425.417 591.5 410.833 606 390 606H130Zm440 " +
                "0q-20.833 0-35.417-14.618Q520 576.765 520 555.882 520 535 534.583 520.5 549.167 506 570 506h260q20.833 " +
                "0 35.417 14.618Q880 535.235 880 556.118 880 577 865.417 591.5 850.833 606 830 606H570Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "unknown-med-icon";
    }
}
