package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FileUploadOffIcon extends SVGIcon {

    public FileUploadOffIcon() {
        super();
    }

    public FileUploadOffIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m480 256 193 193-43 43-120-120v148l-60-60v-88l-44 44-43-43 117-117Zm-376-56 752 752-43 " +
                "43-99-99H220q-24 0-42-18t-18-42V693h60v143h434L61 243l43-43Zm346 543V546l60 60v137h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "file-upload-off-icon";
    }
}
