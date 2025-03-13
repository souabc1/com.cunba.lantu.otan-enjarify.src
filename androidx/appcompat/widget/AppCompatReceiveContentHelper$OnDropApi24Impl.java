package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ViewCompat;

final class AppCompatReceiveContentHelper$OnDropApi24Impl
{
  public static boolean OooO00o(DragEvent paramDragEvent, TextView paramTextView, Activity paramActivity)
  {
    paramActivity.requestDragAndDropPermissions(paramDragEvent);
    float f1 = paramDragEvent.getX();
    float f2 = paramDragEvent.getY();
    int i = paramTextView.getOffsetForPosition(f1, f2);
    paramTextView.beginBatchEdit();
    try
    {
      Object localObject = paramTextView.getText();
      localObject = (Spannable)localObject;
      Selection.setSelection((Spannable)localObject, i);
      paramActivity = new androidx/core/view/ContentInfoCompat$Builder;
      paramDragEvent = paramDragEvent.getClipData();
      int j = 3;
      f2 = 4.203895E-045F;
      paramActivity.<init>(paramDragEvent, j);
      paramDragEvent = paramActivity.OooO00o();
      ViewCompat.OoooooO(paramTextView, paramDragEvent);
      return true;
    }
    finally
    {
      paramTextView.endBatchEdit();
    }
  }
  
  public static boolean OooO0O0(DragEvent paramDragEvent, View paramView, Activity paramActivity)
  {
    paramActivity.requestDragAndDropPermissions(paramDragEvent);
    paramActivity = new androidx/core/view/ContentInfoCompat$Builder;
    paramDragEvent = paramDragEvent.getClipData();
    paramActivity.<init>(paramDragEvent, 3);
    paramDragEvent = paramActivity.OooO00o();
    ViewCompat.OoooooO(paramView, paramDragEvent);
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl
 * JD-Core Version:    0.7.0.1
 */