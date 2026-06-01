package enums;

public enum FurColor {

    BLACK(1, "Black"),
    WHITE(2, "White"),
    ORANGE(3, "Orange"),
    GRAY(4, "Gray"),
    BROWN(5, "Brown"),
    BLACK-WHITE(6, "Black-White"),
    

    private final int code;
    private final String displayName;

    FurColor(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static FurColor fromCode(int code) {
        for (FurColor color : FurColor.values()) {
            if (color.getCode() == code) {
                return color;
            }
        }

        throw new IllegalArgumentException(
                "FurColor não encontrado para o código: " + code);
    }
}