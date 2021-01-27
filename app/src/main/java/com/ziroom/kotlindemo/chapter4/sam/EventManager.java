package com.ziroom.kotlindemo.chapter4.sam;

import java.util.HashSet;

public class EventManager {
    interface OnEventListener {
        void onEvent(int event);
    }

    private HashSet<OnEventListener> onEventListeners = new HashSet<>();

    public void addOnEventListener(OnEventListener onEventListener) {
        onEventListeners.add(onEventListener);
    }

    public void removeOnEventListener(OnEventListener onEventListener) {
        onEventListeners.remove(onEventListener);
    }
}
