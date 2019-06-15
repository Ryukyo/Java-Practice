package com.flo;

public class Main {
    private static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(300L));

            }
    private static String getDurationString (long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 60))) {
            return INVALID_VALUE_MESSAGE;
            }

                long hours = minutes/60;
                long remainingMinutes = minutes % 60;
                return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
        private static String getDurationString (long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
            }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
        }

}

