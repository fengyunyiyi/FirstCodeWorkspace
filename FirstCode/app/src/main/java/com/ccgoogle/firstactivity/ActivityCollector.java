package com.ccgoogle.firstactivity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjunlong on 2016/12/21.
 */

public class ActivityCollector {

    private static List<Activity> list = new ArrayList<>();

    public static void addActivity(Activity activity) {
        list.add(activity);
    }

    public static void removeActivity(Activity activity) {
        list.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : list) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
