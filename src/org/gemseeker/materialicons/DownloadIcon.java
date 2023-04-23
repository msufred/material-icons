package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DownloadIcon extends SVGIcon {

    public DownloadIcon() {
        super();
    }

    public DownloadIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M220 896q-24 0-42-18t-18-42V693h60v143h520V693h60v143q0 24-18 42t-42 18H220Zm260-153L287 " +
                "550l43-43 120 120V256h60v371l120-120 43 43-193 193Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "download-icon";
    }
}
