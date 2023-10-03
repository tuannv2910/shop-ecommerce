package shop.ecommerce.common.contraints;

public enum ResponseCode {
    OK(200, "Thành công !"),
    NO_CONTENT(204, "Không có dữ liệu !");
    private final int code;
    private final String message;
    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
