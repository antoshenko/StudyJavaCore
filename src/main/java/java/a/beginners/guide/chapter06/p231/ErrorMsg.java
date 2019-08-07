package main.java.java.a.beginners.guide.chapter06.p231;

// Returning an object of type String
class ErrorMsg {
    String msgs[] = {
            "Output error",
            "Input error",
            "Out of disk space",
            "Index out of range"
    };

    // Return error message
    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Non existing error code";
    }
}
