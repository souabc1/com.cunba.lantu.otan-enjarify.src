package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.ref.Reference;

class BottomSheetBehavior$StateSettlingTracker
{
  private final Runnable continueSettlingRunnable;
  private boolean isContinueSettlingRunnablePosted;
  private int targetState;
  
  private BottomSheetBehavior$StateSettlingTracker(BottomSheetBehavior paramBottomSheetBehavior)
  {
    paramBottomSheetBehavior = new com/google/android/material/bottomsheet/BottomSheetBehavior$StateSettlingTracker$1;
    paramBottomSheetBehavior.<init>(this);
    this.continueSettlingRunnable = paramBottomSheetBehavior;
  }
  
  public void continueSettlingToState(int paramInt)
  {
    Object localObject = this.this$0.viewRef;
    if (localObject != null)
    {
      localObject = ((Reference)localObject).get();
      if (localObject != null)
      {
        this.targetState = paramInt;
        paramInt = this.isContinueSettlingRunnablePosted;
        if (paramInt == 0)
        {
          View localView = (View)this.this$0.viewRef.get();
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
 * Qualified Name:     com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker
 * JD-Core Version:    0.7.0.1
 */