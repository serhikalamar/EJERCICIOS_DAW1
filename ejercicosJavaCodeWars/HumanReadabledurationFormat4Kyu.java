public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int year = seconds / 31536000;
        int day = (seconds % 31536000) / 86400;
        int hour = (seconds % 86400) / 3600;
        int minute = (seconds % 3600) / 60;
        int second = seconds % 60;

        StringBuilder result = new StringBuilder();

        if (year > 0) {
            result.append(year).append(year > 1 ? " years" : " year");
        }

        if (day > 0) {
            if (result.length() > 0) {
                if (hour == 0 && minute == 0 && second == 0) {
                    result.append(" and ");
                } else {
                    result.append(", ");
                }
            }
            result.append(day).append(day > 1 ? " days" : " day");
        }

        if (hour > 0) {
            if (result.length() > 0) {
                if ((minute > 0 || second > 0) && (year > 0 || day > 0)) {
                    result.append(", ");
                } else if (minute == 0 && second == 0) {
                    result.append(" and ");
                } else {
                    result.append(", ");
                }
            }
            result.append(hour).append(hour > 1 ? " hours" : " hour");
        }

        if (minute > 0) {
            if (result.length() > 0) {
                if (second > 0 && (year > 0 || day > 0 || hour > 0)) {
                    result.append(", ");
                } else if (second == 0) {
                    result.append(" and ");
                } else {
                    result.append(", ");
                }
            }
            result.append(minute).append(minute > 1 ? " minutes" : " minute");
        }

        if (second > 0) {
            if (result.length() > 0) {
                result.append(" and ");
            }
            result.append(second).append(second > 1 ? " seconds" : " second");
        }

        return result.toString();
    }

}
