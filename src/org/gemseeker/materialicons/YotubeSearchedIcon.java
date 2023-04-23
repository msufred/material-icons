package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class YotubeSearchedIcon extends SVGIcon {

    public YotubeSearchedIcon() {
        super(DEFAULT_SIZE * 1.05, DEFAULT_SIZE);
    }

    public YotubeSearchedIcon(double size) {
        super(size * 1.05, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M831 913 590 672q-30 26-70 40.5T435 727q-60 0-110.5-24T239 638l43-43q27 33 66.5 52.5T434 " +
                "667q81 0 138-57.5T629 471q0-81-57-138.5T434 275q-82 0-139.5 57.5T237 471l63-65 43 43-132 132L79 " +
                "449l43-43 56 56q4-103 77-175t179-72q106 0 180.5 75T689 471q0 43-14 83t-42 75l242 240-44 44Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "youtube-searched-icon";
    }

}
