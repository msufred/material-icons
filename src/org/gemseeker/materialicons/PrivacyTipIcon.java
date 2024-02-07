package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PrivacyTipIcon extends SVGIcon {

    public PrivacyTipIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public PrivacyTipIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 1L3 5v6c0 5.55 3.84 10.74 9 12c5.16-1.26 9-6.45 9-12V5zm-1 6h2v2h-2zm0 4h2v6h-2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "privacy-tip-icon";
    }
}
