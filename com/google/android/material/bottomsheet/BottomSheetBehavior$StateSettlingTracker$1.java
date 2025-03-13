package com.google.android.material.bottomsheet;

import androidx.customview.widget.ViewDragHelper;

class BottomSheetBehavior$StateSettlingTracker$1
  implements Runnable
{
  public BottomSheetBehavior$StateSettlingTracker$1(BottomSheetBehavior.StateSettlingTracker paramStateSettlingTracker) {}
  
  public void run()
  {
    Object localObject = this.this$1;
    boolean bool1 = false;
    BottomSheetBehavior localBottomSheetBehavior = null;
    BottomSheetBehavior.StateSettlingTracker.access$1702((BottomSheetBehavior.StateSettlingTracker)localObject, false);
    localObject = this.this$1.this$0.viewDragHelper;
    if (localObject != null)
    {
      bool1 = true;
      boolean bool2 = ((ViewDragHelper)localObject).OooOOO(bool1);
      if (bool2)
      {
        localObject = this.this$1;
        int i = BottomSheetBehavior.StateSettlingTracker.access$1800((BottomSheetBehavior.StateSettlingTracker)localObject);
        ((BottomSheetBehavior.StateSettlingTracker)localObject).continueSettlingToState(i);
        return;
      }
    }
    localObject = this.this$1;
    localBottomSheetBehavior = ((BottomSheetBehavior.StateSettlingTracker)localObject).this$0;
    int k = localBottomSheetBehavior.state;
    int m = 2;
    if (k == m)
    {
      int j = BottomSheetBehavior.StateSettlingTracker.access$1800((BottomSheetBehavior.StateSettlingTracker)localObject);
      localBottomSheetBehavior.setStateInternal(j);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
 * JD-Core Version:    0.7.0.1
 */