package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AppsOutageIcon extends SVGIcon {

    public AppsOutageIcon() {
        super(DEFAULT_SIZE * 1.25);
    }

    public AppsOutageIcon(double size) {
        super(size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M226 896q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 " +
                "19Zm0-254q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm0-254q-28 " +
                "0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm254 508q-28 " +
                "0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm0-254q-28 " +
                "0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 19Zm0-254q-28 " +
                "0-47-19t-19-47q0-28 19-47t47-19q6 0 12 1t11 3q-2 9-2.5 18t-.5 18q0 22 3.5 " +
                "42.5T514 379q-8 5-16.5 7t-17.5 2Zm280 108q-83 0-141.5-58.5T560 296q0-83 " +
                "58.5-141.5T760 96q83 0 141.5 58.5T960 296q0 83-58.5 141.5T760 496Zm-26 " +
                "400q-28 0-47-19t-19-47q0-28 19-47t47-19q28 0 47 19t19 47q0 28-19 47t-47 " +
                "19Zm0-254q-28 0-47-19t-19-47q0-9 2-17.5t7-16.5q20 7 40.5 10.5T760 556q9 0 " +
                "18-.5t18-2.5q2 5 3 11t1 12q0 28-19 47t-47 19Zm26-226q8 0 14-6t6-14q0-8-6-14t-14-6q-8 " +
                "0-14 6t-6 14q0 8 6 14t14 6Zm-20-80h40V176h-40v160Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "apps-outage-icon";
    }
}
