package main.java.java.a.beginners.guide.chapter06.p232;

class ErrorInfo {
    String msgs[] = {
            "Output error",
            "Input error",
            "Out of disk space",
            "Index out of range"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Non existing error code", 0);
    }
}
