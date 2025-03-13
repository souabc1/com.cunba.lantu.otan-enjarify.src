package androidx.core.app;

import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

class ActivityCompat$SharedElementCallback21Impl
  extends android.app.SharedElementCallback
{
  public final SharedElementCallback OooO00o;
  
  public ActivityCompat$SharedElementCallback21Impl(SharedElementCallback paramSharedElementCallback)
  {
    this.OooO00o = paramSharedElementCallback;
  }
  
  public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.OooO00o.OooO0O0(paramView, paramMatrix, paramRectF);
  }
  
  public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    return this.OooO00o.OooO0OO(paramContext, paramParcelable);
  }
  
  public void onMapSharedElements(List paramList, Map paramMap)
  {
    this.OooO00o.OooO0Oo(paramList, paramMap);
  }
  
  public void onRejectSharedElements(List paramList)
  {
    this.OooO00o.OooO0o0(paramList);
  }
  
  public void onSharedElementEnd(List paramList1, List paramList2, List paramList3)
  {
    this.OooO00o.OooO0o(paramList1, paramList2, paramList3);
  }
  
  public void onSharedElementStart(List paramList1, List paramList2, List paramList3)
  {
    this.OooO00o.OooO0oO(paramList1, paramList2, paramList3);
  }
  
  public void onSharedElementsArrived(List paramList1, List paramList2, SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
  {
    SharedElementCallback localSharedElementCallback = this.OooO00o;
    OooO00o localOooO00o = new androidx/core/app/OooO00o;
    localOooO00o.<init>(paramOnSharedElementsReadyListener);
    localSharedElementCallback.OooO0oo(paramList1, paramList2, localOooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityCompat.SharedElementCallback21Impl
 * JD-Core Version:    0.7.0.1
 */