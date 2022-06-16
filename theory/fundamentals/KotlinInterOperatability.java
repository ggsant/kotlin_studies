package io.kotlin.fundamentals;

import java.util.logging.Logger;

public class KotlinInterOperatability {

    public static void main(String[] args) {
        var maximum = UnderstandingFunctions.maximum(2,6);
        UnderstandingFunctions.logMessages("Hello from Java to Kotlin");
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(maximum));
    }
}
