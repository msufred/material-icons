package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FileDownloadOffIcon extends SVGIcon {

    public FileDownloadOffIcon() {
        super(DEFAULT_SIZE * 1.25);
    }

    public FileDownloadOffIcon(double size) {
        super(size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m104 200 752 752-43 43-99-99H220q-24 0-42-18t-18-42V693h60v143h434L516 698l-36 35-193-193 " +
                "36-36L61 243l43-43Zm526 297 43 43-71 72-43-44 71-71ZM510 256v264l-60-60V256h60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "file-download-off-icon";
    }
}
