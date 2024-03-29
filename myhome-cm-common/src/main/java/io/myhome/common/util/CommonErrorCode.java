package io.myhome.common.util;

/**
 * packageName    : io.myhome.common.util
 * fileName       : CommonErrorCode
 * author         : kimdonggyuuuuu
 * date           : 2022/06/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/06/27        kimdonggyuuuuu       최초 생성
 */
public enum CommonErrorCode implements ErrorCode {
    COMMON_ERROR("error.common"),
    PERMISSION_DENIED("error.permission.denied"),
    NETWORK_ERROR("error.network")
    ;

    private final String msg;

    CommonErrorCode(String msg) {
        this.msg = msg;
    }

    @Override
    public String getErrorCode() {
        return this.name();
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
