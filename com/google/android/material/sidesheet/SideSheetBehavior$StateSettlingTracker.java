package com.google.android.material.sidesheet;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.ref.Reference;

class SideSheetBehavior$StateSettlingTracker
{
  private final Runnable continueSettlingRunnable;
  private boolean isContinueSettlingRunnablePosted;
  private int targetState;
  
  public SideSheetBehavior$StateSettlingTracker(SideSheetBehavior paramSideSheetBehavior)
  {
    paramSideSheetBehavior = new com/google/android/material/sidesheet/OooO0o;
    paramSideSheetBehavior.<init>(this);
    this.continueSettlingRunnable = paramSideSheetBehavior;
  }
  
  public void continueSettlingToState(int paramInt)
  {
    Object localObject = SideSheetBehavior.access$100(this.this$0);
    if (localObject != null)
    {
      localObject = SideSheetBehavior.access$100(this.this$0).get();
      if (localObject != null)
      {
        this.targetState = paramInt;
        paramInt = this.isContinueSettlingRunnablePosted;
        if (paramInt == 0)
        {
          View localView = (View)SideSheetBehavior.access$100(this.this$0).get();
          localObject = this.continueSettlingRunnable;
          ViewCompat.o0OoOo0(localView, (Runnable)localObject);
          paramInt = 1;
          this.isContinueSettlingRunnablePosted = paramInt;
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.sidesheet.SideSheetBehavior.StateSettlingTracker
 * JD-Core Version:    0.7.0.1
 */