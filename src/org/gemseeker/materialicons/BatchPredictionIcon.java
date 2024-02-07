package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BatchPredictionIcon extends SVGIcon {

    public BatchPredictionIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 1.15);
    }

    public BatchPredictionIcon(double size) {
        super(size * 0.85, size * 1.15);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 8H7c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2m-4 " +
                "12.5h-2V19h2zm0-2.5h-2c0-1.5-2.5-3-2.5-5c0-1.93 1.57-3.5 3.5-3.5s3.5 1.57 3.5 3.5c0 2-2." +
                "5 3.5-2.5 5m5-11.5H6C6 5.67 6.67 5 7.5 5h9c.83 0 1.5.67 1.5 1.5m-1-3H7C7 2.67 7.67 2 8.5" +
                " 2h7c.83 0 1.5.67 1.5 1.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "batch-prediction-icon";
    }
}
