package com.qing.owl.auth.infra.common.utils;

import java.util.Random;

public class BusinessCodeGenUtils {
    private static final Random random = new Random();

    public static int genFourBitRandomNum() {
        return random.nextInt(1000 + random.nextInt(9000));
    }

    public static int genUserCode() {
        return random.nextInt(1000 + random.nextInt(9000));
    }
}
