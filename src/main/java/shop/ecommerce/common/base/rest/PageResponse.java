package shop.ecommerce.common.base.rest;

import shop.ecommerce.common.contraints.ResponseCode;

import java.sql.Timestamp;

public class PageResponse {
    private int code;
    private String message;
    private Timestamp timestamp;
    private int page;
    private int pageSize;
    private int totalPage;
    private int totalElement;
    public PageResponse(ResponseCode responseCode, int page, int pageSize, int totalPage, int totalElement) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.page = page;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalElement = totalElement;
    }
    public PageResponse(int page, int pageSize, int totalPage, int totalElement) {
        this.code = ResponseCode.OK.getCode();
        this.message = ResponseCode.OK.getMessage();
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.page = page;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalElement = totalElement;
    }

    public PageResponse( boolean isEmpty) {
        if(!isEmpty) {
            this.code = ResponseCode.NO_CONTENT.getCode();
            this.message = ResponseCode.NO_CONTENT.getMessage();
            this.timestamp = new Timestamp(System.currentTimeMillis());
            this.page = 0;
            this.pageSize = 0;
            this.totalPage = 0;
            this.totalElement = 0;        }
    }

}
