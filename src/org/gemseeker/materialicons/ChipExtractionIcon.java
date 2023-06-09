package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ChipExtractionIcon extends SVGIcon {

    public ChipExtractionIcon() {
        super();
    }

    public ChipExtractionIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 935q-75 0-140.5-28.5t-114-77q-48.5-48.5-77-114T120 575q0-75 28.5-140.5t77-114q48.5-48.5 " +
                "114-77T480 215v60q-124 0-212 88t-88 212q0 125.357 88 212.679Q356 875 480 875v60Zm173-173-42-43 " +
                "113-113H360v-60h364L611 432l42-42 186 186-186 186Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "chip-extraction-icon";
    }
}
