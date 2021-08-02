package com.grandtheft.grandtheftutils.keyboard;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @Author: 窦虎
 * @Date: 2021/7/31 19:36
 */
public enum KeyBoardEnum {

    F1(1, "F1"),
    F2(2, "F2"),
    F3(3, "F3"),
    F4(4, "F4"),
    F5(5, "F5"),
    F6(6, "F6"),
    F7(7, "F7"),
    F8(8, "F8"),
    F9(9, "F9"),
    F10(10, "F10"),
    F11(11, "F11"),
    F12(12, "F12")

    ;
    private int val;
    private String keyStr;

    KeyBoardEnum(int val, String keyStr) {
        this.val = val;
        this.keyStr = keyStr;
    }

    KeyBoardEnum() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getKeyStr() {
        return keyStr;
    }

    public void setKeyStr(String keyStr) {
        this.keyStr = keyStr;
    }

    private static Map<Integer, KeyBoardEnum> map = new HashMap<Integer, KeyBoardEnum>();

    static {
        for (KeyBoardEnum boardEnum : KeyBoardEnum.values()) {
            map.put(boardEnum.val, boardEnum);
        }
    }

    public static KeyBoardEnum getKeyBoardEnumByMarkCode(int markCode) {
        return map.get(markCode);
    }
}
