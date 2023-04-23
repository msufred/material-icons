package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FilterListOffIcon extends SVGIcon {

    public FilterListOffIcon() {
        super(DEFAULT_SIZE * 1.25);
    }

    public FilterListOffIcon(double size) {
        super(size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M813 995 61 243l43-43 752 752-43 43ZM120 396v-60h94v60h-94Zm120 " +
                "210v-60h184v60H240Zm145-210-60-60h515v60H385Zm15 420v-60h160v60H400Zm195-210-60-60h185v60H595Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "filter-list-off-icon";
    }
}
