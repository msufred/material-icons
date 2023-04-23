package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AppRegistrationIcon extends SVGIcon {

    public AppRegistrationIcon() {
        super();
    }

    public AppRegistrationIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M226 896q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm0-254q-28 " +
                "0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm0-254q-28 0-47-19t-19-47q0-28 " +
                "19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm254 254q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 " +
                "47 19t19 47l-66 66Zm0-254q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 " +
                "19Zm-40 508v-65l243-243 65 65-243 243h-65Zm294-508q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 47 " +
                "19t19 47q0 28-19 47t-47 19Zm40 239-65-65 25-25q8-8 20-8.5t20 7.5l26 26q8 8 7.5 20t-8.5 20l-25 25Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "app-registration-icon";
    }
}
