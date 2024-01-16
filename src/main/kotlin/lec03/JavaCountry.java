package lec03;

public enum JavaCountry {

    KOREA("KO"),
    AMERICA("US");

    private final String code;

    JavaCountry(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    private static void handleCountry(JavaCountry country) {
        if (country == JavaCountry.KOREA) {
            // 로직 처리
        }

        if (country == JavaCountry.AMERICA) {
            // 로직 처리
        }
    }

}
