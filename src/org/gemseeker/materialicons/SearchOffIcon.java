package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SearchOffIcon extends SVGIcon {

    public SearchOffIcon() {
        super(DEFAULT_SIZE * 1.05, DEFAULT_SIZE);
    }

    public SearchOffIcon(double size) {
        super(size * 1.05, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M270 976q-78 0-134-56T80 786q0-78 56-134t134-56q78 0 134 56t56 134q0 78-56 134t-134 " +
                "56Zm566-40L573 673q-14 11-31.5 21.5T508 712q-5-14-11-28.5T483 657q54-21 91.5-69.5T612 472q0-81-" +
                "57-138.5T417 276q-82 0-139.5 57.5T220 472q0 17 3.5 35.5T232 539q-13 2-29 6.5T174 556q-7-18-10.5" +
                "-40t-3.5-44q0-107 75-181.5T417 216q106 0 180.5 75T672 472q0 43-15 85t-41 73l264 262-44 44Zm-635" +
                "-56 69-69 68 68 23-23-69-69 71-71-23-23-70 70-70-70-23 23 70 70-70 70 24 24Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "search-off-icon";
    }

}
