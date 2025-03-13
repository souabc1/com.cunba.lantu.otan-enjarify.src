package androidx.core.view.accessibility;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class AccessibilityClickableSpanCompat
  extends ClickableSpan
{
  public final int o00OoOoo;
  public final int o00Ooo0;
  public final AccessibilityNodeInfoCompat o00Ooo00;
  
  public AccessibilityClickableSpanCompat(int paramInt1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, int paramInt2)
  {
    this.o00OoOoo = paramInt1;
    this.o00Ooo00 = paramAccessibilityNodeInfoCompat;
    this.o00Ooo0 = paramInt2;
  }
  
  public void onClick(View paramView)
  {
    paramView = new android/os/Bundle;
    paramView.<init>();
    int i = this.o00OoOoo;
    paramView.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", i);
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = this.o00Ooo00;
    i = this.o00Ooo0;
    localAccessibilityNodeInfoCompat.OooOOO(i, paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityClickableSpanCompat
 * JD-Core Version:    0.7.0.1
 */