public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCalback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCalback) {
        this.callback = callback;
        this.errorCalback = errorCalback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCalback.onError("Task " + i + " is error");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}

