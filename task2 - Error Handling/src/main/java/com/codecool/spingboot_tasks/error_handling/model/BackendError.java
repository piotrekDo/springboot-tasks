package com.codecool.spingboot_tasks.error_handling.model;

public class BackendError {
    private String msg;
    private Level level;


    public BackendError(String msg, Level level) {
        this.msg = msg;
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

   public enum Level {
        INFO("Info"), WARN("Warning"), ERROR("Error");

        private final String message;

        public String getMessage() {
            return message;
        }

        Level(String message) {
            this.message = message;
        }
    }
}
