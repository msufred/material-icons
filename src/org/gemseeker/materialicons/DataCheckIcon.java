package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DataCheckIcon extends SVGIcon {

    public DataCheckIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public DataCheckIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m612 506 141-142-28-28-113 113-57-57-28 29 85 85ZM120 896v-60h480v60H120Zm519.894-290Q561 " +
                "606 505.5 550.394t-55.5-134.5Q450 337 505.606 281.5t134.5-55.5Q719 226 774.5 281.606t55.5 134.5Q830 " +
                "495 774.394 550.5t-134.5 55.5ZM120 556v-60h262q5.32 16.323 12.16 31.161Q401 542 409 556H120Zm0 " +
                "170v-60h419q13.8 6.364 29.4 10.682Q584 681 600 683v43H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "data-check-icon";
    }
}
