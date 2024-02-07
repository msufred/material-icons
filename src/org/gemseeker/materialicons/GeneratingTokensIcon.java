package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GeneratingTokensIcon extends SVGIcon {

    public GeneratingTokensIcon() {
        super();
    }

    public GeneratingTokensIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9 4c-4.42 0-8 3.58-8 8s3.58 8 8 8s8-3.58 8-8s-3.58-8-8-8m3 " +
                "6.5h-2v5H8v-5H6V9h6zm8.25-6.75L23 5l-2.75 1.25L19 9l-1.25-2.75L15 5l" +
                "2.75-1.25L19 1zm0 14L23 19l-2.75 1.25L19 23l-1.25-2.75L15 19l2.75-1." +
                "25L19 15z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "generating-tokens-icon";
    }
}
