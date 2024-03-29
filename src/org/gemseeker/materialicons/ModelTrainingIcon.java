package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ModelTrainingIcon extends SVGIcon {

    public ModelTrainingIcon() {
        super();
    }

    public ModelTrainingIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M15.5 13.5c0 2-2.5 3.5-2.5 5h-2c0-1.5-2.5-3-2.5-5c0-1.93 " +
                "1.57-3.5 3.5-3.5s3.5 1.57 3.5 3.5m-2.5 6h-2V21h2zm6-6.5c0 1.68-.5" +
                "9 3.21-1.58 4.42l1.42 1.42a8.978 8.978 0 0 0-1-12.68l-1.42 1.42A6" +
                ".993 6.993 0 0 1 19 13m-3-8l-4-4v3a9 9 0 0 0-9 9c0 2.23.82 4.27 2" +
                ".16 5.84l1.42-1.42A6.938 6.938 0 0 1 5 13c0-3.86 3.14-7 7-7v3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "model-training-icon";
    }
}
