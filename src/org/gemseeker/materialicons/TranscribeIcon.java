package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class TranscribeIcon extends SVGIcon {

    public TranscribeIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public TranscribeIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M725 751q-56-58-87.5-126.5T606 465q0-91 31.5-159.5T725 179l50 50q-48 51-73.5 104.5T676 465q0 " +
                "78 25.5 131.5T775 701l-50 50Zm139-142q-26-28-42-65.5T806 465q0-41 16-78.5t42-65.5l50 50q-18 20-28 " +
                "42.5T876 465q0 29 10 51.5t28 42.5l-50 50Zm-504 6q-66 0-108-42t-42-108q0-66 42-108t108-42q66 0 108 " +
                "42t42 108q0 66-42 108t-108 42ZM40 936v-94q0-38 19-64.5t49-41.5q51-26 120.5-43T360 676q62 0 131 " +
                "17t120 43q30 15 49.5 41.5T680 842v94H40Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "transcribe-icon";
    }
}
