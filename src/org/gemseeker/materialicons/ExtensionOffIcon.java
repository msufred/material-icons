package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ExtensionOffIcon extends SVGIcon {

    public ExtensionOffIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE);
    }

    public ExtensionOffIcon(double size) {
        super(size, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m813 995-59-59H570q-5-48-35.5-77.5T463 829q-41 0-71.5 29.5T356 936H180q-24 " +
                "0-42-18t-18-42V700q48-5 77.5-35.5T227 593q0-41-29.5-71.5T120 486V302l-59-59 43-43 752 " +
                "752-43 43Zm-7-179L240 250h117q11-40 39.5-67t68.5-27q40 0 68.5 27t39.5 67h173q24 0 42 " +
                "18t18 42v173q40 11 65.5 41.5T897 595q0 40-25.5 67T806 700v116Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "extension-off-icon";
    }
}
