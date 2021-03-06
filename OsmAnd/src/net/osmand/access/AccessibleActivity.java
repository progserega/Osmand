package net.osmand.access;

import android.app.Activity;
import android.view.MotionEvent;

import com.actionbarsherlock.app.SherlockActivity;

// Provide some additional accessibility means for activity view elements.
//
// To make use of these capabilities simply derive your activity from this class
// and then add view elements you wish to be accessible
// to the accessibleContent list.
//
public class AccessibleActivity extends Activity implements AccessibleContent.Callback {

    // List of accessible views. Use accessibleContent.add(element)
    // to add element to it.
    public final AccessibleContent accessibleContent = new AccessibleContent(this);

    @Override
    public boolean dispatchNativeTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return accessibleContent.dispatchTouchEvent(event, this);
    }

}
