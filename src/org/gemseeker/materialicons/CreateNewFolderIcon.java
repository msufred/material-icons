package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CreateNewFolderIcon extends SVGIcon {

    public CreateNewFolderIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public CreateNewFolderIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M570 736h60v-90h90v-60h-90v-90h-60v90h-90v60h90v90ZM141 896q-24 0-42-18.5T81 836V316q0-23 " +
                "18-41.5t42-18.5h280l60 60h340q23 0 41.5 18.5T881 376v460q0 23-18.5 41.5T821 896H141Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "create-new-folder-icon";
    }
}
