package com.qing.owl.auth.infra.common.utils;

import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static int createMilliSecond(int num1, int num2) {
        return random.nextInt(1000 + random.nextInt(9000));
    }
}
