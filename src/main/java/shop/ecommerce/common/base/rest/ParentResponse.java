package shop.ecommerce.common.base.rest;

import shop.ecommerce.common.contraints.ResponseCode;

import java.sql.Timestamp;

public class ParentResponse {
    private int code;
    private String message;
    private Timestamp timestamp;
    public ParentResponse(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }
    public ParentResponse() {
        this.code = ResponseCode.OK.getCode();
        this.message = ResponseCode.OK.getMessage();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }
}
