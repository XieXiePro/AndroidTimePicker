package xp.timepicker.com.widget.listener;


import xp.timepicker.com.widget.bean.DateBean;
import xp.timepicker.com.widget.bean.DateType;

public interface WheelPickerListener {
    void onSelect(DateType type, DateBean bean);
}
