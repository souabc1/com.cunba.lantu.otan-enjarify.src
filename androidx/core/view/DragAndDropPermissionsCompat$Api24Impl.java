package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

class DragAndDropPermissionsCompat$Api24Impl
{
  public static void OooO00o(DragAndDropPermissions paramDragAndDropPermissions)
  {
    paramDragAndDropPermissions.release();
  }
  
  public static DragAndDropPermissions OooO0O0(Activity paramActivity, DragEvent paramDragEvent)
  {
    return paramActivity.requestDragAndDropPermissions(paramDragEvent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.DragAndDropPermissionsCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */