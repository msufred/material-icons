package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DownloadDoneIcon extends SVGIcon {

    public DownloadDoneIcon() {
        super();
    }

    public DownloadDoneIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M200 896v-60h560v60H200Zm180-171L154 499l43-42 183 183 384-384 42 43-426 426Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "download-done-icon";
    }
}
