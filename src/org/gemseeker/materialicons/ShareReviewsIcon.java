package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ShareReviewsIcon extends SVGIcon {

    public ShareReviewsIcon() {
        super();
    }

    public ShareReviewsIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M580 686q29 0 49.5-20.5T650 616q0-29-20.5-49.5T580 546q-15 0-28 5.5T529 568l-120-60q1-3 " +
                "1-6v-12q0-3-1-6l120-60q10 11 23 16.5t28 5.5q29 0 49.5-20.5T650 376q0-29-20.5-49.5T580 306q-29 0-49.5 " +
                "20.5T510 376v6q0 3 1 6l-120 60q-10-11-23-16.5t-28-5.5q-29 0-49.5 20.5T270 496q0 29 20.5 49.5T340 " +
                "566q15 0 28-5.5t23-16.5l120 60q-1 3-1 6v6q0 29 20.5 49.5T580 686ZM80 976V236q0-24 18-42t42-18h680q24 " +
                "0 42 18t18 42v520q0 24-18 42t-42 18H240L80 976Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "share-reviews-icon";
    }
}
