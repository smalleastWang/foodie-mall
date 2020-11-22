package com.smalleast.utils;


import org.springframework.util.ObjectUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期工具类
 */
public class DateUtils {

    public final static String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public final static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    public final static String SHORT_TIME_FORMAT = "yyyy-MM-dd HH:mm";

    public final static DateFormat DEFAULT_TIME_FORMATER = new SimpleDateFormat(DEFAULT_TIME_FORMAT);

    public final static DateFormat DEFAULT_DATE_FORMATER = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

    public final static DateFormat SHORT_TIME_FORMATER = new SimpleDateFormat(SHORT_TIME_FORMAT);

    private final static Map<String, Integer> CALENDAR = new HashMap<String, Integer>() {{
        put("y", Calendar.YEAR);
        put("m", Calendar.MONTH);
        put("d", Calendar.DATE);
        put("h", Calendar.HOUR);
        put("n", Calendar.MINUTE);
        put("s", Calendar.SECOND);
        put("ms", Calendar.MILLISECOND);
    }};

    /**
     * date 转换为 日期字符转 yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        if (date == null) {
            return "";
        }
        return DEFAULT_DATE_FORMATER.format(date);
    }

    /**
     * date 根据指定格式进行转换
     *
     * @param date
     * @param format
     * @return
     */
    public static String formatDate(Date date, String format) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * Date 转 字符串 yyyy-MM-dd HH:mm
     *
     * @param date
     * @return
     */
    public static String formatShortTime(Date date) {
        if (date == null) {
            return null;
        }
        return SHORT_TIME_FORMATER.format(date);
    }

    /**
     * date 转换为 日期字符转 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String formatTime(Date date) {
        if (date == null) {
            return null;
        }
        return DEFAULT_TIME_FORMATER.format(date);
    }

    /**
     * 获取当前字符串日期  yyyy-MM-dd
     *
     * @return
     */
    public static String formatDateNow() {
        return formatDate(new Date());
    }

    /**
     * 获取当前字符串日期  yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String formatTimeNow() {
        return formatTime(new Date());
    }

    /**
     * 字符串 转 Date
     *
     * @param date
     * @param df   需要转换的格式
     * @return
     */
    public static Date parseDate(String date, DateFormat df) {
        if (date == null) {
            return null;
        }
        try {
            return df.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 字符串 转 Date
     *
     * @param date
     * @param df   需要转换的格式
     * @return
     */
    public static Date parseTime(String date, DateFormat df) {
        if (date == null) {
            return null;
        }
        try {
            return df.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 字符串 转 Date 格式为：yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static Date parseDate(String date) {
        return parseDate(date, DEFAULT_DATE_FORMATER);
    }

    /**
     * 字符串 转 Date 格式为自定义
     *
     * @param date
     * @param format
     * @return
     */
    public static Date parseDate(String date, String format) {
        if (ObjectUtils.isEmpty(date)) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对日期的加减 神操作
     *
     * @param date     日期
     * @param interval 指定操作类型
     * @param number   加减的范围
     * @param format   需要转换的格式 可以是字符串 也可以是 SimpleDateFormat 类型
     * @param isDate   指定返回类型可选参数 yes 代表返回Date类型
     * @return String || Date
     */
    public static Object DatePeration(Object date, String interval, Integer number, Object format, String... isDate) {
        try {
            Date newDate = null;
            String temporaryDate = null;
            if (format instanceof SimpleDateFormat) {
                if (date instanceof Date) {
                    newDate = parseDate(((SimpleDateFormat) format).format(date), ((SimpleDateFormat) format));
                }
                if (date instanceof String) {
                    newDate = parseDate((String) date, (SimpleDateFormat) format);
                }
            }
            if (format instanceof String) {
                if (date instanceof Date) {
                    newDate = parseDate(new SimpleDateFormat((String) format).format(date), (String) format);
                }
                if (date instanceof String) {
                    newDate = parseDate((String) date, (String) format);
                }
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(newDate);
            calendar.add(CALENDAR.get(interval), number);
            newDate = calendar.getTime();
            if (!ObjectUtils.isEmpty(isDate)) {
                return newDate;
            }
            if (format instanceof String) {
                return new SimpleDateFormat((String) format).format(newDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(DatePeration("2019-11-05 18:00:00", "y", 1, "yyyy-MM-dd HH:mm:ss"));
        System.out.println(DatePeration(new Date(), "y", 1, "yyyy-MM-dd"));
        System.out.println(DatePeration("2019-11-05 18:00:00", "y", 1, DateUtils.DEFAULT_TIME_FORMAT));
        System.out.println(DatePeration(new Date(), "y", 1, DateUtils.DEFAULT_TIME_FORMAT));
        System.out.println(DatePeration(new Date(), "m", 1, DateUtils.DEFAULT_TIME_FORMAT));

    }


}