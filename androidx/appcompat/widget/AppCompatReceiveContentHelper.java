package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ViewCompat;

final class AppCompatReceiveContentHelper
{
  public static boolean OooO00o(View paramView, DragEvent paramDragEvent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i < j)
    {
      Object localObject = paramDragEvent.getLocalState();
      if (localObject == null)
      {
        localObject = ViewCompat.OooOooO(paramView);
        if (localObject != null)
        {
          localObject = OooO0OO(paramView);
          if (localObject == null)
          {
            paramDragEvent = new java/lang/StringBuilder;
            paramDragEvent.<init>();
            paramDragEvent.append("Can't handle drop: no activity: view=");
            paramDragEvent.append(paramView);
            return false;
          }
          j = paramDragEvent.getAction();
          int k = 1;
          if (j == k) {
            return paramView instanceof TextView ^ k;
          }
          j = paramDragEvent.getAction();
          k = 3;
          if (j == k)
          {
            boolean bool1 = paramView instanceof TextView;
            boolean bool2;
            if (bool1)
            {
              paramView = (TextView)paramView;
              bool2 = AppCompatReceiveContentHelper.OnDropApi24Impl.OooO00o(paramDragEvent, paramView, (Activity)localObject);
            }
            else
            {
              bool2 = AppCompatReceiveContentHelper.OnDropApi24Impl.OooO0O0(paramDragEvent, paramView, (Activity)localObject);
            }
            return bool2;
          }
        }
      }
    }
    return false;
  }
  
  public static boolean OooO0O0(TextView paramTextView, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    int k = 0;
    if (i < j)
    {
      String[] arrayOfString = ViewCompat.OooOooO(paramTextView);
      if (arrayOfString != null)
      {
        i = 16908322;
        if (paramInt != i)
        {
          j = 16908337;
          if (paramInt != j) {}
        }
        else
        {
          Object localObject = paramTextView.getContext();
          String str = "clipboard";
          localObject = (ClipboardManager)((Context)localObject).getSystemService(str);
          if (localObject == null)
          {
            j = 0;
            localObject = null;
          }
          else
          {
            localObject = ((ClipboardManager)localObject).getPrimaryClip();
          }
          int m = 1;
          if (localObject != null)
          {
            int n = ((ClipData)localObject).getItemCount();
            if (n > 0)
            {
              ContentInfoCompat.Builder localBuilder = new androidx/core/view/ContentInfoCompat$Builder;
              localBuilder.<init>((ClipData)localObject, m);
              if (paramInt != i) {
                k = m;
              }
              ContentInfoCompat localContentInfoCompat = localBuilder.OooO0OO(k).OooO00o();
              ViewCompat.OoooooO(paramTextView, localContentInfoCompat);
            }
          }
          return m;
        }
      }
    }
    return false;
  }
  
  public static Activity OooO0OO(View paramView)
  {
    for (paramView = paramView.getContext();; paramView = ((ContextWrapper)paramView).getBaseContext())
    {
      boolean bool = paramView instanceof ContextWrapper;
      if (!bool) {
        break;
      }
      bool = paramView instanceof Activity;
      if (bool) {
        return (Activity)paramView;
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatReceiveContentHelper
 * JD-Core Version:    0.7.0.1
 */